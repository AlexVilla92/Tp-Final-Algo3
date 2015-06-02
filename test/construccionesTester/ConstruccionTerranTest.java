package construccionesTester;

import static org.junit.Assert.*;

import org.junit.Test;

import razas.excepciones.YaFueDestruido;
import razas.protoss.unidades.Zealot;
import razas.terran.construcciones.CentroDeMineral;

public class ConstruccionTerranTest {

	@Test
	public void testCentroDeMineralDestruidoPorZealot() {
		
		CentroDeMineral centroDeMineral = new CentroDeMineral();
		Zealot zealot = new Zealot();
		
		assertFalse(centroDeMineral.fueDestruido());
		
		for (int i = 0; i < 63; i++) {
			
			// El zealot tiene un ataque de 8, si ataca 63 veces deberia destruir el centro de mineral terran.
			try {
				
				centroDeMineral.atacadoPor(zealot);
				
			} catch (YaFueDestruido ex) {}
		}
		
		assertTrue(centroDeMineral.fueDestruido());
		
	}

}
