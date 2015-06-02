package razas.protoss.unidades;

import razas.Protoss;
import razas.interfaces.Unidad;

public class Dragon extends Protoss implements Unidad {

	public Dragon() {
		
		super();
		this.vida = 100;
		this.escudo = 80;
		
	}
	
	@Override
	public boolean esVolador() { return false; }
	
	@Override
	protected int escudoPerfecto() { return 80; }
	
	@Override
	public int getTransporte() { return 4; }
	
	@Override
	public int getVision() { return 8; }
	
	@Override
	public int getCostoMinerales() { return 125; }
	
	@Override
	public int getCostoGasVespeno() { return 50; }
	
	@Override
	public int getTiempoDeConstruccion() { return 6; }
	
	@Override
	public int getDanioAire() { return 20; }
	
	@Override
	public int getDanioTierra() { return 20; }
	
	@Override
	public int getSuministro() { return 2; }
	
	@Override
	public int getRangoAire() { return 4; }
	
	@Override
	public int getRangoTierra() { return 4; }
	
}

