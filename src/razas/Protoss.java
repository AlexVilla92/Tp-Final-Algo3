package razas;

import razas.protoss.excepciones.*;

public abstract class Protoss extends Raza {

	protected int escudo;
	
	protected abstract int escudoPerfecto();
	
	protected boolean escudoActivo() {
		return (this.escudo > 0);
	}
	
	protected boolean escudoDaniado() {
		return (this.escudo < this.escudoPerfecto());
	}
	
	public int getEscudo() { return this.escudo; }
	
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
