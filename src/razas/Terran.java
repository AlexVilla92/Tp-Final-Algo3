package razas;

import razas.excepciones.EspecieYaEstaMuerta;
import razas.interfaces.Atacable;
import razas.interfaces.Unidad;

public abstract class Terran extends Especie implements Atacable {

	public boolean fueDestruido() {
		return !(this.vida > 0);
	}
	
	private void daniar(int danio) throws EspecieYaEstaMuerta {
		
		if (!this.fueDestruido()) {
			this.vida -= danio;
		} else { 
			throw new EspecieYaEstaMuerta();
		}
		
	}
	
	public void atacadoPor(Unidad atacante) throws EspecieYaEstaMuerta {
		
		//No se tiene en cuenta si el atacante es un protoss o un terran.
		if (this.esVolador()) { this.daniar(atacante.getDanioAire()); }
		else { this.daniar(atacante.getDanioTierra()); }
		
	}
	
}
