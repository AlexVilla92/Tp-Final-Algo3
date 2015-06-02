package razas.terran.construcciones;

import razas.Terran;
import razas.interfaces.Construccion;

public class CentroDeMineral extends Terran implements Construccion {
	
	public CentroDeMineral() {
		
		super();
		this.vida = 500;
		this.esVolador = false;
		
	}

	@Override
	public int costoMinerales() { return 50; }

	@Override
	public int costoGasVespeno() { return 0; }

	@Override
	public int tiempoDeConstruccion() { return 4; }
	
}
