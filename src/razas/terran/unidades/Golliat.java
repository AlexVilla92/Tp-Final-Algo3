package razas.terran.unidades;

import razas.Terran;
import razas.interfaces.Unidad;

public class Golliat extends Terran implements Unidad {
	
	public Golliat() {
		
		super();
		this.vida = 125;
		
	}
	
	@Override
	public boolean esVolador() { return false; }
	
	@Override
	public int getTransporte() { return 2; }
	
	@Override
	public int getVision() { return 8; }
	
	@Override
	public int getCostoMinerales() { return 100; }
	
	@Override
	public int getCostoGasVespeno() { return 50; }
	
	@Override
	public int getTiempoDeConstruccion() { return 6; }
	
	@Override
	public int getDanioAire() { return 10; }
	
	@Override
	public int getDanioTierra() { return 12; }
	
	@Override
	public int getSuministro() { return 2; }
	
	@Override
	public int getRangoAire() { return 5; }
	
	@Override
	public int getRangoTierra() { return 6; }
	
}
