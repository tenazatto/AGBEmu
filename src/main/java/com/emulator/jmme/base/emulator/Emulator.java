package com.emulator.jmme.base.emulator;

import java.io.File;

public interface Emulator {
    void init(File cartridge);

    void init(String cartridgePath);
}
