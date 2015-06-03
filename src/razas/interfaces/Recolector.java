package razas.interfaces;

import mapa.Recurso;
import mapa.excepciones.RecursoAgotado;

public interface Recolector {
	
	public int totalRecolectado();
	public void recolectar(Recurso r) throws RecursoAgotado;

}
