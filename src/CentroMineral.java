
public class CentroMineral implements Recolectable {
	
	private Mineral minerales;
	
	public CentroMineral(){
		
		this.minerales = new Mineral();
	}

	@Override
	public void recolectar() {
		
		this.minerales.acumular();
	}

	@Override
	public int obtenerMinerales() {
	
		return (this.minerales.getCantRecolectada());
	}

	@Override
	public void recolectar(int mineralRestante) throws MineralAgotado {
		
		if ( mineralRestante <= 0 ) {
			
			throw new MineralAgotado();
		}
		
		this.minerales.acumular(mineralRestante);
		
	}

}
