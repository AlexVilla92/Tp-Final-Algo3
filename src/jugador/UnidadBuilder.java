package jugador;

import razas.Raza;
import razas.interfaces.Unidad;

public class UnidadBuilder {
	
	private Jugador destinatario;

	public UnidadBuilder(Jugador jugador) {
		this.destinatario = jugador;
	}
	
	public Raza asignarUnidadAJugador(Raza unidad) throws SinSuficientesRecursos {
		
		if(this.jugadorPuedeCrearUnidad(unidad)) {
			this.removerRecursosDeJugador(unidad);
			unidad.asignarJugador(destinatario);
		} else {
			throw new SinSuficientesRecursos();
		}
		
		return unidad;
	}
	
	private boolean jugadorPuedeCrearUnidad(Raza unidad) {
		if (destinatario.getCantidadGasVespeno() >= ((Unidad)unidad).getCostoGasVespeno() &&
		(destinatario.getCantidadMinerales() >= ((Unidad)unidad).getCostoMinerales())) {		
			return true;
		} else {
			return false;
		}		
	}
	
	private void removerRecursosDeJugador(Raza unidad) {
		destinatario.removerGasVespeno(((Unidad)unidad).getCostoGasVespeno());
		destinatario.removerMinerales(((Unidad)unidad).getCostoMinerales());
	}

}
