package jugador;

//import java.util.HashMap;

//import mapa.Recurso;

public abstract class Jugador {

	protected int cantidadGasVespeno;
	protected int cantidadMinerales;
	
	public Jugador() {
		this.cantidadGasVespeno = 0;
		this.cantidadMinerales = 200; //le agruegue esta cantidad inicial por el enunciado
	}
	
	public int getCantidadGasVespeno() {
		return this.cantidadGasVespeno;
	}
	
	public int getCantidadMinerales() {
		return this.cantidadMinerales;
	}
	
	public void removerGasVespeno(int cantidad) {
		this.cantidadGasVespeno -= cantidad;
	}

	public void removerMinerales(int cantidad) {
		this.cantidadMinerales -= cantidad;
	}
	
	public void obtenerGasVespeno(int cantidad) {
		this.cantidadGasVespeno += cantidad;
	}

	public void obtenerMinerales(int cantidad) {
		this.cantidadMinerales += cantidad;
	}
	
	
}
