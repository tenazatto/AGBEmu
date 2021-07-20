package com.emulator.jmme.agbemu.hardware;

import com.emulator.jmme.agbemu.utils.GameBoyUtils;
import com.emulator.jmme.base.hardware.Bus;
import com.emulator.jmme.base.hardware.CPU;
import com.emulator.jmme.base.instructions.Opcode;
import com.emulator.jmme.agbemu.instructions.GameBoyInstructions;
import com.emulator.jmme.agbemu.instructions.GameBoyOpcode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GameBoyCPU implements CPU {
    private static final Logger logger
            = LoggerFactory.getLogger(GameBoyCPU.class);

    GameBoyRegisters registers;
    GameBoyInstructions instructions;
    GameBoyCPUState cpuState;

    public GameBoyCPU(GameBoyRegisters registers,
                      GameBoyInstructions instructions,
                      GameBoyCPUState cpuState){
        this.registers = registers;
        this.instructions = instructions;
    }

    public GameBoyRegisters getRegisters() {
        return registers;
    }

    @Override
    public short fetch(Bus bus) {
        GameBoyBus gameBoyBus = (GameBoyBus) bus;

        return (short) (gameBoyBus.read_cartridge(this.registers.getPC()) & 0xFF);
    }

    @Override
    public Opcode decode(short instValue) {
        if(GameBoyCPUState.TWO_BYTE_OPCODE.equals(this.cpuState)) {
            this.cpuState = GameBoyCPUState.OPCODE;
            return GameBoyOpcode.getFromValue(GameBoyOpcode.TWO_BYTE.getOpcode() << 8 | instValue);
        }

        return GameBoyOpcode.getFromValue(instValue);
    }

    @Override
    public void execute(Bus bus, Opcode opcode) {
        //Execute instruction
        GameBoyBus gameBoyBus = (GameBoyBus) bus;
        GameBoyOpcode gameBoyOpcode = (GameBoyOpcode) opcode;
        logger.info("Operation code: {}", gameBoyOpcode.name());

        if(GameBoyOpcode.TWO_BYTE.equals(gameBoyOpcode)) {
            this.cpuState = GameBoyCPUState.TWO_BYTE_OPCODE;
        } else {
            executeInstruction(gameBoyBus, gameBoyOpcode);
        }
    }

    private void executeInstruction(GameBoyBus gameBoyBus, GameBoyOpcode gameBoyOpcode) {
        try {
            Method instruction = Arrays.stream(this.instructions.getClass().getMethods())
                    .filter(method -> gameBoyOpcode.name().equals(method.getName()))
                    .findFirst().get();

            List params = GameBoyUtils.getInstructionParams(this.registers,
                    gameBoyBus, gameBoyOpcode, instruction);

            if (params.size() > 0) {
                instruction.invoke(this.instructions, params.toArray());
            } else {
                instruction.invoke(this.instructions);
            }

            this.registers.setPC((short)(this.registers.getPC() + 1));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

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
                    registers.setPC((short)(registers.getPC() + 2));
                } else if (gameBoyOpcode.name().contains("n")) {
                    int n = gameBoyBus.read_cartridge(registers.getPC() + 1) & 0xFF;
                    params.add(n);
                    registers.setPC((short)(registers.getPC() + 1));
                }
            } else if (GameBoyRegisters.class.equals(paramType)) {
                params.add(registers);
            }
        });
        return params;
    }

    @Override
    public void pipeline(Bus bus) {
        short instruction = this.fetch(bus);
        Opcode opcode = this.decode(instruction);
        this.execute(bus, opcode);
    }
}
