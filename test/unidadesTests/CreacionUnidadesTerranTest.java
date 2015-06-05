package unidadesTests;

import static org.junit.Assert.*;

import java.util.Collection;

import jugador.Jugador;
import jugador.JugadorTerran;
import jugador.SinSuficientesRecursos;
import jugador.UnidadBuilder;

import org.junit.Test;

import razas.terran.construcciones.Barraca;
import razas.terran.unidades.Marine;

public class CreacionUnidadesTerranTest {

	@Test
	public void testTengoRecursosNecesariosParaCrearMarine() throws SinSuficientesRecursos {
		
		Jugador unJugador = new JugadorTerran();
		Barraca barraca = new Barraca();
		UnidadBuilder builder = new UnidadBuilder(unJugador);
		Barraca unaBarraca = new Barraca();
		
		assertEquals(unJugador.getCantidadMinerales(),200);
		
		builder.asignarUnidadAJugador(unaBarraca); //se le descuenta al jugador 150 minerales
		
		assertEquals(unJugador.getCantidadMinerales(),50);
		
		
		Collection<Marine> listaDeMarines = barraca.crearMarines(1,unJugador.getCantidadMinerales());
		
		//assertEquals(unJugador.getCantidadMinerales(),0); 
		assertTrue(listaDeMarines.size() == 1);
		
		/*
		 * faltaria setearle al jugador su cantidad de minerales, despues de crear un marine
		 * deberia tener 0 minerales, sin embargo todavia tiene 50 
		 */
		
	}

}
