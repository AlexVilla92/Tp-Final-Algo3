package unidadesTester;
import static org.junit.Assert.*;

import org.junit.Test;

import razas.excepciones.EspecieYaEstaMuerta;
import razas.protoss.excepciones.EscudoNoPuedeRegenerarse;
import razas.protoss.unidades.Zealot;
import razas.terran.unidades.Marine;


public class UnidadesProtossTest {

	@Test
	public void testZealotAtacaAMarineYLoDestruye() {
		
		Zealot zealot = new Zealot();
		Marine marine = new Marine();
		
		assertTrue(marine.getVida() == 40);
		
		try {
			//Por cada vez que ataca el zealot saca 8 de vida, 8 x 5 = 40, que es la vida del marine.
			for (int i = 0; i < 5; i++)	marine.atacadoPor(zealot);
			
		} catch (EspecieYaEstaMuerta ex) {
			
			assertTrue(false);
			
		}
		
		assertTrue(marine.fueDestruido());
		
	}
	
	@Test
	public void testZealotEsAtacadoPorMarineYDestruyeSuEscudoPeroNoDisminuyeSuVida() {
		
		Zealot zealot = new Zealot();
		Marine marine = new Marine();
		
		assertTrue(zealot.getVida() == 100);
		
		try {
			//Por cada vez que ataca el marine saca 6 de vida, 6 x 10 = 60, que es el valor del escudo del marine.
			for (int i = 0; i < 10; i++)	zealot.atacadoPor(marine);
			
		} catch (EspecieYaEstaMuerta ex) {
			
			assertTrue(false);
			
		}
		
		assertTrue(zealot.getVida() == 100);
		
		
	}
	
	@Test
	public void testZealotEsAtacadoPorMarinePierdeVidaYLuegoRegeneraEscudo() {
		
		Zealot zealot = new Zealot();
		Marine marine = new Marine();
		
		try {
			//Por cada vez que ataca el marine saca 6 de vida, 6 x 11 = 66, el marine deberia perder 6 de vida, ya que su escudo es de 60.
			for (int i = 0; i < 11; i++)	zealot.atacadoPor(marine);
			
		} catch (EspecieYaEstaMuerta ex) {
			
			assertTrue(false);
			
		}
		
		assertTrue(zealot.getVida() == 94);
		
		try {
			zealot.regenerarEscudo();
			zealot.regenerarEscudo();
		} catch (EscudoNoPuedeRegenerarse ex) {
			//El escudo se regenero al maximo.
		}
		
		try {
			zealot.atacadoPor(marine);
			
		} catch (EspecieYaEstaMuerta ex) {
			
			assertTrue(false);
			
		}
		
		assertTrue(zealot.getVida() == 94);
		
	}

}
