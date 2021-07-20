package com.emulator.jmme.agbemu.instructions;

import com.emulator.jmme.agbemu.hardware.GameBoyRegisters;
import com.emulator.jmme.base.instructions.Instructions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigInteger;

public class GameBoyInstructions implements Instructions {
	private static final Logger logger
			= LoggerFactory.getLogger(GameBoyInstructions.class);

    public void NOP(){
		logger.info("NOP - Instrução executada");
	}

	public void LD_BC_nn(){
		
	}

	public void LD__BC__A(){
		
	}

	public void INC_BC(){
		
	}

	public void INC_B(){
		
	}

	public void DEC_B(){
		
	}

	public void LD_B_n(int n, GameBoyRegisters registers){
		registers.setB((short) n);

		logger.info("B: {}", registers.getB());
		logger.info("LD B, n - Instrução executada");
	}

	public void RLCA(){
		
	}
	
    public void LD__nn__SP(){
		
	}

	public void ADD_HL_BC(){
		
	}

	public void LD_A__BC(){
		
	}

	public void DEC_BC(){
		
	}

	public void INC_C(){
		
	}

	public void DEC_C(){
		
	}

	public void LD_C_n(int n, GameBoyRegisters registers){
		registers.setC((short) n);

		logger.info("C: {}", registers.getC());
		logger.info("LD C, n - Instrução executada");
	}

	public void RRCA(){
		
	}

    public void STOP(){
		
	}

	public void LD_DE_nn(){
		
	}

	public void LD__DE__A(){
		
	}

	public void INC_DE(){
		
	}

	public void INC_D(){
		
	}

	public void DEC_D(){
		
	}

	public void LD_D_n(){
		
	}

	public void RLA(){
		
	}

    public void JR_n(){
		
	}

	public void ADD_HL_DE(){
		
	}

	public void LD_A__DE(){
		
	}

	public void DEC_DE(){
		
	}

	public void INC_E(){
		
	}

	public void DEC_E(){
		
	}

	public void LD_E_n(){
		
	}

	public void RRA(){
		
	}

    public void JR_NZ_n(){
		
	}

	public void LD_HL_nn(){
		
	}

	public void LDI__HL__A(){
		
	}

	public void INC_HL(){
		
	}

	public void INC_H(){
		
	}

	public void DEC_H(){
		
	}

	public void LD_H_n(){
		
	}

	public void DAA(){
		
	}

    public void JR_Z_n(){
		
	}

	public void ADD_HL_HL(){
		
	}

	public void LDI_A__HL(){
		
	}

	public void DEC_HL(){
		
	}

	public void INC_L(){
		
	}

	public void DEC_L(){
		
	}

	public void LD_L_n(){
		
	}

	public void CPL(){
		
	}

    public void JR_NC_n(int n, GameBoyRegisters registers){
		if (!registers.getCFlag()){
			registers.setPC(registers.getPC() + n);
		}

		logger.info("Endereço: {}", new BigInteger(String.valueOf(registers.getPC())).toString(16).toUpperCase());
		logger.info("JP NC, n - Instrução executada");
	}

	public void LD_SP_nn(){
		
	}

	public void LDD__HL__A(){
		
	}

	public void INC_SP(){
		
	}

	public void INC__HL(){
		
	}

	public void DEC__HL(){
		
	}

	public void LD__HL__n(){
		
	}

	public void SCF(){
		
	}

    public void JR_C_n(){
		
	}

	public void ADD_HL_SP(){
		
	}

	public void LDD_A__HL(){
		
	}

	public void DEC_SP(){
		
	}

	public void INC_A(GameBoyRegisters registers){
		registers.setA((short) (registers.getA() + 1));

		logger.info("INC A - Instrução executada");
	}

	public void DEC_A(){
		
	}

	public void LD_A_n(){
		
	}

	public void CCF(GameBoyRegisters registers){
    	registers.setNFlag(false);
    	registers.setHFlag(false);
		registers.setCFlag(!registers.getCFlag());

		logger.info("Flags - Z: {}, N: {}, H: {}, C: {}",
				registers.getZFlag(), registers.getNFlag(), registers.getHFlag(), registers.getCFlag());
		logger.info("CCF - Instrução executada");
	}

