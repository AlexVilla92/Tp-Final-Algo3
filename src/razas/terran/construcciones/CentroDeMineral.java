package razas.terran.construcciones;

import mapa.Recurso;
import mapa.excepciones.RecursoAgotado;
import razas.Terran;
import razas.interfaces.Construccion;
import razas.interfaces.Recolector;

public class CentroDeMineral extends Terran implements Construccion, Recolector {
	
	private int mineralesRecolectados;
	
	public CentroDeMineral() {
		super();
		this.vida = 500;
		this.mineralesRecolectados = 0;
	}
	
	@Override
	public boolean esVolador() { return false; }

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
		
		if(this.tieneJugador()) {
			this.notificarMineralesObtenidos(extraido);
		}
		
		return extraido;
	}
	
	private void notificarMineralesObtenidos(int cantidad) {
		this.getJugador().obtenerMinerales(cantidad);		
	}
	
}
