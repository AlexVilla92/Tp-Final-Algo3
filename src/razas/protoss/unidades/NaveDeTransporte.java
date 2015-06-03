package razas.protoss.unidades;

import razas.Protoss;
import razas.interfaces.Unidad;

public class NaveDeTransporte extends Protoss implements Unidad {

	public NaveDeTransporte() {
		
		super();
		this.vida = 80;
		this.escudo = 60;

	}
	
	@Override
	public boolean esVolador() { return true; } //No esta especificado, solo dice capacidad
	
	@Override
	protected int escudoPerfecto() { return 60; }
	
	public int getCapacidad() { return 8; } //No esta especificado, solo dice capacidad
	
	@Override
	public int getTransporte() { return 0; }
	
	@Override
	public int getVision() { return 8; }
	
	@Override
	public int getCostoMinerales() { return 200; }
	
	@Override
	public int getCostoGasVespeno() { return 0; }
	
	@Override
	public int getTiempoDeConstruccion() { return 8; }
	
	@Override
	public int getDanioAire() { return 0; }
	
	@Override
	public int getDanioTierra() { return 0; }
	
	@Override
	public int getSuministro() { return 2; }
	
	@Override
	public int getRangoAire() { return 0; }
	
	@Override
	public int getRangoTierra() { return 0; }
	
}
