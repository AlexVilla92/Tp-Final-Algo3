package razas.terran.construcciones;

import java.util.ArrayList;
import java.util.Collection;

import razas.Terran;
import razas.interfaces.Construccion;
import razas.interfaces.Constructor;
import razas.terran.unidades.Espectro;
import razas.terran.unidades.NaveDeCiencia;
import razas.terran.unidades.NaveDeTransporte;

public class PuertoEstelar extends Terran implements Construccion, Constructor {

	public PuertoEstelar() {
		
		super();
		this.vida = 1300;
				
	}
	
	@Override
	public boolean esVolador() { return false; }
	
	@Override
	public int getCostoMinerales() { return 150; }

	@Override
	public int getCostoGasVespeno() { return 100; }

	@Override
	public int getTiempoDeConstruccion() { return 10; }

	public Collection<Espectro> crearEspectros(int cantidad) {
		
		// Deberia verificarse que cuando se crea un marine existen los recursos para crearlo, pasando por parametro la cantidad
		// de recursos del jugador, o en otro caso que haya otra entidad que se encargue de esta validacion, lo podemos hablar.
		
		Collection<Espectro> listaDeEspectros = new ArrayList<Espectro>();
		
		for (int i = 0; i < cantidad; i++) {
			listaDeEspectros.add(new Espectro());
		}
		
		return listaDeEspectros;
	}
	
	public Collection<NaveDeTransporte> crearNavesDeTransporte(int cantidad) {
		
		// Deberia verificarse que cuando se crea un marine existen los recursos para crearlo, pasando por parametro la cantidad
		// de recursos del jugador, o en otro caso que haya otra entidad que se encargue de esta validacion, lo podemos hablar.
		
		Collection<NaveDeTransporte> listaDeNaveDeTransporte = new ArrayList<NaveDeTransporte>();
		
		for (int i = 0; i < cantidad; i++) {
			listaDeNaveDeTransporte.add(new NaveDeTransporte());
		}
		
		return listaDeNaveDeTransporte;
	}
	
	public Collection<NaveDeCiencia> crearNavesDeCiencia(int cantidad) {
		
		// Deberia verificarse que cuando se crea un marine existen los recursos para crearlo, pasando por parametro la cantidad
		// de recursos del jugador, o en otro caso que haya otra entidad que se encargue de esta validacion, lo podemos hablar.
		
		Collection<NaveDeCiencia> listaDeNavesDeCiencia = new ArrayList<NaveDeCiencia>();
		
		for (int i = 0; i < cantidad; i++) {
			listaDeNavesDeCiencia.add(new NaveDeCiencia());
		}
		
		return listaDeNavesDeCiencia;
	}
	
}
