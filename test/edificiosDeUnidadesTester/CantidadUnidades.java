package edificiosDeUnidadesTester;

public class CantidadUnidades {
	
	private int totalUnidades;
	
	public CantidadUnidades(){
		
		this.setTotalUnidades(0);
	}

	public void setTotalUnidades(int nuevaCantidad) {
		
		this.totalUnidades = nuevaCantidad;
		
	}

	public int contarUnidadesCreadas() {
		
		return (this.totalUnidades);
	}

}