    public void LD_B_B(){
		
	}

	public void LD_B_C(){
		
	}

	public void LD_B_D(){
		
	}

	public void LD_B_E(){
		
	}

	public void LD_B_H(){
		
	}

	public void LD_B_L(){
		
	}

	public void LD_B__HL(){
		
	}

	public void LD_B_A(){
		
	}

    public void LD_C_B(){
		
	}

	public void LD_C_C(){
		
	}

	public void LD_C_D(){
		
	}

	public void LD_C_E(){
		
	}

	public void LD_C_H(){
		
	}

	public void LD_C_L(){
		
	}

	public void LD_C__HL(){
		
	}

	public void LD_C_A(){
		
	}

    public void LD_D_B(){
		
	}

	public void LD_D_C(){
		
	}

	public void LD_D_D(){
		
	}

	public void LD_D_E(){
		
	}

	public void LD_D_H(){
		
	}

	public void LD_D_L(){
		
	}

	public void LD_D__HL(){
		
	}

	public void LD_D_A(){
		
	}

    public void LD_E_B(){
		
	}

	public void LD_E_C(){
		
	}

	public void LD_E_D(){
		
	}

	public void LD_E_E(){
		
	}

	public void LD_E_H(){
		
	}

	public void LD_E_L(){
		
	}

	public void LD_E__HL(){
		
	}

	public void LD_E_A(){
		
	}

    public void LD_H_B(){
		
	}

	public void LD_H_C(){
		
	}

	public void LD_H_D(){
		
	}

	public void LD_H_E(){
		
	}

	public void LD_H_H(){
		
	}

	public void LD_H_L(){
		
	}

	public void LD_H__HL(){
		
	}

	public void LD_H_A(){
		
	}

    public void LD_L_B(){
		
	}

	public void LD_L_C(){
		
	}

	public void LD_L_D(){
		
	}

	public void LD_L_E(){
		
	}

	public void LD_L_H(){
		
	}

	public void LD_L_L(){
		
	}

	public void LD_L__HL(){
		
	}

	public void LD_L_A(){
		
	}

    public void LD__HL__B(){
		
	}

	public void LD__HL__C(){
		
	}

	public void LD__HL__D(){
		
	}

	public void LD__HL__E(){
		
	}

	public void LD__HL__H(){
		
	}

	public void LD__HL__L(){
		
	}

	public void HALT(){
		
	}

	public void LD__HL__A(){
		
	}

    public void LD_A_B(GameBoyRegisters registers){
		registers.setA(registers.getB());

		logger.info("A: {}, B: {}", registers.getA(), registers.getB());
		logger.info("LD A, B - Instrução executada");
	}

	public void LD_A_C(){
		
	}

	public void LD_A_D(){
		
	}

	public void LD_A_E(){
		
	}

	public void LD_A_H(){
		
	}

	public void LD_A_L(){
		
	}

	public void LD_A__HL(){
		
	}

	public void LD_A_A(){
		
	}

    public void ADD_A_B(){
		
	}

	public void ADD_A_C(){
		
	}

	public void ADD_A_D(){
		
	}

	public void ADD_A_E(){
		
	}

	public void ADD_A_H(){
		
	}

	public void ADD_A_L(){
		
	}

	public void ADD_A__HL(){
		
	}

	public void ADD_A_A(){
		
	}

    public void ADC_A_B(){
		
	}

	public void ADC_A_C(){
		
	}

	public void ADC_A_D(){
		
	}

	public void ADC_A_E(){
		
	}

	public void ADC_A_H(){
		
	}

	public void ADC_A_L(){
		
	}

	public void ADC_A__HL(){
		
	}

	public void ADC_A_A(){
		
	}

    public void SUB_A_B(){
		
	}

	public void SUB_A_C(){
		
	}

	public void SUB_A_D(){
		
	}

