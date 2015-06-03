package mapa;

import java.util.HashMap;

import mapa.excepciones.CeldaNoVacia;
import mapa.materiales.MaterialTierra;
import razas.interfaces.Unidad;

public class Mapa {

	private int xMaximo, yMaximo;
	private HashMap<Coordenada,Celda> celdas;
	private int cantidadDeUnidades;
	
	public Mapa(int xMaximo, int yMaximo) {
		this.xMaximo = xMaximo;
		this.yMaximo = yMaximo;
		this.cantidadDeUnidades = 0;
		this.celdas = new HashMap<Coordenada, Celda>();
		this.rellenar();
	}
	
	private void agregarCeldaVacia(int x, int y) {
		Coordenada c = new Coordenada(x, y);
		
		this.agregarCeldaVacia(c);
	}
	
	private void agregarCeldaVacia(Coordenada c) {		
		Celda celda = new Celda(MaterialTierra.instancia());
		this.celdas.put(c, celda);
	}

	private void rellenar() {
		for(int i = 0; i <= this.xMaximo; i++) {
			for(int j = 0; j <= this.yMaximo; j++) {
				if (this.obtenerCelda(i,j) == null) {
					this.agregarCeldaVacia(i,j);
				}
			}			
		}
	}
	
	public Celda obtenerCelda(int x, int y) {
		Coordenada c = new Coordenada(x, y);
		
		return this.obtenerCelda(c);
	}
	
	public Celda obtenerCelda(Coordenada c) {
		return celdas.get(c);
	}
	
	public Unidad obtenerUnidad(int x, int y) {
		Coordenada c = new Coordenada(x, y);
		
		return this.obtenerUnidad(c);
	}
	
	public Unidad obtenerUnidad(Coordenada c) {
		return this.obtenerCelda(c).getUnidad();
	}
	

	public void agregarUnidad(int x, int y, Unidad unidad) throws CeldaNoVacia {
		Coordenada c = new Coordenada(x, y);
		
		this.agregarUnidad(c, unidad);
	}
	
	public void agregarUnidad(Coordenada c, Unidad unidad) throws CeldaNoVacia {
		this.obtenerCelda(c).agregarUnidad(unidad);
		
		this.cantidadDeUnidades++;
	}

	public void moverUnidad(int x1, int y1, int x2, int y2) {
		Coordenada c1 = new Coordenada(x1, y1);
		Coordenada c2 = new Coordenada(x2, y2);
		
		this.moverUnidad(c1, c2);
	}
	
	public void moverUnidad(Coordenada c1, Coordenada c2) {
		Unidad original = this.obtenerCelda(c1).getUnidad();
		
		this.removerUnidad(c1);
		
		try {
			this.agregarUnidad(c2, original);
		} catch (CeldaNoVacia e) {
			e.printStackTrace();
		}
	}

	public void removerUnidad(int x, int y) {
		Coordenada c = new Coordenada(x, y);
		
		this.removerUnidad(c);
	}
	
	public void removerUnidad(Coordenada c) {
		this.obtenerCelda(c).removerUnidad();
		
		this.cantidadDeUnidades--;
	}
	

	public boolean celdaOcupada(int x, int y) {
		Coordenada c = new Coordenada(x, y);
		
		return this.celdaOcupada(c);
	}
	
	public boolean celdaOcupada(Coordenada c) {
		return !this.obtenerCelda(c).estaVacia();
	}
	
	public int cantidadDeUnidades() {
		return this.cantidadDeUnidades;
	}

}
