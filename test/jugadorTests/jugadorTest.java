package jugadorTests;

import static org.junit.Assert.*;
import jugador.Jugador;
import jugador.JugadorProtoss;
import jugador.JugadorTerran;
import jugador.SinSuficientesRecursos;
import jugador.UnidadBuilder;
import mapa.excepciones.RecursoAgotado;
import mapa.recursos.Mineral;

import org.junit.Test;

import razas.protoss.unidades.Zealot;
import razas.terran.construcciones.CentroDeMineral;

public class jugadorTest {
/*
	@Test
	public void testJugadorConsigueRecursosCorrectamente() throws RecursoAgotado {
		Jugador jugador = new JugadorTerran();
		
		Mineral mineral = new Mineral(500);
		CentroDeMineral centroMineral = new CentroDeMineral();
		
		centroMineral.recolectar(mineral);
		
		
		fail("Not yet implemented");
	}*/
	

	@Test
	public void testJugadorCreaUnidadYEsDueniaDeElla() throws SinSuficientesRecursos {
		Jugador jugador = new JugadorProtoss();
		
		jugador.obtenerMinerales(1000);
		
		UnidadBuilder ub = new UnidadBuilder(jugador);
		
		Zealot zealot = new Zealot();
		ub.asignarUnidadAJugador(zealot);
		
		assertEquals(zealot.getJugador(), jugador);
	}

	@Test
	public void testJugadorCreaUnidadYPierdeRecursos() throws SinSuficientesRecursos {
		Jugador jugador = new JugadorProtoss();
		
		jugador.obtenerMinerales(1000);
		
		UnidadBuilder ub = new UnidadBuilder(jugador);
		
		Zealot zealot = new Zealot();
		ub.asignarUnidadAJugador(zealot);
		
		assertEquals(jugador.getCantidadMinerales(), 900);
	}

}
