package razas.protoss.construcciones;

import razas.Protoss;
import razas.interfaces.Construccion;

public class Pilon extends Protoss implements Construccion {

	public Pilon() {
		
		super();
		this.vida = 300;
		this.escudo = 300;
		
	}

	@Override
	public boolean esVolador() { return false; }
	
	@Override
	protected int escudoPerfecto() { return 300; }
	
	@Override
	public int getCostoMinerales() { return 100; }

	@Override
	public int getCostoGasVespeno() { return 0; }

	@Override
	public int getTiempoDeConstruccion() { return 5; }
	
	public int capacidadDePoblacion() { return 5; }
	
}
