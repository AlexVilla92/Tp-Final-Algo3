package razas.protoss.unidades;

import razas.Protoss;
import razas.interfaces.Unidad;

public class NaveTransporte extends Protoss implements Unidad {

	public NaveTransporte() {
		
		super();
		this.vida = 80;
		this.esVolador = true; //No esta especificado, solo dice capacidad
		this.escudo = 60;
		this.escudoPerfecto = 60;
		
	}
	
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
