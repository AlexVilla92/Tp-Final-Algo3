package mapaTester;

import static org.junit.Assert.*;

import org.junit.Test;

import mapa.Celda;
import mapa.materiales.MaterialTierra;
import razas.protoss.unidades.Zealot;

public class CeldaTest {

	@Test
	public void testCeldaPuedeContenerUnElemento() {
		MaterialTierra tierra = new MaterialTierra();
		Celda celda = new Celda(tierra);
		Zealot zealot = new Zealot();
		
		celda.agregarUnidad(zealot);
		
		assertFalse(celda.estaVacia());
	}

}
