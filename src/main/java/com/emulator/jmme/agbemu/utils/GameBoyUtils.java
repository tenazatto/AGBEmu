package com.emulator.jmme.agbemu.utils;

import com.emulator.jmme.agbemu.hardware.GameBoyBus;
import com.emulator.jmme.agbemu.hardware.GameBoyRegisters;
import com.emulator.jmme.agbemu.instructions.GameBoyOpcode;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GameBoyUtils {
    public static List getInstructionParams(GameBoyRegisters registers, GameBoyBus gameBoyBus,
                                             GameBoyOpcode gameBoyOpcode,
                                             Method instruction) {
        List params = new ArrayList<>();
        Arrays.stream(instruction.getParameterTypes()).forEach(paramType -> {
            if(int.class.equals(paramType)) {
                if (gameBoyOpcode.name().contains("nn")) {
                    int nLow = gameBoyBus.read_cartridge(registers.getPC() + 1) & 0xFF;
                    int nHigh = gameBoyBus.read_cartridge(registers.getPC() + 2) & 0xFF;
                    int address = nLow + (nHigh << 8);
                    params.add(address);
                    registers.setPC(registers.getPC() + 2);
                } else if (gameBoyOpcode.name().contains("n")) {
                    int n = gameBoyBus.read_cartridge(registers.getPC() + 1) & 0xFF;
                    params.add(n);
                    registers.setPC(registers.getPC() + 1);
                }
            } else if (GameBoyRegisters.class.equals(paramType)) {
                params.add(registers);
            }
        });
        return params;
    }
}
