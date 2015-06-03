package razas.protoss.construcciones;

import mapa.Recurso;
import mapa.excepciones.RecursoAgotado;
import razas.Protoss;
import razas.interfaces.Construccion;
import razas.interfaces.Recolector;

public class NexoMineral extends Protoss implements Construccion, Recolector {

	private int mineralesRecolectados;
	
	public NexoMineral() {
		
		super();
		this.vida = 250;
		this.escudo = 250;
		this.mineralesRecolectados = 0;
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

	@Override
	public int totalRecolectado() { return this.mineralesRecolectados; }

	@Override
	public int recolectar(Recurso nodo) throws RecursoAgotado {
		int extraido = nodo.extraer();
		this.mineralesRecolectados += extraido;
		
		return extraido;
	}
}
