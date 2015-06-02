package razas;

import razas.excepciones.YaFueDestruido;
import razas.interfaces.Atacable;
import razas.interfaces.Unidad;

public abstract class Terran implements Atacable {

	protected int vida;
	
	private void daniar(int danio) throws YaFueDestruido {
		
		if (!this.fueDestruido()) {
			this.vida -= danio;
		} else { 
			throw new YaFueDestruido();
		}
		
	}
	
	public int getVida() { return this.vida; }
	
	public boolean fueDestruido() {
		return !(this.vida > 0);
	}
	
	@Override
	public void atacadoPor(Unidad atacante) throws YaFueDestruido {
		
		//No se tiene en cuenta si el atacante es un protoss o un terran.
		if (this.esVolador()) { this.daniar(atacante.getDanioAire()); }
		else { this.daniar(atacante.getDanioTierra()); }
		
	}
	
}
