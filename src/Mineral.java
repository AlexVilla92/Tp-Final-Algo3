
public class Mineral extends Recursos {
	
	private int cantidad;
	
	public Mineral(){
		
		this.setCantidad(0);
	}

	private void setCantidad(int nuevaCantidad) {
		
		this.cantidad = nuevaCantidad;
		
	}

	public int getCantRecolectada() {
		
		return (this.cantidad);
	}

	public void acumular() {
		
		this.cantidad = this.cantidad + 10;
		
	}

	public void acumular(int mineralRestante) {
		
		this.cantidad = this.cantidad + mineralRestante;
		
	}

}
