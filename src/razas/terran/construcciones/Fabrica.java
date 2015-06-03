package razas.terran.construcciones;

import java.util.ArrayList;
import java.util.Collection;

import razas.Terran;
import razas.interfaces.Construccion;
import razas.interfaces.Constructor;
import razas.terran.unidades.Golliat;

public class Fabrica extends Terran implements Construccion, Constructor {

	public Fabrica() {
		
		super();
		this.vida = 1250;
		
	}
	
	@Override
	public boolean esVolador() { return false; }
	
	@Override
	public int getCostoMinerales() { return 200; }

	@Override
	public int getCostoGasVespeno() { return 100; }

	@Override
	public int getTiempoDeConstruccion() { return 12; }

	public Collection<Golliat> crearGolliats(int cantidad) {
		
		// Deberia verificarse que cuando se crea un golliat existen los recursos para crearlo, pasando por parametro la cantidad
		// de recursos del jugador, o en otro caso que haya otra entidad que se encargue de esta validacion, lo podemos hablar.
		
		Collection<Golliat> listaDeGolliats = new ArrayList<Golliat>();
		
		for (int i = 0; i < cantidad; i++) {
			listaDeGolliats.add(new Golliat());
		}
		
		return listaDeGolliats;
	}
	
}
