package razas.terran.unidades;

import razas.Terran;
import razas.interfaces.Unidad;

public abstract class UnidadTerran extends Terran implements Unidad {

	protected int transporte, vision, danioTierra, danioAire, suministro, rangoAire, rangoTierra;
	
	public int getTransporte() { return this.transporte; }
	public int getVision() { return this.vision; }
	public int getDanioTierra() { return this.danioTierra; }
	public int getDanioAire() { return this.danioAire; }
	public int getSuministro() { return this.suministro; }
	public int getRangoAire() { return this.rangoAire; }
	public int getRangoTierra() { return this. rangoTierra; } 
	
}