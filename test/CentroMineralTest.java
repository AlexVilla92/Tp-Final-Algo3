import static org.junit.Assert.*;

import org.junit.Test;

public class CentroMineralTest {

	@Test
	public void testCrearCentro() {
		
		Recolectable unCentro = new CentroMineral();
		
		assertEquals(0,unCentro.obtenerMinerales());
	}
	
	@Test
	public void testRecolectarPorTurno(){
		
		Recolectable unCentro = new CentroMineral();
		
		unCentro.recolectar();      //representa 1 turno
		
		assertEquals(10,unCentro.obtenerMinerales());
		
		for (int turno = 1; turno <= 4; turno ++){//recolecto durante 4 turnos
			
			unCentro.recolectar();
		}
		
		assertEquals(50,unCentro.obtenerMinerales());
		
	}
	
	@Test
	public void testRecolectarDeUnNodoAgotado() throws MineralAgotado{
		
		/* por ej: si a un nodo le queda 8 de mineral, se deberia 
		 * recolecta de otra forma
		 */
		
		Recolectable unCentro = new CentroMineral();
		
		int nodo = 18;
		/*
		 * ej: un nodo esta por agotarse y tiene 18 de mineral
		 */
		
		unCentro.recolectar(); 
		
		nodo = nodo - 10;
		/*
		 * ahora le queda 8 de mineral
		 */
		
		assertEquals(10,unCentro.obtenerMinerales());
		
		unCentro.recolectar(nodo);
		
		assertEquals(18,unCentro.obtenerMinerales());
		
		nodo = nodo - nodo; 
		/*
		 * ya no hay mineral para recolectar, 
		 * como ya no hay mineral para recolectar lanzo una excepcion
		 */
		
		try {unCentro.recolectar(nodo);} catch (MineralAgotado e){
			
			e.mostrarMensaje();
		}
		
		assertEquals(18,unCentro.obtenerMinerales());
	}

}
