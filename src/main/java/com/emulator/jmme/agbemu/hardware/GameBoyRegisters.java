package com.emulator.jmme.agbemu.hardware;

public class GameBoyRegisters {
    private byte A;
    private byte B;
    private byte C;
    private byte D;
    private byte E;
    private byte F;
    private byte H;
    private byte L;
    private short SP;
    private short PC;

    public GameBoyRegisters() {
        A = 0b00000000;
        B = 0b00000000;
        C = 0b00000000;
        D = 0b00000000;
        E = 0b00000000;
        F = 0b00000000;
        H = 0b00000000;
        L = 0b00000000;
        SP = 0x0000;
        PC = 0x0000;
    }

    public GameBoyRegisters(byte a, byte b, byte c, byte d, byte e, byte f, byte h, byte l, short SP, short PC) {
        A = a;
        B = b;
        C = c;
        D = d;
        E = e;
        F = f;
        H = h;
        L = l;
        this.SP = SP;
        this.PC = PC;
    }

    public byte getA() {
        return A;
    }

    public void setA(byte a) {
        A = a;
    }

    public byte getF() {
        return F;
    }

    public void setF(byte f) {
        F = f;
    }

    public short getAF() {
        return (short)(A << 8 | F);
    }

    public void setAF(short af) {
        A = (byte)(af >> 8);
        F = (byte)(af << 8 >> 8);
    }

    public boolean getCFlag() {
        return (F << 3 >> 7) == 1;
    }

    public void setCFlag(boolean cFlag) {
        F = (byte) ((cFlag) ? F | 0b00010000 : F & 0b11101111);
    }

    public boolean getHFlag() {
        return (F << 2 >> 7) == 1;
    }

    public void setHFlag(boolean hFlag) {
        F = (byte) ((hFlag) ? F | 0b00100000 : F & 0b11011111);
    }

    public boolean getNFlag() {
        return (F << 1 >> 7) == 1;
    }

    public void setNFlag(boolean nFlag) {
        F = (byte) ((nFlag) ? F | 0b01000000 : F & 0b10111111);
    }

    public boolean getZFlag() {
        return (F >> 7) == 1;
    }

    public void setZFlag(boolean zFlag) {
        F = (byte) ((zFlag) ? F | 0b10000000 : F & 0b01111111);
    }

    public byte getB() {
        return B;
    }

    public void setB(byte b) {
        B = b;
    }

    public byte getC() {
        return C;
    }

    public void setC(byte c) {
        C = c;
    }

    public short getBC() {
        return (short)(B << 8 | C);
    }

    public void setBC(short bc) {
        B = (byte)(bc >> 8);
        C = (byte)(bc << 8 >> 8);
    }

    public byte getD() {
        return D;
    }

    public void setD(byte d) {
        D = d;
    }

    public byte getE() {
        return E;
    }

    public void setE(byte e) {
        E = e;
    }

    public short getDE() {
        return (short)(D << 8 | E);
    }

    public void setDE(short de) {
        D = (byte)(de >> 8);
        E = (byte)(de << 8 >> 8);
    }

    public byte getH() {
        return H;
    }

    public void setH(byte h) {
        H = h;
    }

    public byte getL() {
        return L;
    }

    public void setL(byte l) {
        L = l;
    }

    public short getHL() {
        return (short)(H << 8 | L);
    }

    public void setHL(short hl) {
        H = (byte)(hl >> 8);
        L = (byte)(hl << 8 >> 8);
    }

    public short getSP() {
        return SP;
    }

    public void setSP(short SP) {
        this.SP = SP;
    }

    public short getPC() {
        return PC;
    }

    public void setPC(short PC) {
        this.PC = PC;
    }
}