	public void SUB_A_E(){
		
	}

	public void SUB_A_H(){
		
	}

	public void SUB_A_L(){
		
	}

	public void SUB_A__HL(){
		
	}

	public void SUB_A_A(){
		
	}

    public void SBC_A_B(){
		
	}

	public void SBC_A_C(){
		
	}

	public void SBC_A_D(){
		
	}

	public void SBC_A_E(){
		
	}

	public void SBC_A_H(){
		
	}

	public void SBC_A_L(){
		
	}

	public void SBC_A__HL(){
		
	}

	public void SBC_A_A(){
		
	}

    public void AND_B(){
		
	}

	public void AND_C(){
		
	}

	public void AND_D(){
		
	}

	public void AND_E(){
		
	}

	public void AND_H(){
		
	}

	public void AND_L(){
		
	}

	public void AND__HL(){
		
	}

	public void AND_A(){
		
	}

    public void XOR_B(){
		
	}

	public void XOR_C(){
		
	}

	public void XOR_D(){
		
	}

	public void XOR_E(){
		
	}

	public void XOR_H(){
		
	}

	public void XOR_L(){
		
	}

	public void XOR__HL(){
		
	}

	public void XOR_A(){
		
	}

    public void OR_B(){
		
	}

	public void OR_C(){
		
	}

	public void OR_D(){
		
	}

	public void OR_E(){
		
	}

	public void OR_H(){
		
	}

	public void OR_L(){
		
	}

	public void OR__HL(){
		
	}

	public void OR_A(){
		
	}

    public void CP_B(){
		
	}

	public void CP_C(){
		
	}

	public void CP_D(){
		
	}

	public void CP_E(){
		
	}

	public void CP_H(){
		
	}

	public void CP_L(){
		
	}

	public void CP__HL(){
		
	}

	public void CP_A(){
		
	}

    public void RET_NZ(){
		
	}

	public void POP_BC(){
		
	}

	public void JP_NZ_nn(){
		
	}

	public void JP_nn(int nn, GameBoyRegisters registers){
		registers.setPC(nn);

		logger.info("Endereço: {}", new BigInteger(String.valueOf(registers.getPC())).toString(16).toUpperCase());
		logger.info("JP nn - Instrução executada");
	}

	public void CALL_NZ_nn(){
		
	}

	public void PUSH_BC(){
		
	}

	public void ADD_A_n(){
		
	}

	public void RST_0(){
		
	}

    public void RET_Z(){
		
	}

	public void RET(){
		
	}

	public void JP_Z_nn(){
		
	}

	public void TWO_BYTE(){
		
	}

	public void CALL_Z_nn(){
		
	}

	public void CALL_nn(){
		
	}

	public void ADC_A_n(){
		
	}

	public void RST_8(){
		
	}

    public void RET_NC(){
		
	}

	public void POP_DE(){
		
	}

	public void JP_NC_nn(){
		
	}

	public void CALL_NC_nn(){
		
	}

	public void PUSH_DE(){
		
	}

	public void SUB_A_n(int n, GameBoyRegisters registers){
    	short result = (short) (registers.getA() - n);

		registers.setZFlag(result == 0);
		registers.setNFlag(true);
		registers.setHFlag((registers.getA() & 0x0F) < (n & 0x0F));
		registers.setCFlag(registers.getA() < n);

		registers.setA(result);
		logger.info("A: {}", registers.getA());
		logger.info("Flags - Z: {}, N: {}, H: {}, C: {}",
				registers.getZFlag(), registers.getNFlag(), registers.getHFlag(), registers.getCFlag());
		logger.info("SUB A, n - Instrução executada");
	}

	public void RST_10(){
		
	}

    public void RET_C(){
		
	}

	public void RETI(){
		
	}

	public void JP_C_nn(){
		
	}

	public void CALL_C_nn(){
		
	}

	public void SBC_A_n(){
		
	}

	public void RST_18(){
		
	}

    public void LDH__n__A(){
		
	}

	public void POP_HL(){
		
	}

