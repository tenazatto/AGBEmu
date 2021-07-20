package com.emulator.jmme;

import com.emulator.jmme.agbemu.hardware.*;
import com.emulator.jmme.base.emulator.Emulator;
import com.emulator.jmme.agbemu.emulator.GameBoyEmulator;
import com.emulator.jmme.agbemu.instructions.GameBoyInstructions;

public class Main {
    public static void main (String[] args) {
        GameBoyRegisters gameBoyRegisters = new GameBoyRegisters();
        GameBoyInstructions gameBoyInstructions = new GameBoyInstructions();
        GameBoyCPU gameBoyCPU = new GameBoyCPU(gameBoyRegisters, gameBoyInstructions, GameBoyCPUState.OPCODE);

        GameBoyMemory gameBoyMemory = new GameBoyMemory();
        GameBoyBus gameBoyBus = new GameBoyBus(gameBoyCPU, gameBoyMemory);
        Emulator agbemu = new GameBoyEmulator(gameBoyCPU, gameBoyMemory, gameBoyBus);

        agbemu.init("/home/thales.nazatto/IdeaProjects/AGBEmu/src/main/resources/cpu_instrs.gb");
    }
}
