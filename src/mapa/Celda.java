package mapa;


import razas.interfaces.Unidad;

import java.util.LinkedList;
import java.util.Stack;

public class Celda {
	
	private Unidad unidad;
	private Material base;
	
	public Celda(Material base) {
		this.base = base;
		this.unidad = null;
	}

	public void agregarUnidad(Unidad unidad) {
		this.unidad = unidad;
	}
	
	public void removerUnidad() {
		this.unidad = null;
	}
	
	public boolean estaVacia() {
		return (this.unidad == null);
	}
	
	
}
