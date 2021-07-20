package com.emulator.jmme.base.hardware;

import com.emulator.jmme.base.instructions.Opcode;

public interface CPU {
    short fetch(Bus bus);
    Opcode decode(short instValue);
    void execute(Bus bus, Opcode opcode);

    void pipeline(Bus bus);
}
