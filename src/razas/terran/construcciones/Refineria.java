package razas.terran.construcciones;

import mapa.Recurso;
import mapa.excepciones.RecursoAgotado;
import razas.Terran;
import razas.interfaces.Construccion;
import razas.interfaces.Recolector;

public class Refineria extends Terran implements Construccion, Recolector {
	
	private int gasVespenoRecolectado;
	
	public Refineria() {
		
		super();
		this.vida = 750;
		this.gasVespenoRecolectado = 0;
	}
	
	@Override
	public boolean esVolador() { return false; }

	@Override
	public int getCostoMinerales() { return 100; }

	@Override
	public int getCostoGasVespeno() { return 0; }

	@Override
	public int getTiempoDeConstruccion() { return 6; }
	
	@Override
	public int totalRecolectado() { return this.gasVespenoRecolectado; }
	
	@Override
	public void recolectar(Recurso nodo) throws RecursoAgotado {
		this.gasVespenoRecolectado += nodo.extraer();
	}
	
}
