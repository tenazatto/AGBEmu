package com.emulator.jmme.agbemu.hardware;

public class GameBoyRegisters {
    private short A;
    private short B;
    private short C;
    private short D;
    private short E;
    private short F;
    private short H;
    private short L;
    private int SP;
    private int PC;

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

    public GameBoyRegisters(short a, short b, short c, short d, short e, short f, short h, short l, int SP, int PC) {
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

    public short getA() {
        return A;
    }

    public void setA(short a) {
        A = a;
    }

    public short getF() {
        return F;
    }

    public void setF(short f) {
        F = f;
    }

    public int getAF() {
        return A << 8 + F;
    }

    public void setAF(int af) {
        A = (short)(af >> 8);
        F = (short)(af << 8 >> 8);
    }

    public boolean getCFlag() {
        return (F << 3 >> 7) == 1;
    }

    public void setCFlag(boolean cFlag) {
        F = (short) (F | ((cFlag) ? 0x01 << 4 : 0x00 << 4));
    }

    public boolean getHFlag() {
        return (F << 2 >> 7) == 1;
    }

    public void setHFlag(boolean hFlag) {
        F = (short) (F | ((hFlag) ? 0x01 << 5 : 0x00 << 5));
    }

    public boolean getNFlag() {
        return (F << 1 >> 7) == 1;
    }

    public void setNFlag(boolean nFlag) {
        F = (short) (F | ((nFlag) ? 0x01 << 6 : 0x00 << 6));
    }

    public boolean getZFlag() {
        return (F >> 7) == 1;
    }

    public void setZFlag(boolean zFlag) {
        F = (short) (F | ((zFlag) ? 0x01 << 7 : 0x00 << 7));
    }

    public short getB() {
        return B;
    }

    public void setB(short b) {
        B = b;
    }

    public short getC() {
        return C;
    }

    public void setC(short c) {
        C = c;
    }

    public int getBC() {
        return B << 8 + C;
    }

    public void setBC(int bc) {
        B = (short)(bc >> 8);
        C = (short)(bc << 8 >> 8);
    }

    public short getD() {
        return D;
    }

    public void setD(short d) {
        D = d;
    }

    public short getE() {
        return E;
    }

    public void setE(short e) {
        E = e;
    }

    public int getDE() {
        return D << 8 + E;
    }

    public void setDE(int de) {
        D = (short)(de >> 8);
        E = (short)(de << 8 >> 8);
    }

    public short getH() {
        return H;
    }

    public void setH(short h) {
        H = h;
    }

    public short getL() {
        return L;
    }

    public void setL(short l) {
        L = l;
    }

    public int getHL() {
        return H << 8 + L;
    }

    public void setHL(int hl) {
        H = (short)(hl >> 8);
        L = (short)(hl << 8 >> 8);
    }

    public int getSP() {
        return SP;
    }

    public void setSP(int SP) {
        this.SP = SP;
    }

    public int getPC() {
        return PC;
    }

    public void setPC(int PC) {
        this.PC = PC;
    }
}
