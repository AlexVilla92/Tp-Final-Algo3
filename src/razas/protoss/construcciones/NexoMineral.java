package razas.protoss.construcciones;

import razas.Protoss;
import razas.interfaces.Construccion;

public class NexoMineral extends Protoss implements Construccion {

	public NexoMineral() {
		
		super();
		this.vida = 250;
		this.escudo = 250;
		this.escudoPerfecto = 250;
		
	}
	
	@Override
	public int costoMinerales() { return 50; }

	@Override
	public int costoGasVespeno() { return 0; }

	@Override
	public int tiempoDeConstruccion() { return 4; }

}
