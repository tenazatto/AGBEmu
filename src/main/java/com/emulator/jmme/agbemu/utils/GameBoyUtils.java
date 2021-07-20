package com.emulator.jmme.agbemu.utils;

import com.emulator.jmme.agbemu.hardware.GameBoyBus;
import com.emulator.jmme.agbemu.hardware.GameBoyRegisters;
import com.emulator.jmme.agbemu.instructions.GameBoyOpcode;
import com.google.common.base.Strings;

import java.lang.reflect.Method;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GameBoyUtils {
    public static List getInstructionParams(GameBoyRegisters registers, GameBoyBus gameBoyBus,
                                             GameBoyOpcode gameBoyOpcode,
                                             Method instruction) {
        List params = new ArrayList<>();
        Arrays.stream(instruction.getParameterTypes()).forEach(paramType -> {
            if (short.class.equals(paramType)) {
//                if (gameBoyOpcode.name().contains("nn")) {
                byte nLow = gameBoyBus.read_cartridge(registers.getPC() + 1);
                byte nHigh = gameBoyBus.read_cartridge(registers.getPC() + 2);
                short address = (short)(((nHigh & 0xFF) << 8) | (nLow & 0xFF));
                params.add(address);
                registers.setPC((short) (registers.getPC() + 2));
//                }
            } else if (byte.class.equals(paramType)) {
//                else if (gameBoyOpcode.name().contains("n")) {
                byte n = gameBoyBus.read_cartridge(registers.getPC() + 1);
                params.add(n);
                registers.setPC((short) (registers.getPC() + 1));
//                }
            } else if (GameBoyRegisters.class.equals(paramType)) {
                params.add(registers);
            } else if (GameBoyBus.class.equals(paramType)) {
                params.add(gameBoyBus);
            }
        });
        return params;
    }

    public static String byteValue(Object value) {
        String hexString = new BigInteger(String.valueOf(value)).toString(2).toUpperCase();
        return "0b" + Strings.padStart(hexString, 8, '0');
    }

    public static String hexValue(Object value) {
        String hexString = null;

        if (value instanceof Byte && ((Byte) value).intValue() < 0) {
            hexString = new BigInteger(String.valueOf(0x100 + ((Byte) value).intValue())).toString(16).toUpperCase();
        } else if (value instanceof Short && ((Short) value).intValue() < 0) {
            hexString = new BigInteger(String.valueOf(0x10000 + ((Short) value).intValue())).toString(16).toUpperCase();
        } else if (value instanceof Integer && ((Integer) value).intValue() < 0) {
               hexString = new BigInteger(String.valueOf(0x10000 + ((Integer) value).intValue())).toString(16).toUpperCase();
        } else {
            hexString = new BigInteger(String.valueOf(value)).toString(16).toUpperCase();
        }

        return "0x" + Strings.padStart(hexString, 4, '0');
    }
}
