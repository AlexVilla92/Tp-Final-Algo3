package razas.terran.unidades;

import razas.Terran;
import razas.interfaces.Unidad;

public class Espectro extends Terran implements Unidad {
	
	public Espectro() {
		
		super();
		this.vida = 120;
		
	}
	
	@Override
	public boolean esVolador() { return true; }
	
	@Override
	public int getTransporte() { return 0; }
	
	@Override
	public int getVision() { return 7; }
	
	@Override
	public int getCostoMinerales() { return 150; }
	
	@Override
	public int getCostoGasVespeno() { return 100; }
	
	@Override
	public int getTiempoDeConstruccion() { return 8; }
	
	@Override
	public int getDanioAire() { return 20; }
	
	@Override
	public int getDanioTierra() { return 8; }
	
	@Override
	public int getSuministro() { return 2; }
	
	@Override
	public int getRangoAire() { return 5; }
	
	@Override
	public int getRangoTierra() { return 5; }
	
}
