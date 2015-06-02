package razas.protoss.unidades;

import razas.Protoss;
import razas.interfaces.Unidad;

public class Scout extends Protoss implements Unidad {

	public Scout() {
		
		super();
		this.vida = 150;
		this.esVolador = true;
		this.escudo = 100;
		this.escudoPerfecto = 100;
		
	}
	
	@Override
	public int getTransporte() { return 0; }
	
	@Override
	public int getVision() { return 7; }
	
	@Override
	public int getCostoMinerales() { return 300; }
	
	@Override
	public int getCostoGasVespeno() { return 150; }
	
	@Override
	public int getTiempoDeConstruccion() { return 9; }
	
	@Override
	public int getDanioAire() { return 14; }
	
	@Override
	public int getDanioTierra() { return 8; }
	
	@Override
	public int getSuministro() { return 3; }
	
	@Override
	public int getRangoAire() { return 4; }
	
	@Override
	public int getRangoTierra() { return 4; }
	
}
