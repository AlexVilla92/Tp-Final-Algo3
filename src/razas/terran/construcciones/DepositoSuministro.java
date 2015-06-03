package razas.terran.construcciones;

import razas.Terran;
import razas.interfaces.Construccion;

public class DepositoSuministro extends Terran implements Construccion {

	public DepositoSuministro() {
		
		super();
		this.vida = 500;
		
	}

	@Override
	public boolean esVolador() { return false; }
	
	@Override
	public int getCostoMinerales() { return 100; }

	@Override
	public int getCostoGasVespeno() { return 0; }

	@Override
	public int getTiempoDeConstruccion() { return 6; }
	
	public int capacidadDePoblacion() { return 5; }
		
}
