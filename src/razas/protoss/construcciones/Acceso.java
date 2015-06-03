package razas.protoss.construcciones;

import java.util.ArrayList;
import java.util.Collection;

import razas.Protoss;
import razas.interfaces.Construccion;
import razas.interfaces.Constructor;
import razas.protoss.unidades.Dragon;
import razas.protoss.unidades.Zealot;

public class Acceso extends Protoss implements Construccion, Constructor {

	public Acceso() {
		
		super();
		this.vida = 500;
		this.escudo = 500;
		
	}
	
	@Override
	public boolean esVolador() { return false; }

	@Override
	protected int escudoPerfecto() { return 500; }
	
	@Override
	public int getCostoMinerales() { return 150; }

	@Override
	public int getCostoGasVespeno() { return 0; }

	@Override
	public int getTiempoDeConstruccion() { return 8; }
	
	public Collection<Zealot> crearZealot(int cantidad) {
		
		// Deberia verificarse que cuando se crea un zealot existen los recursos para crearlo, pasando por parametro la cantidad
		// de recursos del jugador, o en otro caso que haya otra entidad que se encargue de esta validacion, lo podemos hablar.
		
		Collection<Zealot> listaDeZealots = new ArrayList<Zealot>();
		
		for (int i = 0; i < cantidad; i++) {
			listaDeZealots.add(new Zealot());
		}
		
		return listaDeZealots;
	}
	
	public Collection<Dragon> crearDragons(int cantidad) {
		
		// Deberia verificarse que cuando se crea un zealot existen los recursos para crearlo, pasando por parametro la cantidad
		// de recursos del jugador, o en otro caso que haya otra entidad que se encargue de esta validacion, lo podemos hablar.
		
		Collection<Dragon> listaDeDragons = new ArrayList<Dragon>();
		
		for (int i = 0; i < cantidad; i++) {
			listaDeDragons.add(new Dragon());
		}
		
		return listaDeDragons;
	}

}
