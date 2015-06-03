package mapaTester;

import static org.junit.Assert.*;
import mapa.Coordenada;

import org.junit.Test;

public class CoordenadaTest {

	@Test
	public void testCoordenadasCreadasCorrectamente() {
		Coordenada coord = new Coordenada(2,1);
		
		assertEquals(coord.getX(), 2);
		assertEquals(coord.getY(), 1);
	}
	
	@Test
	public void testDosCoordenadasSonIguales() {
		Coordenada c1 = new Coordenada(30,45);
		Coordenada c2 = new Coordenada(30,45);
		
		assertTrue(c1.equals(c2));
	}
	
	@Test
	public void testDosCoordenadasDistintasNoSonIguales() {
		Coordenada c1 = new Coordenada(30,45);
		
		for(int i = 0; i < 500; i++) {
			for(int j = 0; j < 500; j++) {
				if(i != 30 && j != 45) {
					Coordenada c2 = new Coordenada(i,j);				
					assertFalse(c1.equals(c2));
				}
			}
		}
	}

}
