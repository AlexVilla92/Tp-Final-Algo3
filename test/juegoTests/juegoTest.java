package juegoTests;

import static org.junit.Assert.*;
import jugador.Jugador;
import jugador.JugadorProtoss;
import jugador.JugadorTerran;

import org.junit.Test;

import partida.Partida;


public class juegoTest {
	
	@Test
	public void testPartidaCuentaJugadoresCorrectamente() {
		Partida p = new Partida();
		Jugador j1 = new JugadorTerran();
		Jugador j2 = new JugadorProtoss();
		
		p.agregarJugador(j1);
		p.agregarJugador(j2);
		
		assertEquals(2, p.cantidadDeJugadores());
	}
	
	@Test
	public void testPartidaDesignaTurnosCorrectamente() {
		Partida p = new Partida();
		Jugador j1 = new JugadorTerran();
		Jugador j2 = new JugadorProtoss();
		
		p.agregarJugador(j1);
		p.agregarJugador(j2);
		
		p.empezar();		
		assertEquals(p.jugadorConTurno(), j1);
		
		p.siguienteTurno();		
		assertEquals(p.jugadorConTurno(), j2);
		
		p.siguienteTurno();		
		assertEquals(p.jugadorConTurno(), j1);
		
		p.siguienteTurno();		
		assertEquals(p.jugadorConTurno(), j2);
	}
	

}
