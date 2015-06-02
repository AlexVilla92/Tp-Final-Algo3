package razas.protoss.unidades;

import razas.Protoss;
import razas.interfaces.Unidad;

public class Zealot extends Protoss implements Unidad {

	public Zealot() {
		
		super();
		this.vida = 100;
		this.escudo = 60;
		
	}
	
	@Override
	public boolean esVolador() { return false; }
	
	@Override
	protected int escudoPerfecto() { return 60; }
	
	@Override
	public int getTransporte() { return 2; }
	
	@Override
	public int getVision() { return 7; }
	
	@Override
	public int getCostoMinerales() { return 100; }
	
	@Override
	public int getCostoGasVespeno() { return 0; }
	
	@Override
	public int getTiempoDeConstruccion() { return 4; }
	
	@Override
	public int getDanioAire() { return 0; }
	
	@Override
	public int getDanioTierra() { return 8; }
	
	@Override
	public int getSuministro() { return 2; }
	
	@Override
	public int getRangoAire() { return 1; }
	
	@Override
	public int getRangoTierra() { return 1; }
	
}
