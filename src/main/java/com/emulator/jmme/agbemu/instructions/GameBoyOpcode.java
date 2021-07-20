package com.emulator.jmme.agbemu.instructions;

import com.emulator.jmme.base.instructions.Opcode;

import java.util.Arrays;

public enum GameBoyOpcode implements Opcode {
    NOP(0x00, 4), LD_BC_nn(0x01, 4), LD__BC__A(0x02, 4), INC_BC(0x03, 4), INC_B(0x04, 4), DEC_B(0x05, 4), LD_B_n(0x06, 4), RLCA(0x07, 4),
    LD__nn__SP(0x08, 4), ADD_HL_BC(0x09, 4), LD_A__BC(0x0A, 4), DEC_BC(0x0B, 4), INC_C(0x0C, 4), DEC_C(0x0D, 4), LD_C_n(0x0E, 4), RRCA(0x0F, 4),
    STOP(0x10, 4), LD_DE_nn(0x11, 4), LD__DE__A(0x12, 4), INC_DE(0x13, 4), INC_D(0x14, 4), DEC_D(0x15, 4), LD_D_n(0x16, 4), RLA(0x17, 4),
    JR_n(0x18, 4), ADD_HL_DE(0x19, 4), LD_A__DE(0x1A, 4), DEC_DE(0x1B, 4), INC_E(0x1C, 4), DEC_E(0x1D, 4), LD_E_n(0x1E, 4), RRA(0x1F, 4),
    JR_NZ_n(0x20, 4), LD_HL_nn(0x21, 4), LDI__HL__A(0x22, 4), INC_HL(0x23, 4), INC_H(0x24, 4), DEC_H(0x25, 4), LD_H_n(0x26, 4), DAA(0x27, 4),
    JR_Z_n(0x28, 4), ADD_HL_HL(0x29, 4), LDI_A__HL(0x2A, 4), DEC_HL(0x2B, 4), INC_L(0x2C, 4), DEC_L(0x2D, 4), LD_L_n(0x2E, 4), CPL(0x2F, 4),
    JR_NC_n(0x30, 4), LD_SP_nn(0x31, 4), LDD__HL__A(0x32, 4), INC_SP(0x33, 4), INC__HL(0x34, 4), DEC__HL(0x35, 4), LD__HL__n(0x36, 4), SCF(0x37, 4),
    JR_C_n(0x38, 4), ADD_HL_SP(0x39, 4), LDD_A__HL(0x3A, 4), DEC_SP(0x3B, 4), INC_A(0x3C, 4), DEC_A(0x3D, 4), LD_A_n(0x3E, 4), CCF(0x3F, 4),
    LD_B_B(0x40, 4), LD_B_C(0x41, 4), LD_B_D(0x42, 4), LD_B_E(0x43, 4), LD_B_H(0x44, 4), LD_B_L(0x45, 4), LD_B__HL(0x46, 4), LD_B_A(0x47, 4),
    LD_C_B(0x48, 4), LD_C_C(0x49, 4), LD_C_D(0x4A, 4), LD_C_E(0x4B, 4), LD_C_H(0x4C, 4), LD_C_L(0x4D, 4), LD_C__HL(0x4E, 4), LD_C_A(0x4F, 4),
    LD_D_B(0x50, 4), LD_D_C(0x51, 4), LD_D_D(0x52, 4), LD_D_E(0x53, 4), LD_D_H(0x54, 4), LD_D_L(0x55, 4), LD_D__HL(0x56, 4), LD_D_A(0x57, 4),
    LD_E_B(0x58, 4), LD_E_C(0x59, 4), LD_E_D(0x5A, 4), LD_E_E(0x5B, 4), LD_E_H(0x5C, 4), LD_E_L(0x5D, 4), LD_E__HL(0x5E, 4), LD_E_A(0x5F, 4),
    LD_H_B(0x60, 4), LD_H_C(0x61, 4), LD_H_D(0x62, 4), LD_H_E(0x63, 4), LD_H_H(0x64, 4), LD_H_L(0x65, 4), LD_H__HL(0x66, 4), LD_H_A(0x67, 4),
    LD_L_B(0x68, 4), LD_L_C(0x69, 4), LD_L_D(0x6A, 4), LD_L_E(0x6B, 4), LD_L_H(0x6C, 4), LD_L_L(0x6D, 4), LD_L__HL(0x6E, 4), LD_L_A(0x6F, 4),
    LD__HL__B(0x70, 4), LD__HL__C(0x71, 4), LD__HL__D(0x72, 4), LD__HL__E(0x73, 4), LD__HL__H(0x74, 4), LD__HL__L(0x75, 4), HALT(0x76, 4), LD__HL__A(0x77, 4),
    LD_A_B(0x78, 4), LD_A_C(0x79, 4), LD_A_D(0x7A, 4), LD_A_E(0x7B, 4), LD_A_H(0x7C, 4), LD_A_L(0x7D, 4), LD_A__HL(0x7E, 4), LD_A_A(0x7F, 4),
    ADD_A_B(0x80, 4), ADD_A_C(0x81, 4), ADD_A_D(0x82, 4), ADD_A_E(0x83, 4), ADD_A_H(0x84, 4), ADD_A_L(0x85, 4), ADD_A__HL(0x86, 4), ADD_A_A(0x87, 4),
    ADC_A_B(0x88, 4), ADC_A_C(0x89, 4), ADC_A_D(0x8A, 4), ADC_A_E(0x8B, 4), ADC_A_H(0x8C, 4), ADC_A_L(0x8D, 4), ADC_A__HL(0x8E, 4), ADC_A_A(0x8F, 4),
    SUB_A_B(0x90, 4), SUB_A_C(0x91, 4), SUB_A_D(0x92, 4), SUB_A_E(0x93, 4), SUB_A_H(0x94, 4), SUB_A_L(0x95, 4), SUB_A__HL(0x96, 4), SUB_A_A(0x97, 4),
    SBC_A_B(0x98, 4), SBC_A_C(0x99, 4), SBC_A_D(0x9A, 4), SBC_A_E(0x9B, 4), SBC_A_H(0x9C, 4), SBC_A_L(0x9D, 4), SBC_A__HL(0x9E, 4), SBC_A_A(0x9F, 4),
    AND_B(0xA0, 4), AND_C(0xA1, 4), AND_D(0xA2, 4), AND_E(0xA3, 4), AND_H(0xA4, 4), AND_L(0xA5, 4), AND__HL(0xA6, 4), AND_A(0xA7, 4),
    XOR_B(0xA8, 4), XOR_C(0xA9, 4), XOR_D(0xAA, 4), XOR_E(0xAB, 4), XOR_H(0xAC, 4), XOR_L(0xAD, 4), XOR__HL(0xAE, 4), XOR_A(0xAF, 4),
    OR_B(0xB0, 4), OR_C(0xB1, 4), OR_D(0xB2, 4), OR_E(0xB3, 4), OR_H(0xB4, 4), OR_L(0xB5, 4), OR__HL(0xB6, 4), OR_A(0xB7, 4),
    CP_B(0xB8, 4), CP_C(0xB9, 4), CP_D(0xBA, 4), CP_E(0xBB, 4), CP_H(0xBC, 4), CP_L(0xBD, 4), CP__HL(0xBE, 4), CP_A(0xBF, 4),
    RET_NZ(0xC0, 4), POP_BC(0xC1, 4), JP_NZ_nn(0xC2, 4), JP_nn(0xC3, 12), CALL_NZ_nn(0xC4, 4), PUSH_BC(0xC5, 4), ADD_A_n(0xC6, 4), RST_0(0xC7, 4),
    RET_Z(0xC8, 4), RET(0xC9, 4), JP_Z_nn(0xCA, 4), TWO_BYTE(0xCB, 4), CALL_Z_nn(0xCC, 4), CALL_nn(0xCD, 4), ADC_A_n(0xCE, 4), RST_8(0xCF, 4),
    RET_NC(0xD0, 4), POP_DE(0xD1, 4), JP_NC_nn(0xD2, 4), CALL_NC_nn(0xD4, 4), PUSH_DE(0xD5, 4), SUB_A_n(0xD6, 4), RST_10(0xD7, 4),
    RET_C(0xD8, 4), RETI(0xD9, 4), JP_C_nn(0xDA, 4), CALL_C_nn(0xDC, 4), SBC_A_n(0xDE, 4), RST_18(0xDF, 4),
    LDH__n__A(0xE0, 4), POP_HL(0xE1, 4), LDH__C__A(0xE2, 4), PUSH_HL(0xE5, 4), AND_n(0xE6, 4), RST_20(0xE7, 4),
    ADD_SP_d(0xE8, 4), JP__HL(0xE9, 4), LD__nn__A(0xEA, 4), XOR_n(0xEE, 4), RST_28(0xEF, 4),
    LDH_A__n(0xF0, 4), POP_AF(0xF1, 4), DI(0xF3, 4), PUSH_AF(0xF5, 4), OR_n(0xF6, 4), RST_30(0xF7, 4),
    LDHL_SP_d(0xF8, 4), LD_SP_HL(0xF9, 4), LD_A__nn(0xFA, 4), EI(0xFB, 4), CP_n(0xFE, 4), RST_38(0xFF, 4),
    RLC_B(0xCB00, 4), RLC_C(0xCB01, 4), RLC_D(0xCB02, 4), RLC_E(0xCB03, 4), RLC_H(0xCB04, 4), RLC_L(0xCB05, 4), RLC__HL(0xCB06, 4), RLC_A(0xCB07, 4),
    RRC_B(0xCB08, 4), RRC_C(0xCB09, 4), RRC_D(0xCB0A, 4), RRC_E(0xCB0B, 4), RRC_H(0xCB0C, 4), RRC_L(0xCB0D, 4), RRC__HL(0xCB0E, 4), RRC_A(0xCB0F, 4),
    RL_B(0xCB10, 4), RL_C(0xCB11, 4), RL_D(0xCB12, 4), RL_E(0xCB13, 4), RL_H(0xCB14, 4), RL_L(0xCB15, 4), RL__HL(0xCB16, 4), RL_A(0xCB17, 4),
    RR_B(0xCB18, 4), RR_C(0xCB19, 4), RR_D(0xCB1A, 4), RR_E(0xCB1B, 4), RR_H(0xCB1C, 4), RR_L(0xCB1D, 4), RR__HL(0xCB1E, 4), RR_A(0xCB1F, 4),
    SLA_B(0xCB20, 4), SLA_C(0xCB21, 4), SLA_D(0xCB22, 4), SLA_E(0xCB23, 4), SLA_H(0xCB24, 4), SLA_L(0xCB25, 4), SLA__HL(0xCB26, 4), SLA_A(0xCB27, 4),
    SRA_B(0xCB28, 4), SRA_C(0xCB29, 4), SRA_D(0xCB2A, 4), SRA_E(0xCB2B, 4), SRA_H(0xCB2C, 4), SRA_L(0xCB2D, 4), SRA__HL(0xCB2E, 4), SRA_A(0xCB2F, 4),
    SWAP_B(0xCB30, 4), SWAP_C(0xCB31, 4), SWAP_D(0xCB32, 4), SWAP_E(0xCB33, 4), SWAP_H(0xCB34, 4), SWAP_L(0xCB35, 4), SWAP__HL(0xCB36, 4), SWAP_A(0xCB37, 4),
    SRL_B(0xCB38, 4), SRL_C(0xCB39, 4), SRL_D(0xCB3A, 4), SRL_E(0xCB3B, 4), SRL_H(0xCB3C, 4), SRL_L(0xCB3D, 4), SRL__HL(0xCB3E, 4), SRL_A(0xCB3F, 4),
    BIT_0_B(0xCB40, 4), BIT_0_C(0xCB41, 4), BIT_0_D(0xCB42, 4), BIT_0_E(0xCB43, 4), BIT_0_H(0xCB44, 4), BIT_0_L(0xCB45, 4), BIT_0__HL(0xCB46, 4), BIT_0_A(0xCB47, 4),
    BIT_1_B(0xCB48, 4), BIT_1_C(0xCB49, 4), BIT_1_D(0xCB4A, 4), BIT_1_E(0xCB4B, 4), BIT_1_H(0xCB4C, 4), BIT_1_L(0xCB4D, 4), BIT_1__HL(0xCB4E, 4), BIT_1_A(0xCB4F, 4),
    BIT_2_B(0xCB50, 4), BIT_2_C(0xCB51, 4), BIT_2_D(0xCB52, 4), BIT_2_E(0xCB53, 4), BIT_2_H(0xCB54, 4), BIT_2_L(0xCB55, 4), BIT_2__HL(0xCB56, 4), BIT_2_A(0xCB57, 4),
    BIT_3_B(0xCB58, 4), BIT_3_C(0xCB59, 4), BIT_3_D(0xCB5A, 4), BIT_3_E(0xCB5B, 4), BIT_3_H(0xCB5C, 4), BIT_3_L(0xCB5D, 4), BIT_3__HL(0xCB5E, 4), BIT_3_A(0xCB5F, 4),
    BIT_4_B(0xCB60, 4), BIT_4_C(0xCB61, 4), BIT_4_D(0xCB62, 4), BIT_4_E(0xCB63, 4), BIT_4_H(0xCB64, 4), BIT_4_L(0xCB65, 4), BIT_4__HL(0xCB66, 4), BIT_4_A(0xCB67, 4),
    BIT_5_B(0xCB68, 4), BIT_5_C(0xCB69, 4), BIT_5_D(0xCB6A, 4), BIT_5_E(0xCB6B, 4), BIT_5_H(0xCB6C, 4), BIT_5_L(0xCB6D, 4), BIT_5__HL(0xCB6E, 4), BIT_5_A(0xCB6F, 4),
    BIT_6_B(0xCB70, 4), BIT_6_C(0xCB71, 4), BIT_6_D(0xCB72, 4), BIT_6_E(0xCB73, 4), BIT_6_H(0xCB74, 4), BIT_6_L(0xCB75, 4), BIT_6__HL(0xCB76, 4), BIT_6_A(0xCB77, 4),
    BIT_7_B(0xCB78, 4), BIT_7_C(0xCB79, 4), BIT_7_D(0xCB7A, 4), BIT_7_E(0xCB7B, 4), BIT_7_H(0xCB7C, 4), BIT_7_L(0xCB7D, 4), BIT_7__HL(0xCB7E, 4), BIT_7_A(0xCB7F, 4),
    RES_0_B(0xCB80, 4), RES_0_C(0xCB81, 4), RES_0_D(0xCB82, 4), RES_0_E(0xCB83, 4), RES_0_H(0xCB84, 4), RES_0_L(0xCB85, 4), RES_0__HL(0xCB86, 4), RES_0_A(0xCB87, 4),
    RES_1_B(0xCB88, 4), RES_1_C(0xCB89, 4), RES_1_D(0xCB8A, 4), RES_1_E(0xCB8B, 4), RES_1_H(0xCB8C, 4), RES_1_L(0xCB8D, 4), RES_1__HL(0xCB8E, 4), RES_1_A(0xCB8F, 4),
    RES_2_B(0xCB90, 4), RES_2_C(0xCB91, 4), RES_2_D(0xCB92, 4), RES_2_E(0xCB93, 4), RES_2_H(0xCB94, 4), RES_2_L(0xCB95, 4), RES_2__HL(0xCB96, 4), RES_2_A(0xCB97, 4),
    RES_3_B(0xCB98, 4), RES_3_C(0xCB99, 4), RES_3_D(0xCB9A, 4), RES_3_E(0xCB9B, 4), RES_3_H(0xCB9C, 4), RES_3_L(0xCB9D, 4), RES_3__HL(0xCB9E, 4), RES_3_A(0xCB9F, 4),
    RES_4_B(0xCBA0, 4), RES_4_C(0xCBA1, 4), RES_4_D(0xCBA2, 4), RES_4_E(0xCBA3, 4), RES_4_H(0xCBA4, 4), RES_4_L(0xCBA5, 4), RES_4__HL(0xCBA6, 4), RES_4_A(0xCBA7, 4),
    RES_5_B(0xCBA8, 4), RES_5_C(0xCBA9, 4), RES_5_D(0xCBAA, 4), RES_5_E(0xCBAB, 4), RES_5_H(0xCBAC, 4), RES_5_L(0xCBAD, 4), RES_5__HL(0xCBAE, 4), RES_5_A(0xCBAF, 4),
    RES_6_B(0xCBB0, 4), RES_6_C(0xCBB1, 4), RES_6_D(0xCBB2, 4), RES_6_E(0xCBB3, 4), RES_6_H(0xCBB4, 4), RES_6_L(0xCBB5, 4), RES_6__HL(0xCBB6, 4), RES_6_A(0xCBB7, 4),
    RES_7_B(0xCBB8, 4), RES_7_C(0xCBB9, 4), RES_7_D(0xCBBA, 4), RES_7_E(0xCBBB, 4), RES_7_H(0xCBBC, 4), RES_7_L(0xCBBD, 4), RES_7__HL(0xCBBE, 4), RES_7_A(0xCBBF, 4),
    SET_0_B(0xCBC0, 4), SET_0_C(0xCBC1, 4), SET_0_D(0xCBC2, 4), SET_0_E(0xCBC3, 4), SET_0_H(0xCBC4, 4), SET_0_L(0xCBC5, 4), SET_0__HL(0xCBC6, 4), SET_0_A(0xCBC7, 4),
    SET_1_B(0xCBC8, 4), SET_1_C(0xCBC9, 4), SET_1_D(0xCBCA, 4), SET_1_E(0xCBCB, 4), SET_1_H(0xCBCC, 4), SET_1_L(0xCBCD, 4), SET_1__HL(0xCBCE, 4), SET_1_A(0xCBCF, 4),
    SET_2_B(0xCBD0, 4), SET_2_C(0xCBD1, 4), SET_2_D(0xCBD2, 4), SET_2_E(0xCBD3, 4), SET_2_H(0xCBD4, 4), SET_2_L(0xCBD5, 4), SET_2__HL(0xCBD6, 4), SET_2_A(0xCBD7, 4),
    SET_3_B(0xCBD8, 4), SET_3_C(0xCBD9, 4), SET_3_D(0xCBDA, 4), SET_3_E(0xCBDB, 4), SET_3_H(0xCBDC, 4), SET_3_L(0xCBDD, 4), SET_3__HL(0xCBDE, 4), SET_3_A(0xCBDF, 4),
    SET_4_B(0xCBE0, 4), SET_4_C(0xCBE1, 4), SET_4_D(0xCBE2, 4), SET_4_E(0xCBE3, 4), SET_4_H(0xCBE4, 4), SET_4_L(0xCBE5, 4), SET_4__HL(0xCBE6, 4), SET_4_A(0xCBE7, 4),
    SET_5_B(0xCBE8, 4), SET_5_C(0xCBE9, 4), SET_5_D(0xCBEA, 4), SET_5_E(0xCBEB, 4), SET_5_H(0xCBEC, 4), SET_5_L(0xCBED, 4), SET_5__HL(0xCBEE, 4), SET_5_A(0xCBEF, 4),
    SET_6_B(0xCBF0, 4), SET_6_C(0xCBF1, 4), SET_6_D(0xCBF2, 4), SET_6_E(0xCBF3, 4), SET_6_H(0xCBF4, 4), SET_6_L(0xCBF5, 4), SET_6__HL(0xCBF6, 4), SET_6_A(0xCBF7, 4),
    SET_7_B(0xCBF8, 4), SET_7_C(0xCBF9, 4), SET_7_D(0xCBFA, 4), SET_7_E(0xCBFB, 4), SET_7_H(0xCBFC, 4), SET_7_L(0xCBFD, 4), SET_7__HL(0xCBFE, 4), SET_7_A(0xCBFF, 4);

    int opcode;
    int cycles;

    GameBoyOpcode(int opcode, int cycles) {
        this.opcode = opcode;
        this.cycles = cycles;
    }

    public int getOpcode() {
        return opcode;
    }

    public static GameBoyOpcode getFromValue(int opcode) {
        return Arrays.stream(GameBoyOpcode.values())
                .filter(instruction -> instruction.opcode == opcode)
                .findFirst().orElseThrow(IllegalStateException::new);
    }
}
