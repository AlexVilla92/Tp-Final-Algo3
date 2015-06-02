package edificiosDeUnidadesTester;

public class Barraca implements Creable {
	
	private CantidadUnidades unidades;

	public Barraca(){
		
		this.unidades = new CantidadUnidades();
	}
	
	@Override
	public void crearUnidades() {
	
		
	}

	@Override
	public Object unidadesCreadas() {
		
		return (this.unidades.contarUnidadesCreadas());
	}

}
