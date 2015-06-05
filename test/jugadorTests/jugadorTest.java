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

import razas.protoss.unidades.AltoTemplario;
import razas.protoss.unidades.Zealot;
import razas.terran.construcciones.CentroDeMineral;

public class jugadorTest {

	@Test
	public void testJugadorConsigueRecursosCorrectamente() throws RecursoAgotado, SinSuficientesRecursos {
		Jugador jugador = new JugadorTerran();
		UnidadBuilder ub = new UnidadBuilder(jugador);
		
		jugador.obtenerMinerales(50); //Necesita 50 para crear un centro mineral
		
		Mineral mineral = new Mineral(500);
		
		CentroDeMineral centroMineral = new CentroDeMineral();		
		ub.asignarUnidadAJugador(centroMineral);
		
		assertEquals(jugador.getCantidadMinerales(), 0);
		
		centroMineral.recolectar(mineral); //Consigue 10 minerales
		
		assertEquals(jugador.getCantidadMinerales(), 10);
		
		//primero tengo que incializar un mapa
		
		//construyo un centro de mineral en la posicion donde se que esta el mineral
		
		//paso turnos, mientras verifico que no recolecta
		
		//paso turnos hasta completar construccion
		
		//verifico que empiezo a sumar pasando turnos.
		
	}
	

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
		
		jugador.obtenerMinerales(50);
		jugador.obtenerGasVespeno(150);
		
		assertEquals(jugador.getCantidadMinerales(), 50);
		assertEquals(jugador.getCantidadGasVespeno(), 150);
		
		UnidadBuilder ub = new UnidadBuilder(jugador);
		
		AltoTemplario at = new AltoTemplario();
		ub.asignarUnidadAJugador(at);
		
		assertEquals(jugador.getCantidadMinerales(), 0);
		assertEquals(jugador.getCantidadGasVespeno(), 0);
	}

}
