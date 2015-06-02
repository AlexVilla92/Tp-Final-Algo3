package razas;

import razas.excepciones.YaFueDestruido;
import razas.interfaces.Atacable;
import razas.interfaces.Unidad;
import razas.protoss.excepciones.*;

public abstract class Protoss implements Atacable {

	protected int vida, escudo;
	
	protected abstract int escudoPerfecto();
	
	private boolean escudoActivo() {
		return (this.escudo > 0);
	}
	
	private boolean escudoDaniado() {
		return (this.escudo < this.escudoPerfecto());
	}
	
	private void daniar(int danio) throws YaFueDestruido {
		
		if (this.escudoActivo()) {
			this.escudo -= danio;
		} else {
			try {
				if (!this.fueDestruido()) {
					this.vida -= danio;
					if (vida < 0) this.vida = 0;
				} else { 
					throw new YaFueDestruido();
				}
			} finally {}
		}
		
	}
	
	public int getVida() { return this.vida; }
	
	public int getEscudo() { return this.escudo; }
	
	public boolean fueDestruido() {
		return !(this.vida > 0);
	}
	
	@Override
	public void atacadoPor(Unidad atacante) throws YaFueDestruido {
		
		//No se tiene en cuenta si el atacante es un protoss o un terran.
		if (this.esVolador()) { this.daniar(atacante.getDanioAire()); }
		else { this.daniar(atacante.getDanioTierra()); }
		
	}
	
	public void regenerarEscudo() throws EscudoNoPuedeRegenerarse {
		
		if (this.escudoDaniado()) {
		
			this.escudo += 50;
		
			try {
			
				if (this.escudo > this.escudoPerfecto()) throw new EscudoSobrepasaValorMaximo();
		
			} catch (EscudoSobrepasaValorMaximo esvm) {
			
				this.escudo = this.escudoPerfecto();
			
			}
			
		} else {
			throw new EscudoNoPuedeRegenerarse();
		}
		
	}
}
