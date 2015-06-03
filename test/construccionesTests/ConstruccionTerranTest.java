package construccionesTests;

import static org.junit.Assert.*;

import java.util.Collection;

import mapa.Recurso;
import mapa.excepciones.RecursoAgotado;
import mapa.recursos.*;

import org.junit.Test;

import razas.excepciones.YaFueDestruido;
import razas.interfaces.Recolector;
import razas.protoss.unidades.Zealot;
import razas.terran.construcciones.*;
import razas.terran.unidades.*;

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
	
	@Test
	public void testCentroDeMineralRecogeRecursosDeUnNodoDeMinerales(){
		
		Recurso nodoDeMinerales = new Mineral(1000);
		Recolector centroDeMineral = new CentroDeMineral();
		
		for (int i = 0; i < 3; i++)	{ 
			
			try {
				centroDeMineral.recolectar(nodoDeMinerales);
			} catch (RecursoAgotado ra) { 
				assertTrue(false);
			}
			
		}
	
		assertTrue(nodoDeMinerales.getCantidad() == 970);
		assertTrue(centroDeMineral.totalRecolectado() == 30);
		
	}
	
	@Test
	public void testRefineriaRecogeRecursosDeUnNodoDeGasVespeno() {
		
		Recurso nodoDeGasVespeno = new GasVespeno(1000);
		Recolector refineria = new Refineria();
		
		for (int i = 0; i < 3; i++)	{ 
			
			try {
				refineria.recolectar(nodoDeGasVespeno);
			} catch (RecursoAgotado ra) { 
				assertTrue(false);
			}
			
		}
	
		assertTrue(nodoDeGasVespeno.getCantidad() == 970);
		assertTrue(refineria.totalRecolectado() == 30);	
		
	}
	
	@Test
	public void testBarracaCrea10Marines() {
		
		Barraca barraca = new Barraca();
		
		Collection<Marine> listaDeMarines = barraca.crearMarines(10);
		
		assertTrue(listaDeMarines.size() == 10);
		
	}
	
	@Test
	public void testFabricaCrea10Golliats() {
		
		Fabrica fabrica = new Fabrica();
		
		Collection<Golliat> listaDeGolliats = fabrica.crearGolliats(10);
		
		assertTrue(listaDeGolliats.size() == 10);
		
	}
	
	@Test
	public void testPuertoEstelarCrea10Espectros() {
		
		PuertoEstelar puertoEstelar = new PuertoEstelar();
		
		Collection<Espectro> listaDeEspectros = puertoEstelar.crearEspectros(10);
		
		assertTrue(listaDeEspectros.size() == 10);
		
	}
	
	@Test
	public void testPuertoEstelarCrea10NavesDeTransporte() {
		
		PuertoEstelar puertoEstelar = new PuertoEstelar();
		
		Collection<NaveDeTransporte> listaDeNavesDeTransporte = puertoEstelar.crearNavesDeTransporte(10);
		
		assertTrue(listaDeNavesDeTransporte.size() == 10);
		
	}
	
	@Test
	public void testPuertoEstelarCrea10NavesDeCiencia() {
		
		PuertoEstelar puertoEstelar = new PuertoEstelar();
		
		Collection<NaveDeCiencia> listaDeNavesDeCiencia = puertoEstelar.crearNavesDeCiencia(10);
		
		assertTrue(listaDeNavesDeCiencia.size() == 10);
		
	}
	
}
