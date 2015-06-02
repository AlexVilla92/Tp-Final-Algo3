package razas;

import razas.excepciones.YaFueDestruido;
import razas.interfaces.Atacable;
import razas.interfaces.Unidad;

public class Raza implements Atacable {

	protected int vida;

	public Raza() {
		super();
	}

	public int getVida() { return this.vida; }

	public boolean fueDestruido() {
		return !(this.vida > 0);
	}
	
	protected void daniar(int danio) throws YaFueDestruido {
		
		if (!this.fueDestruido()) {
			this.vida -= danio;
		} else { 
			throw new YaFueDestruido();
		}
		
	}

	public void atacadoPor(Unidad atacante) throws YaFueDestruido {
		
		//No se tiene en cuenta si el atacante es un protoss o un terran.
		if (this.esVolador()) { this.daniar(atacante.getDanioAire()); }
		else { this.daniar(atacante.getDanioTierra()); }
		
	}

	public boolean esVolador() {
		// TODO Auto-generated method stub
		return false;
	}

}