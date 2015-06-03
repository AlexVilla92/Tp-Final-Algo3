package razas.protoss.construcciones;

import mapa.Recurso;
import mapa.excepciones.RecursoAgotado;
import razas.Protoss;
import razas.interfaces.Construccion;
import razas.interfaces.Recolector;

public class Asimilador extends Protoss implements Construccion, Recolector {

	private int gasVespenoRecolectado;
	
	public Asimilador() {
		
		super();
		this.vida = 450;
		this.escudo = 450;
		this.gasVespenoRecolectado = 0;
	}
	
	@Override
	public boolean esVolador() { return false; }
	
	@Override
	protected int escudoPerfecto() { return 450; }

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