	public void LDH__C__A(){
		
	}

	public void PUSH_HL(){
		
	}

	public void AND_n(){
		
	}

	public void RST_20(){
		
	}

    public void ADD_SP_d(){
		
	}

	public void JP__HL(){
		
	}

	public void LD__nn__A(){
		
	}

	public void XOR_n(){
		
	}

	public void RST_28(){
		
	}

    public void LDH_A__n(){
		
	}

	public void POP_AF(){
		
	}

	public void DI(){
		
	}

	public void PUSH_AF(){
		
	}

	public void OR_n(){
		
	}

	public void RST_30(){
		
	}

    public void LDHL_SP_d(){
		
	}

	public void LD_SP_HL(){
		
	}

	public void LD_A__nn(){
		
	}

	public void EI(){
		
	}

	public void CP_n(){
		
	}

	public void RST_38(){
		
	}

    public void RLC_B(){
		
	}

	public void RLC_C(){
		
	}

	public void RLC_D(){
		
	}

	public void RLC_E(){
		
	}

	public void RLC_H(){
		
	}

	public void RLC_L(){
		
	}

	public void RLC__HL(){
		
	}

	public void RLC_A(){
		
	}

    public void RRC_B(){
		
	}

	public void RRC_C(){
		
	}

	public void RRC_D(){
		
	}

	public void RRC_E(){
		
	}

	public void RRC_H(){
		
	}

	public void RRC_L(){
		
	}

	public void RRC__HL(){
		
	}

	public void RRC_A(){
		
	}

    public void RL_B(){
		
	}

	public void RL_C(){
		
	}

	public void RL_D(){
		
	}

	public void RL_E(){
		
	}

	public void RL_H(){
		
	}

	public void RL_L(){
		
	}

	public void RL__HL(){
		
	}

	public void RL_A(){
		
	}

    public void RR_B(){
		
	}

	public void RR_C(){
		
	}

	public void RR_D(){
		
	}

	public void RR_E(){
		
	}

	public void RR_H(){
		
	}

	public void RR_L(){
		
	}

	public void RR__HL(){
		
	}

	public void RR_A(){
		
	}

    public void SLA_B(){
		
	}

	public void SLA_C(){
		
	}

	public void SLA_D(){
		
	}

	public void SLA_E(){
		
	}

	public void SLA_H(){
		
	}

	public void SLA_L(){
		
	}

	public void SLA__HL(){
		
	}

	public void SLA_A(){
		
	}

    public void SRA_B(){
		
	}

	public void SRA_C(){
		
	}

	public void SRA_D(){
		
	}

	public void SRA_E(){
		
	}

	public void SRA_H(){
		
	}

	public void SRA_L(){
		
	}

	public void SRA__HL(){
		
	}

	public void SRA_A(){
		
	}

    public void SWAP_B(){
		
	}

	public void SWAP_C(){
		
	}

	public void SWAP_D(){
		
	}

	public void SWAP_E(){
		
	}

	public void SWAP_H(){
		
	}

	public void SWAP_L(){
		
	}

	public void SWAP__HL(){
		
	}

	public void SWAP_A(){
		
	}

    public void SRL_B(){
		
	}

	public void SRL_C(){
		
	}

	public void SRL_D(){
		
	}

	public void SRL_E(){
		
	}

	public void SRL_H(){
		
	}

	public void SRL_L(){
		
	}

	public void SRL__HL(){
		
	}

	public void SRL_A(){
		
	}

    public void BIT_0_B(){
		
	}

	public void BIT_0_C(){
		
	}

	public void BIT_0_D(){
		
	}

	public void BIT_0_E(){
		
	}

	public void BIT_0_H(){
		
	}

	public void BIT_0_L(){
		
	}

	public void BIT_0__HL(){
		
	}

	public void BIT_0_A(){
		
	}

    public void BIT_1_B(){
		
	}

	public void BIT_1_C(){
		
	}

	public void BIT_1_D(){
		
	}

	public void BIT_1_E(){
		
	}

	public void BIT_1_H(){
		
	}

