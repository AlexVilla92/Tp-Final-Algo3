package razas.terran.unidades;

import razas.Terran;
import razas.interfaces.Unidad;

public class NaveTransporte extends Terran implements Unidad {
	
	public NaveTransporte() {
		
		super();
		this.vida = 150;
		this.esVolador = true; //No esta especificado, solo dice capacidad
		
	}
	
	public int getCapacidad() { return 8; }
	
	@Override
	public int getTransporte() { return 0; } //No esta especificado, solo dice capacidad
	
	@Override
	public int getVision() { return 8; }
	
	@Override
	public int getCostoMinerales() { return 100; }
	
	@Override
	public int getCostoGasVespeno() { return 100; }
	
	@Override
	public int getTiempoDeConstruccion() { return 7; }
	
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
