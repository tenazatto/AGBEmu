package com.emulator.jmme.agbemu.hardware;

import com.emulator.jmme.agbemu.cartridge.gb.GameBoyCartridge;
import com.emulator.jmme.base.hardware.Bus;

public class GameBoyBus implements Bus {
    GameBoyCPU cpu;
    GameBoyMemory memory;
    GameBoyCartridge cartridge;

    public GameBoyBus(GameBoyCPU cpu,
                      GameBoyMemory memory) {
        this.cpu = cpu;
        this.memory = memory;
    }

    public void setCartridge(GameBoyCartridge cartridge) {
        this.cartridge = cartridge;
    }

    public byte read_cartridge(int address) {
        if (address < 0) {
            address = 0xFFFF + address;
        }

        return this.cartridge.getContent()[address];
    }

    public byte read_memory(short address) {
        return this.memory.getAddresses().get(address);
    }

    public void write_memory(short address, byte value) {
        this.memory.getAddresses().put(address, value);
    }
}
