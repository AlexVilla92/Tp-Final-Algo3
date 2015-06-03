package mapa.interfaces;

import mapa.excepciones.RecursoAgotado;

public interface Recolectable {
	
	public boolean estaAgotado();
	public int extraer() throws RecursoAgotado;

}
