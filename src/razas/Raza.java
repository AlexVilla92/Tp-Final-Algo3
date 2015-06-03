package razas;

import jugador.Jugador;
import razas.excepciones.YaFueDestruido;
import razas.interfaces.Atacable;
import razas.interfaces.Unidad;

public abstract class Raza implements Atacable {

	protected int vida;
	protected Jugador deJugador;

	public Raza() {
		super();
	}
	
	public void asignarJugador(Jugador j) {
		this.deJugador = j;
	}
	
	public Jugador getJugador() {
		return this.deJugador;
	}
	
	public boolean tieneJugador() {
		return this.deJugador != null;
	}

	public int getVida() { return this.vida; }

	public boolean fueDestruido() {
		return !(this.vida > 0);
	}
	
	protected void removerVida(int danio) throws YaFueDestruido {
       if (!this.fueDestruido()) {
               this.vida -= danio;
               if (this.vida < 0) this.vida = 0;
       } else { 
               throw new YaFueDestruido();
       }
   }
	
	protected void daniar(int danio) throws YaFueDestruido {
		this.removerVida(danio);	
	}

	public void atacadoPor(Unidad atacante) throws YaFueDestruido {
		
		//No se tiene en cuenta si el atacante es un protoss o un terran.
		if (this.esVolador()) { this.daniar(atacante.getDanioAire()); }
		else { this.daniar(atacante.getDanioTierra()); }
	}
	
	public abstract boolean esVolador();

	public abstract int getCostoMinerales();
	public abstract int getCostoGasVespeno();

}