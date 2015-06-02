package razas.terran.unidades;

import razas.Terran;
import razas.interfaces.Unidad;

public class NaveCiencia extends Terran implements Unidad {
	
	//Esta es una unidad magica, falta implementar metodos de magia
	
	public NaveCiencia() {
		
		super();
		this.vida = 200;
		this.esVolador = true;
		
	}
	
	@Override
	public int getTransporte() { return 0; }
	
	@Override
	public int getVision() { return 10; }
	
	@Override
	public int getCostoMinerales() { return 100; }
	
	@Override
	public int getCostoGasVespeno() { return 225; }
	
	@Override
	public int getTiempoDeConstruccion() { return 10; }
	
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
