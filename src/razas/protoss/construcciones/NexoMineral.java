package razas.protoss.construcciones;

import razas.Protoss;
import razas.interfaces.Construccion;

public class NexoMineral extends Protoss implements Construccion {

	public NexoMineral() {
		
		super();
		this.vida = 250;
		this.escudo = 250;
		
	}
	
	@Override
	public boolean esVolador() { return false; }
	
	@Override
	protected int escudoPerfecto() { return 250; }
	
	@Override
	public int getCostoMinerales() { return 50; }

	@Override
	public int getCostoGasVespeno() { return 0; }

	@Override
	public int getTiempoDeConstruccion() { return 4; }

}