	public void BIT_1_L(){
		
	}

	public void BIT_1__HL(){
		
	}

	public void BIT_1_A(){
		
	}

    public void BIT_2_B(){
		
	}

	public void BIT_2_C(){
		
	}

	public void BIT_2_D(){
		
	}

	public void BIT_2_E(){
		
	}

	public void BIT_2_H(){
		
	}

	public void BIT_2_L(){
		
	}

	public void BIT_2__HL(){
		
	}

	public void BIT_2_A(){
		
	}

    public void BIT_3_B(){
		
	}

	public void BIT_3_C(){
		
	}

	public void BIT_3_D(){
		
	}

	public void BIT_3_E(){
		
	}

	public void BIT_3_H(){
		
	}

	public void BIT_3_L(){
		
	}

	public void BIT_3__HL(){
		
	}

	public void BIT_3_A(){
		
	}

    public void BIT_4_B(){
		
	}

	public void BIT_4_C(){
		
	}

	public void BIT_4_D(){
		
	}

	public void BIT_4_E(){
		
	}

	public void BIT_4_H(){
		
	}

	public void BIT_4_L(){
		
	}

	public void BIT_4__HL(){
		
	}

	public void BIT_4_A(){
		
	}

    public void BIT_5_B(){
		
	}

	public void BIT_5_C(){
		
	}

	public void BIT_5_D(){
		
	}

	public void BIT_5_E(){
		
	}

	public void BIT_5_H(){
		
	}

	public void BIT_5_L(){
		
	}

	public void BIT_5__HL(){
		
	}

	public void BIT_5_A(){
		
	}

    public void BIT_6_B(){
		
	}

	public void BIT_6_C(){
		
	}

	public void BIT_6_D(){
		
	}

	public void BIT_6_E(){
		
	}

	public void BIT_6_H(){
		
	}

	public void BIT_6_L(){
		
	}

	public void BIT_6__HL(){
		
	}

	public void BIT_6_A(){
		
	}

    public void BIT_7_B(){
		
	}

	public void BIT_7_C(){
		
	}

	public void BIT_7_D(){
		
	}

	public void BIT_7_E(){
		
	}

	public void BIT_7_H(){
		
	}

	public void BIT_7_L(){
		
	}

	public void BIT_7__HL(){
		
	}

	public void BIT_7_A(){
		
	}

    public void RES_0_B(){
		
	}

	public void RES_0_C(){
		
	}

	public void RES_0_D(){
		
	}

	public void RES_0_E(){
		
	}

	public void RES_0_H(){
		
	}

	public void RES_0_L(){
		
	}

	public void RES_0__HL(){
		
	}

	public void RES_0_A(){
		
	}

    public void RES_1_B(){
		
	}

	public void RES_1_C(){
		
	}

	public void RES_1_D(){
		
	}

	public void RES_1_E(){
		
	}

	public void RES_1_H(){
		
	}

	public void RES_1_L(){
		
	}

	public void RES_1__HL(){
		
	}

	public void RES_1_A(){
		
	}

    public void RES_2_B(){
		
	}

	public void RES_2_C(){
		
	}

	public void RES_2_D(){
		
	}

	public void RES_2_E(){
		
	}

	public void RES_2_H(){
		
	}

	public void RES_2_L(){
		
	}

	public void RES_2__HL(){
		
	}

	public void RES_2_A(){
		
	}

    public void RES_3_B(){
		
	}

	public void RES_3_C(){
		
	}

	public void RES_3_D(){
		
	}

	public void RES_3_E(){
		
	}

	public void RES_3_H(){
		
	}

	public void RES_3_L(){
		
	}

	public void RES_3__HL(){
		
	}

	public void RES_3_A(){
		
	}

    public void RES_4_B(){
		
	}

	public void RES_4_C(){
		
	}

	public void RES_4_D(){
		
	}

	public void RES_4_E(){
		
	}

	public void RES_4_H(){
		
	}

	public void RES_4_L(){
		
	}

	public void RES_4__HL(){
		
	}

