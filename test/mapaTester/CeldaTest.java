package mapaTester;

import static org.junit.Assert.*;

import org.junit.Test;

import mapa.Celda;
import mapa.excepciones.CeldaNoVacia;
import mapa.materiales.MaterialTierra;
import razas.protoss.unidades.Zealot;

public class CeldaTest {

	@Test
	public void testCeldaPuedeContenerUnElemento() throws CeldaNoVacia {
		MaterialTierra tierra = new MaterialTierra();
		Celda celda = new Celda(tierra);
		Zealot zealot = new Zealot();
		
		celda.agregarUnidad(zealot);
		
		assertFalse(celda.estaVacia());
	}
	
	@Test
	public void testCeldaNoPuedeContenerMasDeUnElemento() throws CeldaNoVacia {
		MaterialTierra tierra = new MaterialTierra();
		Celda celda = new Celda(tierra);
		Zealot zealot = new Zealot();
		
		try {
			celda.agregarUnidad(zealot);
			celda.agregarUnidad(zealot);
			fail("No corrió la excepción");
		} catch (CeldaNoVacia ex) {
			assertTrue(true);
		}
	}

}
