package com.emulator.jmme.agbemu.cartridge.factory;

import com.emulator.jmme.agbemu.cartridge.gb.CartridgeType;
import com.emulator.jmme.agbemu.cartridge.gb.GameBoyCartridge;
import com.emulator.jmme.agbemu.cartridge.gb.MBC1Cartridge;

public class GameBoyCartridgeFactory {
    public static GameBoyCartridge makeCartridge(byte[] allBytes){
        GameBoyCartridge cartridge = null;
        CartridgeType type = CartridgeType.getFromValue(allBytes[0x0147]);

        switch (type) {
            case ROM_MBC1:
            case ROM_MBC1_RAM:
            case ROM_MBC1_RAM_BATT:
                cartridge = new MBC1Cartridge(type, allBytes);
                break;
        }

        return cartridge;
    }
}
