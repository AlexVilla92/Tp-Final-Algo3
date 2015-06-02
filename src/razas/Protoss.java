package razas;

import razas.excepciones.EspecieYaEstaMuerta;
import razas.interfaces.Atacable;
import razas.interfaces.Unidad;
import razas.protoss.excepciones.*;

public abstract class Protoss extends Especie implements Atacable {

	protected int escudo, escudoPerfecto;

	public boolean aunVive() {
		return (this.vida > 0);
	}
	
	private boolean escudoActivo() {
		return (this.escudo > 0);
		
	}
	
	private boolean escudoDaniado() {
		return (this.escudo < this.escudoPerfecto);
	}
	
	private void daniar(int danio) throws EspecieYaEstaMuerta {
		
		if (this.escudoActivo()) {
			this.escudo -= danio;
		} else {
			try {
				if (this.aunVive()) {
					this.vida -= danio;
					if (vida < 0) this.vida = 0;
				} else { 
					throw new EspecieYaEstaMuerta();
				}
			} finally {}
		}
		
	}
	
	public void atacadoPor(Unidad atacante) throws EspecieYaEstaMuerta {
		
		//No se tiene en cuenta si el atacante es un protoss o un terran.
		if (this.esVolador()) { this.daniar(atacante.getDanioAire()); }
		else { this.daniar(atacante.getDanioTierra()); }
		
	}
	
	public void regenerarEscudo() throws EscudoNoPuedeRegenerarse {
		
		if (this.escudoDaniado()) {
		
			this.escudo += 50;
		
			try {
			
				if (this.escudo > this.escudoPerfecto) throw new EscudoSobrepasaValorMaximo();
		
			} catch (EscudoSobrepasaValorMaximo esvm) {
			
				this.escudo = this.escudoPerfecto;
			
			}
			
		} else {
			throw new EscudoNoPuedeRegenerarse();
		}
		
	}
}
