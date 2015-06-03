package razas.protoss.construcciones;

import java.util.ArrayList;
import java.util.Collection;

import razas.Protoss;
import razas.interfaces.Construccion;
import razas.interfaces.Constructor;
import razas.protoss.unidades.Scout;
import razas.protoss.unidades.NaveDeTransporte;

public class PuertoEstelar extends Protoss implements Construccion, Constructor {

	public PuertoEstelar() {
		
		super();
		this.vida = 600;
		this.escudo = 600;
		
	}
	
	@Override
	public boolean esVolador() { return false; }
	
	@Override
	protected int escudoPerfecto() { return 600; }
	
	@Override
	public int getCostoMinerales() { return 150; }

	@Override
	public int getCostoGasVespeno() { return 150; }

	@Override
	public int getTiempoDeConstruccion() { return 10; }
	
	public Collection<Scout> crearScouts(int cantidad) {
		
		// Deberia verificarse que cuando se crea un zealot existen los recursos para crearlo, pasando por parametro la cantidad
		// de recursos del jugador, o en otro caso que haya otra entidad que se encargue de esta validacion, lo podemos hablar.
		
		Collection<Scout> listaDeScouts = new ArrayList<Scout>();
		
		for (int i = 0; i < cantidad; i++) {
			listaDeScouts.add(new Scout());
		}
		
		return listaDeScouts;
	}
	
	public Collection<NaveDeTransporte> crearNavesDeTransporte(int cantidad) {
		
		// Deberia verificarse que cuando se crea un zealot existen los recursos para crearlo, pasando por parametro la cantidad
		// de recursos del jugador, o en otro caso que haya otra entidad que se encargue de esta validacion, lo podemos hablar.
		
		Collection<NaveDeTransporte> listaDeNavesDeTransporte = new ArrayList<NaveDeTransporte>();
		
		for (int i = 0; i < cantidad; i++) {
			listaDeNavesDeTransporte.add(new NaveDeTransporte());
		}
		
		return listaDeNavesDeTransporte;
	}
	
	

}
