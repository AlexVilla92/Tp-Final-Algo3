package mapa;

import mapa.excepciones.CeldaNoVacia;
import razas.interfaces.Unidad;

public class Celda {
	
	private Unidad unidad;
	private Material base;
	
	public Celda(Material base) {
		this.base = base;
		this.unidad = null;
	}

	public void agregarUnidad(Unidad unidad) throws CeldaNoVacia {
		if (this.estaVacia()) {
			this.unidad = unidad;
		} else {
			throw new CeldaNoVacia();
		}
	}
	
	public Unidad getUnidad() {
		return this.unidad;
	}
	
	public void removerUnidad() {
		this.unidad = null;
	}
	
	public boolean estaVacia() {
		return (this.unidad == null);
	}
	
	public boolean puedeExistirUnidad(Unidad unidad) {
		return this.base.esTranspasablePor(unidad);
	}
	
	
}
