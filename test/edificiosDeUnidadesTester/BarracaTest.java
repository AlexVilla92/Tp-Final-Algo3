package edificiosDeUnidadesTester;

import static org.junit.Assert.*;

import org.junit.Test;

public class BarracaTest {

	@Test
	public void testCrearUnaBarraca() {
		
		Creable barraca = new Barraca();
		
		assertEquals(0,barraca.unidadesCreadas());
		
	}

}
