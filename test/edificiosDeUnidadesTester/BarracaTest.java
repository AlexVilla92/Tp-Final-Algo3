package edificiosDeUnidadesTester;

import static org.junit.Assert.*;

import org.junit.Test;

public class BarracaTest {

	@Test
	public void testCrearUnaBarraca() {
		
		Creable barraca = new Barraca();
		
		assertEquals(0,barraca.unidadesCreadas());
		
	}
	
	@Test
	public void testBarracaCreaUnidadesPorDefault(){
		
		/*
		 * creo unidades de a 5, que es el valor default
		 */
		
		Creable barraca = new Barraca();
		
		barraca.crearUnidades();
		
		assertEquals(5,barraca.unidadesCreadas());
		
		barraca.crearUnidades();
		
		assertEquals(10,barraca.unidadesCreadas());
	}
	
	@Test
	public void testBarracaCreaUnidadesPorParametro(){
		
		Creable barraca = new Barraca();
		
		int unidades = 10; // quiero dies unidades de combate
		
		barraca.crearUnidades(unidades);
		
		assertEquals(10,barraca.unidadesCreadas());
		
		unidades = 1;
		
		barraca.crearUnidades(1);
		
		assertEquals(11,barraca.unidadesCreadas());
		
	}

}
