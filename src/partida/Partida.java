package partida;

import jugador.Jugador;
import listas.ListaCircular;

public class Partida {
	
	private ListaCircular<Jugador> jugadores;
	private Jugador jugadorConTurno;
	
	public Partida() {
		this.jugadores = new ListaCircular<Jugador>();
	}

	public void agregarJugador(Jugador j) {
		this.jugadores.add(j);
	}
	
	public int cantidadDeJugadores() {
		return this.jugadores.getLength();
	}

	public void empezar() {
		
		this.jugadores.reset();

		//Los primeros turnos se definen por el orden
		//en el cual los jugadores fueron agregados
		this.jugadorConTurno = this.jugadores.getEntry(1);
	}

	public Jugador jugadorConTurno() {
		return this.jugadorConTurno;
	}

	public void siguienteTurno() {		
		this.jugadorConTurno = this.jugadores.next();
	}

}
