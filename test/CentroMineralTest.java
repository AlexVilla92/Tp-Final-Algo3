import  org.junit.Assert;

import org.junit.Test;


public class CentroMineralTest {

	@Test
	public void testCrerCentro() {
		
		Recolectable unCentro = new CentroMineral();
		
		Assert.assertEquals(0,unCentro.obtenerMinerales());
	}

}
