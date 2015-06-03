package mapaTester;

import static org.junit.Assert.*;
import mapa.Mapa;
import mapa.excepciones.CeldaNoVacia;

import org.junit.Test;

import razas.protoss.unidades.Zealot;

public class MapaTest {

	@Test
	public void testMapaCuentaElementosCorrectamente() throws CeldaNoVacia {
		Mapa map = new Mapa(30,30);
		
		Zealot zealot = new Zealot();
		
		map.agregarUnidad(2, 3, zealot);
		
		assertEquals(1, map.cantidadDeUnidades());
	}
	
	@Test
	public void testMapaAgregaUnidadYLaDevuelve() throws CeldaNoVacia {
		Mapa map = new Mapa(30,30);
		
		Zealot zealot = new Zealot();
		
		map.agregarUnidad(2, 3, zealot); 
		
		assertEquals(zealot, map.obtenerUnidad(2, 3));
	}
	
	@Test
	public void testMapaAgregaUnidadLaCeldaEstaOcupada() throws CeldaNoVacia {
		Mapa map = new Mapa(30,30);
		
		Zealot zealot = new Zealot();
		
		map.agregarUnidad(2, 3, zealot); 
		
		assertTrue(map.celdaOcupada(2,3));
	}
	
	@Test
	public void testMapaAgregaUnidadYComparaCorrectamenteConOtra() throws CeldaNoVacia {
		Mapa map = new Mapa(30,30);
		
		Zealot zealot1 = new Zealot();
		Zealot zealot2 = new Zealot();
		
		map.agregarUnidad(2, 3, zealot1); 
		
		assertNotEquals(zealot2, map.obtenerUnidad(2, 3));
	}
	
	@Test
	public void testMapaNoPermiteAgregarDosUnidadesEnLaMismaCelda() {
		Mapa map = new Mapa(30,30);
		
		Zealot zealot1 = new Zealot();
		Zealot zealot2 = new Zealot();
		
		try { 
			map.agregarUnidad(2, 3, zealot1); 
			map.agregarUnidad(2, 3, zealot2);
			fail("No corrió la excepción");
		} catch (CeldaNoVacia ex) {
			assertTrue(true);
		}
		
		
		assertNotEquals(zealot2, map.obtenerUnidad(2, 3));
	}
	
	@Test
	public void testMapaBorraUnidadesCorrectamente() throws CeldaNoVacia {
		Mapa map = new Mapa(30,30);
		
		Zealot zealot = new Zealot();
		
		map.agregarUnidad(2, 3, zealot);		
		assertEquals(zealot, map.obtenerUnidad(2, 3));
		assertTrue(map.celdaOcupada(2, 3));
		
		map.removerUnidad(2, 3);
		assertFalse(map.celdaOcupada(2, 3));
	}

}
