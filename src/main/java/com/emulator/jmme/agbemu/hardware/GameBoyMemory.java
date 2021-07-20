package com.emulator.jmme.agbemu.hardware;

import com.emulator.jmme.base.hardware.Memory;

import java.util.HashMap;
import java.util.Map;

public class GameBoyMemory implements Memory {
    private Map<Integer, Short> addresses;

    public GameBoyMemory() {
        this.addresses = new HashMap<>();

        for (int i = 0; i <= 0xFFFF; i++) {
            addresses.put(i, (short)0);
        }
    }

    public Map<Integer, Short> getAddresses() {
        return addresses;
    }

    public void setAddresses(Map<Integer, Short> addresses) {
        this.addresses = addresses;
    }
}
