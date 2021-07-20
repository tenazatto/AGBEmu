package com.emulator.jmme.agbemu.cartridge.gb;

import com.emulator.jmme.base.cartridge.Cartridge;
import com.google.common.primitives.Bytes;

import java.math.BigInteger;

public abstract class GameBoyCartridge implements Cartridge {
    byte[] content;

    CartridgeType type;
    String title;
    boolean gameBoyColor;
    boolean superGameBoy;

    public GameBoyCartridge(byte[] bytes) {
        this.content = bytes;
        for(int i = 0x0134; i <= 0x0142; i++) {
            this.title += (char) bytes[i];
        }
        gameBoyColor = bytes[0x0143] == 0x80;
        superGameBoy = bytes[0x0146] == 0x03;
    }

    public byte[] getContent() {
        return content;
    }

    public void testPrint(){
        System.out.println(type);
        System.out.println(title);
        for(int i = 0x0100; i <= 0x0103; i++) {
            System.out.println(new BigInteger(1, new byte[]{content[i]}).toString(16).toUpperCase());
        }

        for(int i = 0x0104; i <= 0x0133; i++) {
            System.out.print(new BigInteger(1, new byte[]{content[i]}).toString(16).toUpperCase());
            System.out.print(" ");
        }
        System.out.println();

        for(int i = 0x3706; i <= 0xFF00; i++) {
            System.out.print(new BigInteger(1, new byte[]{content[i]}).toString(16).toUpperCase());
            System.out.print(" ");
        }
        System.out.println();

        Bytes.asList(content).stream().forEach(aByte -> {
            System.out.print(new BigInteger(1, new byte[]{ aByte }).toString(16).toUpperCase());
            System.out.print(" ");
        });
    }
}
