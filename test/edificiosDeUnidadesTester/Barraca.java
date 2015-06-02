package edificiosDeUnidadesTester;

//import razas.terran.unidades.Marine;

public class Barraca implements Creable {
	
	private CantidadUnidades unidades;

	public Barraca(){
		
		this.unidades = new CantidadUnidades();
	}
	
	@Override
	public void crearUnidades() {
	
		/*
		 * aca creo 5 marines
		 * pero no hago nada con ellos
		 * Podria implementar el patron Factory (para crear en masa)
		 *  o con menos fuerza el Singleton.
		 */
		
		for (int i = 1; i <= 5 ; i++){
			
			/*Marine unMarine = new Marine();
			
			System.out.println( unMarine.esVolador());*/
		}
		this.unidades.acumularUnidades(5);
	}

	@Override
	public Object unidadesCreadas() {
		
		/*
		 * No deberia ser una responsabilidad de la Barraca
		 * este podria ser un patron Multiton
		 */
		
		return (this.unidades.contarUnidadesCreadas());
	}

	@Override
	public void crearUnidades(int unidades) {
		
		for (int i = 1; i <= unidades ; i++){
			
			/*Marine unMarin = new Marine();
			
			System.out.println(unMarin.getCostoMinerales());*/
		}
		
		this.unidades.acumularUnidades(unidades);
	}

}
