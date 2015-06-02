package razas.terran.unidades;

import razas.Terran;
import razas.interfaces.Unidad;

public class Marine extends Terran implements Unidad {
	
	public Marine() {
		
		super();
		this.vida = 40;
		this.esVolador = false;
		
	}
	
	@Override
	public int getTransporte() { return 1; }
	
	@Override
	public int getVision() { return 7; }
	
	@Override
	public int getCostoMinerales() { return 50; }
	
	@Override
	public int getCostoGasVespeno() { return 0; }
	
	@Override
	public int getTiempoDeConstruccion() { return 3; }
	
	@Override
	public int getDanioAire() { return 6; }
	
	@Override
	public int getDanioTierra() { return 6; }
	
	@Override
	public int getSuministro() { return 1; }
	
	@Override
	public int getRangoAire() { return 4; }
	
	@Override
	public int getRangoTierra() { return 4; }
	
}
