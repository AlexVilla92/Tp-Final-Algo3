package razas;

public abstract class Especie {
	
	protected int costoMinerales, costoGasVespeno, tiempoDeConstruccion, vida;
	protected boolean esVolador;
	
	public int getCostoMinerales() { return costoMinerales; }
	public int getCostoGasVespeno() { return costoGasVespeno; }
	public int getTiempoDeConstruccion() { return this.tiempoDeConstruccion; }
	public int getVida() { return this.vida; }
	public boolean esVolador() { return this.esVolador; }
	
}
