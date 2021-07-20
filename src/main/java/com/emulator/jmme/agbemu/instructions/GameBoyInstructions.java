package com.emulator.jmme.agbemu.instructions;

import com.emulator.jmme.agbemu.hardware.GameBoyBus;
import com.emulator.jmme.agbemu.hardware.GameBoyRegisters;
import com.emulator.jmme.agbemu.utils.GameBoyUtils;
import com.emulator.jmme.base.instructions.Instructions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GameBoyInstructions implements Instructions {
	private static final Logger logger
			= LoggerFactory.getLogger(GameBoyInstructions.class);

    public void NOP(){
		logger.info("NOP - Instrução executada");
	}

	public void LD_BC_nn(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void LD__BC__A(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void INC_BC(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void INC_B(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void DEC_B(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void LD_B_n(byte n, GameBoyRegisters registers){
		registers.setB(n);

		logger.info("B: {}", GameBoyUtils.byteValue(registers.getB()));
		logger.info("LD B, n - Instrução executada");
	}

	public void RLCA(){
		throw new UnsupportedOperationException("Not yet implemented");
	}
	
    public void LD__nn__SP(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void ADD_HL_BC(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void LD_A__BC(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void DEC_BC(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void INC_C(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void DEC_C(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void LD_C_n(byte n, GameBoyRegisters registers){
		registers.setC(n);

		logger.info("C: {}", GameBoyUtils.byteValue(registers.getC()));
		logger.info("LD C, n - Instrução executada");
	}

	public void RRCA(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

    public void STOP(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void LD_DE_nn(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void LD__DE__A(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void INC_DE(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void INC_D(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void DEC_D(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void LD_D_n(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RLA(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

    public void JR_n(byte n, GameBoyRegisters registers){
		registers.setPC((short)(registers.getPC() + (n & 0xFF)));

		logger.info("PC: {}", GameBoyUtils.hexValue(registers.getPC()));
		logger.info("JR n - Instrução executada");
	}

	public void ADD_HL_DE(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void LD_A__DE(GameBoyBus bus, GameBoyRegisters registers){
		registers.setA(bus.read_memory(registers.getDE()));

		logger.info("A: {}", GameBoyUtils.byteValue(registers.getA()));
		logger.info("LD A, (DE) - Instrução executada");
	}

	public void DEC_DE(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void INC_E(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void DEC_E(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void LD_E_n(byte n, GameBoyRegisters registers){
		registers.setE(n);

		logger.info("E: {}", GameBoyUtils.byteValue(registers.getE()));
		logger.info("LD E, n - Instrução executada");
	}

	public void RRA(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

    public void JR_NZ_n(byte n, GameBoyRegisters registers){
		if (!registers.getZFlag()){
			registers.setPC((short)(registers.getPC() + (n & 0xFF)));
		}

		logger.info("PC: {}", GameBoyUtils.hexValue(registers.getPC()));
		logger.info("JR NC, n - Instrução executada");
	}

	public void LD_HL_nn(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void LDI__HL__A(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void INC_HL(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void INC_H(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void DEC_H(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void LD_H_n(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void DAA(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

    public void JR_Z_n(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void ADD_HL_HL(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void LDI_A__HL(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void DEC_HL(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void INC_L(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void DEC_L(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void LD_L_n(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void CPL(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

    public void JR_NC_n(byte n, GameBoyRegisters registers){
		if (!registers.getCFlag()){
			registers.setPC((short)(registers.getPC() + (n & 0xFF)));
		}

		logger.info("PC: {}", GameBoyUtils.hexValue(registers.getPC()));
		logger.info("JR NC, n - Instrução executada");
	}

	public void LD_SP_nn(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void LDD__HL__A(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void INC_SP(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void INC__HL(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void DEC__HL(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void LD__HL__n(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SCF(GameBoyRegisters registers){
		registers.setNFlag(false);
		registers.setHFlag(false);
		registers.setCFlag(true);

		logger.info("Flags - Z: {}, N: {}, H: {}, C: {}",
				registers.getZFlag(), registers.getNFlag(), registers.getHFlag(), registers.getCFlag());
		logger.info("SCF - Instrução executada");
	}

    public void JR_C_n(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void ADD_HL_SP(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void LDD_A__HL(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void DEC_SP(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void INC_A(GameBoyRegisters registers){
		registers.setA((byte) (registers.getA() + 1));

		logger.info("A: {}", GameBoyUtils.byteValue(registers.getA()));
		logger.info("INC A - Instrução executada");
	}

	public void DEC_A(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void LD_A_n(byte n, GameBoyRegisters registers){
		registers.setA(n);

		logger.info("A: {}", GameBoyUtils.byteValue(registers.getA()));
		logger.info("LD A, n - Instrução executada");
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
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void LD_B_C(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void LD_B_D(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void LD_B_E(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void LD_B_H(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void LD_B_L(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void LD_B__HL(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void LD_B_A(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

    public void LD_C_B(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void LD_C_C(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void LD_C_D(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void LD_C_E(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void LD_C_H(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void LD_C_L(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void LD_C__HL(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void LD_C_A(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

    public void LD_D_B(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void LD_D_C(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void LD_D_D(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void LD_D_E(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void LD_D_H(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void LD_D_L(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void LD_D__HL(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void LD_D_A(GameBoyRegisters registers){
		registers.setD(registers.getA());

		logger.info("D: {}, A: {}", GameBoyUtils.byteValue(registers.getD()), GameBoyUtils.byteValue(registers.getA()));
		logger.info("LD D, A - Instrução executada");
	}

    public void LD_E_B(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void LD_E_C(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void LD_E_D(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void LD_E_E(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void LD_E_H(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void LD_E_L(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void LD_E__HL(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void LD_E_A(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

    public void LD_H_B(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void LD_H_C(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void LD_H_D(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void LD_H_E(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void LD_H_H(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void LD_H_L(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void LD_H__HL(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void LD_H_A(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

    public void LD_L_B(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void LD_L_C(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void LD_L_D(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void LD_L_E(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void LD_L_H(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void LD_L_L(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void LD_L__HL(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void LD_L_A(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

    public void LD__HL__B(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void LD__HL__C(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void LD__HL__D(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void LD__HL__E(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void LD__HL__H(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void LD__HL__L(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void HALT(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void LD__HL__A(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

    public void LD_A_B(GameBoyRegisters registers){
		registers.setA(registers.getB());

		logger.info("A: {}, B: {}",
				GameBoyUtils.byteValue(registers.getA()), GameBoyUtils.byteValue(registers.getB()));
		logger.info("LD A, B - Instrução executada");
	}

	public void LD_A_C(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void LD_A_D(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void LD_A_E(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void LD_A_H(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void LD_A_L(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void LD_A__HL(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void LD_A_A(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

    public void ADD_A_B(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void ADD_A_C(GameBoyRegisters registers){
		int result = (registers.getA() & 0xFF) + (registers.getC() & 0xFF);

		registers.setNFlag(false);
		registers.setHFlag((registers.getA() & 0x0F) + (registers.getC() & 0x0F) > 0x0F);
		registers.setCFlag(result >= 0x100);
		registers.setZFlag(result == 0 || result == 0x100);

		registers.setA((byte)result);
		logger.info("A: {}", GameBoyUtils.byteValue(registers.getA()));
		logger.info("Flags - Z: {}, N: {}, H: {}, C: {}",
				registers.getZFlag(), registers.getNFlag(), registers.getHFlag(), registers.getCFlag());
		logger.info("SUB A, n - Instrução executada");
	}

	public void ADD_A_D(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void ADD_A_E(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void ADD_A_H(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void ADD_A_L(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void ADD_A__HL(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void ADD_A_A(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

    public void ADC_A_B(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void ADC_A_C(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void ADC_A_D(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void ADC_A_E(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void ADC_A_H(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void ADC_A_L(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void ADC_A__HL(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void ADC_A_A(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

    public void SUB_A_B(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SUB_A_C(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SUB_A_D(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SUB_A_E(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SUB_A_H(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SUB_A_L(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SUB_A__HL(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SUB_A_A(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

    public void SBC_A_B(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SBC_A_C(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SBC_A_D(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SBC_A_E(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SBC_A_H(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SBC_A_L(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SBC_A__HL(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SBC_A_A(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

    public void AND_B(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void AND_C(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void AND_D(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void AND_E(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void AND_H(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void AND_L(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void AND__HL(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void AND_A(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

    public void XOR_B(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void XOR_C(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void XOR_D(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void XOR_E(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void XOR_H(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void XOR_L(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void XOR__HL(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void XOR_A(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

    public void OR_B(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void OR_C(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void OR_D(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void OR_E(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void OR_H(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void OR_L(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void OR__HL(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void OR_A(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

    public void CP_B(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void CP_C(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void CP_D(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void CP_E(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void CP_H(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void CP_L(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void CP__HL(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void CP_A(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

    public void RET_NZ(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void POP_BC(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void JP_NZ_nn(short nn, GameBoyRegisters registers){
		if (!registers.getZFlag()){
			registers.setPC(nn);
		}

		logger.info("PC: {}", GameBoyUtils.hexValue(registers.getPC()));
		logger.info("JP NZ, nn - Instrução executada");
	}

	public void JP_nn(short nn, GameBoyRegisters registers){
		registers.setPC(nn);

		logger.info("PC: {}", GameBoyUtils.hexValue(registers.getPC()));
		logger.info("JP nn - Instrução executada");
	}

	public void CALL_NZ_nn(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void PUSH_BC(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void ADD_A_n(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RST_0(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

    public void RET_Z(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RET(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void JP_Z_nn(short nn, GameBoyRegisters registers){
		if (registers.getZFlag()){
			registers.setPC(nn);
		}

		logger.info("PC: {}", GameBoyUtils.hexValue(registers.getPC()));
		logger.info("JP Z, nn - Instrução executada");
	}

	public void TWO_BYTE(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void CALL_Z_nn(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void CALL_nn(short nn, GameBoyBus bus, GameBoyRegisters registers) {
    	bus.write_memory(registers.getSP(), (byte) (nn >> 8));
    	registers.setSP((short)((registers.getSP() & 0xFFFF) - 1));
		bus.write_memory(registers.getSP(), (byte) (nn << 8 >> 8));
		registers.setSP((short)((registers.getSP() & 0xFFFF) - 1));
		registers.setPC(nn);

		logger.info("Endereço: {}, Valor: {}", GameBoyUtils.hexValue(registers.getSP() + 1), GameBoyUtils.byteValue(nn >> 8));
		logger.info("Endereço: {}, Valor: {}", GameBoyUtils.hexValue(registers.getSP() + 2), GameBoyUtils.byteValue(nn << 8 >> 8));
		logger.info("SP: {}, PC: {}", GameBoyUtils.hexValue(registers.getSP()), GameBoyUtils.hexValue(registers.getPC()));
		logger.info("CALL nn - Instrução executada");
	}

	public void ADC_A_n(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RST_8(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

    public void RET_NC(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void POP_DE(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void JP_NC_nn(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void CALL_NC_nn(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void PUSH_DE(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SUB_A_n(byte n, GameBoyRegisters registers){
    	byte result = (byte) ((registers.getA() & 0xFF) - n);

		registers.setZFlag(result == 0);
		registers.setNFlag(true);
		registers.setHFlag((registers.getA() & 0x0F) < (n & 0x0F));
		registers.setCFlag(registers.getA() < n);

		registers.setA(result);
		logger.info("A: {}", GameBoyUtils.byteValue(registers.getA()));
		logger.info("Flags - Z: {}, N: {}, H: {}, C: {}",
				registers.getZFlag(), registers.getNFlag(), registers.getHFlag(), registers.getCFlag());
		logger.info("SUB A, n - Instrução executada");
	}

	public void RST_10(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

    public void RET_C(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RETI(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void JP_C_nn(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void CALL_C_nn(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SBC_A_n(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RST_18(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

    public void LDH__n__A(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void POP_HL(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void LDH__C__A(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void PUSH_HL(GameBoyBus bus, GameBoyRegisters registers){
		bus.write_memory(registers.getSP(), (byte) (registers.getHL() >> 8));
		registers.setSP((short)((registers.getSP() & 0xFFFF) - 1));
		bus.write_memory(registers.getSP(), (byte) (registers.getHL() << 8 >> 8));
		registers.setSP((short)((registers.getSP() & 0xFFFF) - 1));

		logger.info("Endereço: {}, Valor: {}", GameBoyUtils.hexValue(registers.getSP() + 1), GameBoyUtils.byteValue(registers.getHL() >> 8));
		logger.info("Endereço: {}, Valor: {}", GameBoyUtils.hexValue(registers.getSP() + 2), GameBoyUtils.byteValue(registers.getHL() << 8 >> 8));
		logger.info("SP: {}", GameBoyUtils.hexValue(registers.getSP()));
		logger.info("PUSH HL - Instrução executada");
	}

	public void AND_n(byte n, GameBoyRegisters registers){
		registers.setA((byte) (registers.getA() & n));

		logger.info("A: {}", GameBoyUtils.byteValue(registers.getA()));
		logger.info("AND n - Instrução executada");
	}

	public void RST_20(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

    public void ADD_SP_d(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void JP__HL(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void LD__nn__A(GameBoyBus bus, short nn, GameBoyRegisters registers){
		bus.write_memory(nn, registers.getA());

		logger.info("Endereço: {}, Valor: {}", GameBoyUtils.hexValue(nn), GameBoyUtils.byteValue(registers.getA()));
		logger.info("LD (nn), A - Instrução executada");
	}

	public void XOR_n(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RST_28(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

    public void LDH_A__n(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void POP_AF(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void DI(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void PUSH_AF(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void OR_n(byte n, GameBoyRegisters registers){
		registers.setA((byte) (registers.getA() | n));

		logger.info("A: {}", GameBoyUtils.byteValue(registers.getA()));
		logger.info("AND n - Instrução executada");
	}

	public void RST_30(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

    public void LDHL_SP_d(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void LD_SP_HL(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void LD_A__nn(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void EI(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void CP_n(byte n, GameBoyRegisters registers){
		short result = (short)((registers.getA() & 0xFF) - n);

		registers.setZFlag(result == 0);
		registers.setNFlag(true);
		registers.setHFlag((registers.getA() & 0x0F) < (n & 0x0F));
		registers.setCFlag(registers.getA() < n);

		logger.info("A: {}", GameBoyUtils.byteValue(registers.getA()));
		logger.info("Flags - Z: {}, N: {}, H: {}, C: {}",
				registers.getZFlag(), registers.getNFlag(), registers.getHFlag(), registers.getCFlag());
		logger.info("CP n - Instrução executada");
	}

	public void RST_38(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

    public void RLC_B(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RLC_C(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RLC_D(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RLC_E(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RLC_H(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RLC_L(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RLC__HL(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RLC_A(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

    public void RRC_B(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RRC_C(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RRC_D(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RRC_E(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RRC_H(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RRC_L(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RRC__HL(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RRC_A(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

    public void RL_B(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RL_C(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RL_D(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RL_E(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RL_H(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RL_L(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RL__HL(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RL_A(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

    public void RR_B(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RR_C(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RR_D(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RR_E(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RR_H(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RR_L(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RR__HL(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RR_A(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

    public void SLA_B(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SLA_C(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SLA_D(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SLA_E(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SLA_H(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SLA_L(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SLA__HL(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SLA_A(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

    public void SRA_B(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SRA_C(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SRA_D(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SRA_E(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SRA_H(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SRA_L(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SRA__HL(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SRA_A(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

    public void SWAP_B(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SWAP_C(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SWAP_D(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SWAP_E(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SWAP_H(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SWAP_L(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SWAP__HL(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SWAP_A(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

    public void SRL_B(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SRL_C(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SRL_D(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SRL_E(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SRL_H(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SRL_L(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SRL__HL(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SRL_A(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

    public void BIT_0_B(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void BIT_0_C(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void BIT_0_D(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void BIT_0_E(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void BIT_0_H(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void BIT_0_L(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void BIT_0__HL(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void BIT_0_A(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

    public void BIT_1_B(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void BIT_1_C(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void BIT_1_D(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void BIT_1_E(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void BIT_1_H(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void BIT_1_L(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void BIT_1__HL(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void BIT_1_A(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

    public void BIT_2_B(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void BIT_2_C(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void BIT_2_D(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void BIT_2_E(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void BIT_2_H(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void BIT_2_L(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void BIT_2__HL(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void BIT_2_A(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

    public void BIT_3_B(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void BIT_3_C(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void BIT_3_D(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void BIT_3_E(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void BIT_3_H(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void BIT_3_L(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void BIT_3__HL(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void BIT_3_A(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

    public void BIT_4_B(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void BIT_4_C(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void BIT_4_D(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void BIT_4_E(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void BIT_4_H(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void BIT_4_L(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void BIT_4__HL(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void BIT_4_A(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

    public void BIT_5_B(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void BIT_5_C(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void BIT_5_D(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void BIT_5_E(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void BIT_5_H(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void BIT_5_L(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void BIT_5__HL(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void BIT_5_A(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

    public void BIT_6_B(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void BIT_6_C(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void BIT_6_D(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void BIT_6_E(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void BIT_6_H(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void BIT_6_L(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void BIT_6__HL(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void BIT_6_A(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

    public void BIT_7_B(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void BIT_7_C(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void BIT_7_D(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void BIT_7_E(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void BIT_7_H(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void BIT_7_L(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void BIT_7__HL(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void BIT_7_A(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

    public void RES_0_B(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RES_0_C(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RES_0_D(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RES_0_E(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RES_0_H(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RES_0_L(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RES_0__HL(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RES_0_A(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

    public void RES_1_B(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RES_1_C(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RES_1_D(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RES_1_E(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RES_1_H(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RES_1_L(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RES_1__HL(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RES_1_A(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

    public void RES_2_B(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RES_2_C(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RES_2_D(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RES_2_E(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RES_2_H(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RES_2_L(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RES_2__HL(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RES_2_A(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

    public void RES_3_B(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RES_3_C(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RES_3_D(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RES_3_E(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RES_3_H(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RES_3_L(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RES_3__HL(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RES_3_A(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

    public void RES_4_B(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RES_4_C(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RES_4_D(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RES_4_E(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RES_4_H(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RES_4_L(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RES_4__HL(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RES_4_A(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

    public void RES_5_B(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RES_5_C(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RES_5_D(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RES_5_E(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RES_5_H(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RES_5_L(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RES_5__HL(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RES_5_A(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

    public void RES_6_B(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RES_6_C(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RES_6_D(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RES_6_E(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RES_6_H(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RES_6_L(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RES_6__HL(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RES_6_A(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

    public void RES_7_B(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RES_7_C(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RES_7_D(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RES_7_E(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RES_7_H(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RES_7_L(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RES_7__HL(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void RES_7_A(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

    public void SET_0_B(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SET_0_C(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SET_0_D(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SET_0_E(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SET_0_H(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SET_0_L(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SET_0__HL(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SET_0_A(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

    public void SET_1_B(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SET_1_C(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SET_1_D(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SET_1_E(GameBoyRegisters registers){
		registers.setE((byte) (registers.getE() | (1 << 1)));

		logger.info("E: {}", GameBoyUtils.byteValue(registers.getE()));
		logger.info("SET 1, E - Instrução executada");
	}

	public void SET_1_H(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SET_1_L(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SET_1__HL(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SET_1_A(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

    public void SET_2_B(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SET_2_C(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SET_2_D(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SET_2_E(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SET_2_H(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SET_2_L(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SET_2__HL(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SET_2_A(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

    public void SET_3_B(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SET_3_C(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SET_3_D(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SET_3_E(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SET_3_H(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SET_3_L(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SET_3__HL(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SET_3_A(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

    public void SET_4_B(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SET_4_C(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SET_4_D(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SET_4_E(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SET_4_H(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SET_4_L(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SET_4__HL(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SET_4_A(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

    public void SET_5_B(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SET_5_C(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SET_5_D(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SET_5_E(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SET_5_H(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SET_5_L(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SET_5__HL(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SET_5_A(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

    public void SET_6_B(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SET_6_C(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SET_6_D(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SET_6_E(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SET_6_H(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SET_6_L(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SET_6__HL(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SET_6_A(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

    public void SET_7_B(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SET_7_C(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SET_7_D(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SET_7_E(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SET_7_H(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SET_7_L(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SET_7__HL(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void SET_7_A(){
		throw new UnsupportedOperationException("Not yet implemented");
	}
}
