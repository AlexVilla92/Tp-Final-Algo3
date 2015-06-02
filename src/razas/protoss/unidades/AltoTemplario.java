package razas.protoss.unidades;

import razas.Protoss;
import razas.interfaces.Unidad;

public class AltoTemplario extends Protoss implements Unidad {
	
	//Esta es una unidad magica, falta implementar metodos de magia

	public AltoTemplario() {
		
		super();
		this.vida = 40;
		this.esVolador = false;
		this.escudo = 40;
		this.escudoPerfecto = 40;
		
	}
	
	@Override
	public int getTransporte() { return 2; }
	
	@Override
	public int getVision() { return 7; }
	
	@Override
	public int getCostoMinerales() { return 50; }
	
	@Override
	public int getCostoGasVespeno() { return 150; }
	
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