	public void RES_4_A(){
		
	}

    public void RES_5_B(){
		
	}

	public void RES_5_C(){
		
	}

	public void RES_5_D(){
		
	}

	public void RES_5_E(){
		
	}

	public void RES_5_H(){
		
	}

	public void RES_5_L(){
		
	}

	public void RES_5__HL(){
		
	}

	public void RES_5_A(){
		
	}

    public void RES_6_B(){
		
	}

	public void RES_6_C(){
		
	}

	public void RES_6_D(){
		
	}

	public void RES_6_E(){
		
	}

	public void RES_6_H(){
		
	}

	public void RES_6_L(){
		
	}

	public void RES_6__HL(){
		
	}

	public void RES_6_A(){
		
	}

    public void RES_7_B(){
		
	}

	public void RES_7_C(){
		
	}

	public void RES_7_D(){
		
	}

	public void RES_7_E(){
		
	}

	public void RES_7_H(){
		
	}

	public void RES_7_L(){
		
	}

	public void RES_7__HL(){
		
	}

	public void RES_7_A(){
		
	}

    public void SET_0_B(){
		
	}

	public void SET_0_C(){
		
	}

	public void SET_0_D(){
		
	}

	public void SET_0_E(){
		
	}

	public void SET_0_H(){
		
	}

	public void SET_0_L(){
		
	}

	public void SET_0__HL(){
		
	}

	public void SET_0_A(){
		
	}

    public void SET_1_B(){
		
	}

	public void SET_1_C(){
		
	}

	public void SET_1_D(){
		
	}

	public void SET_1_E(GameBoyRegisters registers){
		registers.setE((short) (registers.getE() | (1 << 1)));

		logger.info("E: {}", registers.getE());
		logger.info("SET 1, E - Instrução executada");
	}

	public void SET_1_H(){
		
	}

	public void SET_1_L(){
		
	}

	public void SET_1__HL(){
		
	}

	public void SET_1_A(){
		
	}

    public void SET_2_B(){
		
	}

	public void SET_2_C(){
		
	}

	public void SET_2_D(){
		
	}

	public void SET_2_E(){
		
	}

	public void SET_2_H(){
		
	}

	public void SET_2_L(){
		
	}

	public void SET_2__HL(){
		
	}

	public void SET_2_A(){
		
	}

    public void SET_3_B(){
		
	}

	public void SET_3_C(){
		
	}

	public void SET_3_D(){
		
	}

	public void SET_3_E(){
		
	}

	public void SET_3_H(){
		
	}

	public void SET_3_L(){
		
	}

	public void SET_3__HL(){
		
	}

	public void SET_3_A(){
		
	}

    public void SET_4_B(){
		
	}

	public void SET_4_C(){
		
	}

	public void SET_4_D(){
		
	}

	public void SET_4_E(){
		
	}

	public void SET_4_H(){
		
	}

	public void SET_4_L(){
		
	}

	public void SET_4__HL(){
		
	}

	public void SET_4_A(){
		
	}

    public void SET_5_B(){
		
	}

	public void SET_5_C(){
		
	}

	public void SET_5_D(){
		
	}

	public void SET_5_E(){
		
	}

	public void SET_5_H(){
		
	}

	public void SET_5_L(){
		
	}

	public void SET_5__HL(){
		
	}

	public void SET_5_A(){
		
	}

    public void SET_6_B(){
		
	}

	public void SET_6_C(){
		
	}

	public void SET_6_D(){
		
	}

	public void SET_6_E(){
		
	}

	public void SET_6_H(){
		
	}

	public void SET_6_L(){
		
	}

	public void SET_6__HL(){
		
	}

	public void SET_6_A(){
		
	}

    public void SET_7_B(){
		
	}

	public void SET_7_C(){
		
	}

	public void SET_7_D(){
		
	}

	public void SET_7_E(){
		
	}

	public void SET_7_H(){
		
	}

	public void SET_7_L(){
		
	}

	public void SET_7__HL(){
		
	}

	public void SET_7_A(){
		
	}
}
