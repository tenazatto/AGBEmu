package com.emulator.jmme.agbemu.hardware;

import com.emulator.jmme.base.hardware.Memory;

import java.util.HashMap;
import java.util.Map;

public class GameBoyMemory implements Memory {
    private Map<Short, Byte> addresses;

    public GameBoyMemory() {
        this.addresses = new HashMap<>();

        for (int i = 0; i <= 0xFFFF; i++) {
            addresses.put((short)i, (byte)0);
        }
    }

    public Map<Short, Byte> getAddresses() {
        return addresses;
    }

    public void setAddresses(Map<Short, Byte> addresses) {
        this.addresses = addresses;
    }
}
