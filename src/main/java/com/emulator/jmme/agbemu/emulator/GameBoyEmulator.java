package com.emulator.jmme.agbemu.emulator;

import com.emulator.jmme.agbemu.cartridge.factory.GameBoyCartridgeFactory;
import com.emulator.jmme.agbemu.cartridge.gb.GameBoyCartridge;
import com.emulator.jmme.base.emulator.BaseEmulator;
import com.emulator.jmme.agbemu.hardware.GameBoyBus;
import com.emulator.jmme.agbemu.hardware.GameBoyCPU;
import com.emulator.jmme.agbemu.hardware.GameBoyMemory;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GameBoyEmulator extends BaseEmulator {
    public GameBoyEmulator(GameBoyCPU cpu, GameBoyMemory memory, GameBoyBus bus) {
        super(cpu, memory, bus);
    }

    @Override
    public void init(File cartridge) {
        try {
            byte[] allBytes = Files.readAllBytes(Paths.get(cartridge.getPath()));

            GameBoyCartridge gameBoyCartridge = GameBoyCartridgeFactory.makeCartridge(allBytes);
            ((GameBoyBus)bus).setCartridge(gameBoyCartridge);
            ((GameBoyCPU)cpu).getRegisters().setPC(0x0100);
            ((GameBoyCPU)cpu).getRegisters().setSP(0xFFFE);
            gameBoyCartridge.testPrint();
            while (true) {
                cpu.pipeline(bus);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
