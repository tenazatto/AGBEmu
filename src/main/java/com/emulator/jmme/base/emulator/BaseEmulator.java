package com.emulator.jmme.base.emulator;

import com.emulator.jmme.base.hardware.Bus;
import com.emulator.jmme.base.hardware.CPU;
import com.emulator.jmme.base.hardware.Memory;

import java.io.File;

public abstract class BaseEmulator implements Emulator{
    protected CPU cpu;
    protected Memory memory;
    protected Bus bus;

    public BaseEmulator(CPU cpu,
                        Memory memory,
//                        GPU gpu,
//                        List<Device> devices,
                        Bus bus){
        this.cpu = cpu;
        this.memory = memory;
        this.bus = bus;
    }

    @Override
    public void init(File cartridge) {
        System.out.println(cartridge);
    }

    @Override
    public void init(String cartridgePath) {
        this.init(new File(cartridgePath));
    }
}
