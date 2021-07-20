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

	public void LD__BC__A(GameBoyBus bus, GameBoyRegisters registers){
		bus.write_memory(registers.getBC(), registers.getA());

		logger.info("Endereço: {}, Valor: {}", GameBoyUtils.hexValue(registers.getBC()), GameBoyUtils.byteValue(registers.getA()));
		logger.info("LD (BC), A - Instrução executada");
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

	public void LDI_A__HL(GameBoyBus bus, GameBoyRegisters registers){
		registers.setA(bus.read_memory(registers.getHL()));
		registers.setHL((short) (registers.getHL()+1));

		logger.info("Endereço: {}, Valor: {}", GameBoyUtils.hexValue(registers.getHL() - 1), GameBoyUtils.byteValue(registers.getA()));
		logger.info("H: {}, L: {}", GameBoyUtils.byteValue(registers.getH()), GameBoyUtils.byteValue(registers.getL()));
		logger.info("LDI A, (HL) - Instrução executada");
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

	public void LD_B_D(GameBoyRegisters registers){
		registers.setB(registers.getD());

		logger.info("B: {}, D: {}",
				GameBoyUtils.byteValue(registers.getB()), GameBoyUtils.byteValue(registers.getD()));
		logger.info("LD B, D - Instrução executada");
	}

	public void LD_B_E(GameBoyRegisters registers){
		registers.setB(registers.getE());

		logger.info("B: {}, E: {}",
				GameBoyUtils.byteValue(registers.getB()), GameBoyUtils.byteValue(registers.getE()));
		logger.info("LD B, E - Instrução executada");
	}

	public void LD_B_H(GameBoyRegisters registers){
		registers.setB(registers.getH());

		logger.info("B: {}, H: {}",
				GameBoyUtils.byteValue(registers.getB()), GameBoyUtils.byteValue(registers.getH()));
		logger.info("LD B, H - Instrução executada");
	}

	public void LD_B_L(GameBoyRegisters registers){
		registers.setB(registers.getL());

		logger.info("B: {}, L: {}",
				GameBoyUtils.byteValue(registers.getB()), GameBoyUtils.byteValue(registers.getL()));
		logger.info("LD B, L - Instrução executada");
	}

	public void LD_B__HL(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void LD_B_A(GameBoyRegisters registers){
		registers.setB(registers.getA());

		logger.info("B: {}, A: {}",
				GameBoyUtils.byteValue(registers.getB()), GameBoyUtils.byteValue(registers.getA()));
		logger.info("LD B, A - Instrução executada");
	}

    public void LD_C_B(GameBoyRegisters registers){
		registers.setC(registers.getB());

		logger.info("C: {}, B: {}",
				GameBoyUtils.byteValue(registers.getC()), GameBoyUtils.byteValue(registers.getB()));
		logger.info("LD C, B - Instrução executada");
	}

	public void LD_C_C(GameBoyRegisters registers){
		registers.setC(registers.getC());

		logger.info("C: {}", GameBoyUtils.byteValue(registers.getC()));
		logger.info("LD C, C - Instrução executada");
	}

	public void LD_C_D(GameBoyRegisters registers){
		registers.setC(registers.getD());

		logger.info("C: {}, D: {}",
				GameBoyUtils.byteValue(registers.getC()), GameBoyUtils.byteValue(registers.getD()));
		logger.info("LD C, D - Instrução executada");
	}

	public void LD_C_E(GameBoyRegisters registers){
		registers.setC(registers.getE());

		logger.info("C: {}, E: {}",
				GameBoyUtils.byteValue(registers.getC()), GameBoyUtils.byteValue(registers.getE()));
		logger.info("LD C, E - Instrução executada");
	}

	public void LD_C_H(GameBoyRegisters registers){
		registers.setC(registers.getH());

		logger.info("C: {}, H: {}",
				GameBoyUtils.byteValue(registers.getC()), GameBoyUtils.byteValue(registers.getH()));
		logger.info("LD C, H - Instrução executada");
	}

	public void LD_C_L(GameBoyRegisters registers){
		registers.setC(registers.getL());

		logger.info("C: {}, L: {}",
				GameBoyUtils.byteValue(registers.getC()), GameBoyUtils.byteValue(registers.getL()));
		logger.info("LD C, L - Instrução executada");
	}

	public void LD_C__HL(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void LD_C_A(GameBoyRegisters registers){
		registers.setC(registers.getA());

		logger.info("C: {}, A: {}",
				GameBoyUtils.byteValue(registers.getC()), GameBoyUtils.byteValue(registers.getA()));
		logger.info("LD C, A - Instrução executada");
	}

    public void LD_D_B(GameBoyRegisters registers){
		registers.setD(registers.getB());

		logger.info("D: {}, B: {}",
				GameBoyUtils.byteValue(registers.getD()), GameBoyUtils.byteValue(registers.getB()));
		logger.info("LD D, B - Instrução executada");
	}

	public void LD_D_C(GameBoyRegisters registers){
		registers.setD(registers.getC());

		logger.info("D: {}, C: {}",
				GameBoyUtils.byteValue(registers.getD()), GameBoyUtils.byteValue(registers.getC()));
		logger.info("LD D, C - Instrução executada");
	}

	public void LD_D_D(GameBoyRegisters registers){
		registers.setD(registers.getD());

		logger.info("D: {}", GameBoyUtils.byteValue(registers.getD()));
		logger.info("LD D, D - Instrução executada");
	}

	public void LD_D_E(GameBoyRegisters registers){
		registers.setD(registers.getE());

		logger.info("D: {}, E: {}",
				GameBoyUtils.byteValue(registers.getD()), GameBoyUtils.byteValue(registers.getE()));
		logger.info("LD D, E - Instrução executada");
	}

	public void LD_D_H(GameBoyRegisters registers){
		registers.setD(registers.getH());

		logger.info("D: {}, H: {}",
				GameBoyUtils.byteValue(registers.getD()), GameBoyUtils.byteValue(registers.getH()));
		logger.info("LD D, H - Instrução executada");
	}

	public void LD_D_L(GameBoyRegisters registers){
		registers.setD(registers.getL());

		logger.info("D: {}, L: {}",
				GameBoyUtils.byteValue(registers.getD()), GameBoyUtils.byteValue(registers.getL()));
		logger.info("LD D, L - Instrução executada");
	}

	public void LD_D__HL(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void LD_D_A(GameBoyRegisters registers){
		registers.setD(registers.getA());

		logger.info("D: {}, A: {}", GameBoyUtils.byteValue(registers.getD()), GameBoyUtils.byteValue(registers.getA()));
		logger.info("LD D, A - Instrução executada");
	}

    public void LD_E_B(GameBoyRegisters registers){
		registers.setE(registers.getB());

		logger.info("E: {}, B: {}",
				GameBoyUtils.byteValue(registers.getE()), GameBoyUtils.byteValue(registers.getB()));
		logger.info("LD E, B - Instrução executada");
	}

	public void LD_E_C(GameBoyRegisters registers){
		registers.setE(registers.getC());

		logger.info("E: {}, C: {}",
				GameBoyUtils.byteValue(registers.getE()), GameBoyUtils.byteValue(registers.getC()));
		logger.info("LD E, C - Instrução executada");
	}

	public void LD_E_D(GameBoyRegisters registers){
		registers.setE(registers.getD());

		logger.info("E: {}, D: {}",
				GameBoyUtils.byteValue(registers.getE()), GameBoyUtils.byteValue(registers.getD()));
		logger.info("LD E, D - Instrução executada");
	}

	public void LD_E_E(GameBoyRegisters registers){
		registers.setE(registers.getE());

		logger.info("E: {}", GameBoyUtils.byteValue(registers.getE()));
		logger.info("LD E, E - Instrução executada");
	}

	public void LD_E_H(GameBoyRegisters registers){
		registers.setE(registers.getH());

		logger.info("E: {}, H: {}",
				GameBoyUtils.byteValue(registers.getE()), GameBoyUtils.byteValue(registers.getH()));
		logger.info("LD E, H - Instrução executada");
	}

	public void LD_E_L(GameBoyRegisters registers){
		registers.setE(registers.getL());

		logger.info("E: {}, L: {}",
				GameBoyUtils.byteValue(registers.getE()), GameBoyUtils.byteValue(registers.getL()));
		logger.info("LD E, L - Instrução executada");
	}

	public void LD_E__HL(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void LD_E_A(GameBoyRegisters registers){
		registers.setE(registers.getA());

		logger.info("E: {}, A: {}",
				GameBoyUtils.byteValue(registers.getE()), GameBoyUtils.byteValue(registers.getA()));
		logger.info("LD E, A - Instrução executada");
	}

    public void LD_H_B(GameBoyRegisters registers){
		registers.setH(registers.getB());

		logger.info("H: {}, B: {}",
				GameBoyUtils.byteValue(registers.getH()), GameBoyUtils.byteValue(registers.getB()));
		logger.info("LD H, B - Instrução executada");
	}

	public void LD_H_C(GameBoyRegisters registers){
		registers.setH(registers.getC());

		logger.info("H: {}, C: {}",
				GameBoyUtils.byteValue(registers.getH()), GameBoyUtils.byteValue(registers.getC()));
		logger.info("LD H, C - Instrução executada");
	}

	public void LD_H_D(GameBoyRegisters registers){
		registers.setH(registers.getD());

		logger.info("H: {}, D: {}",
				GameBoyUtils.byteValue(registers.getH()), GameBoyUtils.byteValue(registers.getD()));
		logger.info("LD H, D - Instrução executada");
	}

	public void LD_H_E(GameBoyRegisters registers){
		registers.setH(registers.getE());

		logger.info("H: {}, E: {}",
				GameBoyUtils.byteValue(registers.getH()), GameBoyUtils.byteValue(registers.getE()));
		logger.info("LD H, E - Instrução executada");
	}

	public void LD_H_H(GameBoyRegisters registers){
		registers.setH(registers.getH());

		logger.info("H: {}", GameBoyUtils.byteValue(registers.getH()));
		logger.info("LD H, H - Instrução executada");
	}

	public void LD_H_L(GameBoyRegisters registers){
		registers.setH(registers.getL());

		logger.info("H: {}, L: {}",
				GameBoyUtils.byteValue(registers.getH()), GameBoyUtils.byteValue(registers.getL()));
		logger.info("LD H, L - Instrução executada");
	}

	public void LD_H__HL(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void LD_H_A(GameBoyRegisters registers){
		registers.setH(registers.getA());

		logger.info("H: {}, A: {}",
				GameBoyUtils.byteValue(registers.getH()), GameBoyUtils.byteValue(registers.getA()));
		logger.info("LD H, A - Instrução executada");
	}

    public void LD_L_B(GameBoyRegisters registers){
		registers.setL(registers.getB());

		logger.info("L: {}, B: {}",
				GameBoyUtils.byteValue(registers.getL()), GameBoyUtils.byteValue(registers.getB()));
		logger.info("LD L, B - Instrução executada");
	}

	public void LD_L_C(GameBoyRegisters registers){
		registers.setL(registers.getC());

		logger.info("L: {}, C: {}",
				GameBoyUtils.byteValue(registers.getL()), GameBoyUtils.byteValue(registers.getC()));
		logger.info("LD L, C - Instrução executada");
	}

	public void LD_L_D(GameBoyRegisters registers){
		registers.setL(registers.getD());

		logger.info("L: {}, D: {}",
				GameBoyUtils.byteValue(registers.getL()), GameBoyUtils.byteValue(registers.getD()));
		logger.info("LD L, D - Instrução executada");
	}

	public void LD_L_E(GameBoyRegisters registers){
		registers.setL(registers.getE());

		logger.info("L: {}, E: {}",
				GameBoyUtils.byteValue(registers.getL()), GameBoyUtils.byteValue(registers.getE()));
		logger.info("LD L, E - Instrução executada");
	}

	public void LD_L_H(GameBoyRegisters registers){
		registers.setL(registers.getH());

		logger.info("L: {}, H: {}",
				GameBoyUtils.byteValue(registers.getL()), GameBoyUtils.byteValue(registers.getH()));
		logger.info("LD L, H - Instrução executada");
	}

	public void LD_L_L(GameBoyRegisters registers){
		registers.setL(registers.getL());

		logger.info("L: {}",GameBoyUtils.byteValue(registers.getL()));
		logger.info("LD L, L - Instrução executada");
	}

	public void LD_L__HL(){
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void LD_L_A(GameBoyRegisters registers){
		registers.setL(registers.getA());

		logger.info("L: {}, A: {}",
				GameBoyUtils.byteValue(registers.getL()), GameBoyUtils.byteValue(registers.getA()));
		logger.info("LD L, A - Instrução executada");
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

	public void OR_A(GameBoyRegisters registers){
    	byte result = (byte) (registers.getA() | registers.getA());
		registers.setA(result);

		registers.setZFlag(result == 0);
		registers.setNFlag(false);
		registers.setHFlag(true);
		registers.setCFlag(false);

		logger.info("A: {}", GameBoyUtils.byteValue(registers.getA()));
		logger.info("Flags - Z: {}, N: {}, H: {}, C: {}",
				registers.getZFlag(), registers.getNFlag(), registers.getHFlag(), registers.getCFlag());
		logger.info("OR A - Instrução executada");
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
    	byte result = (byte) (registers.getA() & n);
		registers.setA(result);

		registers.setZFlag(result == 0);
		registers.setNFlag(false);
		registers.setHFlag(true);
		registers.setCFlag(false);

		logger.info("A: {}", GameBoyUtils.byteValue(registers.getA()));
		logger.info("Flags - Z: {}, N: {}, H: {}, C: {}",
				registers.getZFlag(), registers.getNFlag(), registers.getHFlag(), registers.getCFlag());
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
