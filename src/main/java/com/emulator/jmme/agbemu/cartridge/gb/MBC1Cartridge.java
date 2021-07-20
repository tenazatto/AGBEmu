package com.emulator.jmme.agbemu.cartridge.gb;

public class MBC1Cartridge extends GameBoyCartridge {
    public MBC1Cartridge(CartridgeType type, byte[] bytes) {
        super(bytes);
        this.type = type;
    }
}
