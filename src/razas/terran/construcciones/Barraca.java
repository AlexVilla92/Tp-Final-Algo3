package razas.terran.construcciones;

import java.util.ArrayList;
import java.util.Collection;

import razas.Terran;
import razas.interfaces.Construccion;
import razas.interfaces.Constructor;
import razas.terran.unidades.Marine;

public class Barraca extends Terran implements Construccion, Constructor {
	
	private final int costoMarin = 50;

	public Barraca() {
		
		super();
		this.vida = 1000;
		
	}
	
	@Override
	public boolean esVolador() { return false; }
	
	@Override
	public int getCostoMinerales() { return 150; }

	@Override
	public int getCostoGasVespeno() { return 0; }

	@Override
	public int getTiempoDeConstruccion() { return 12; }

	public Collection<Marine> crearMarines(int cantidad, int mineralesDisponibles) {
		
		// Deberia verificarse que cuando se crea un marine existen los recursos para crearlo, pasando por parametro la cantidad
		// de recursos del jugador, o en otro caso que haya otra entidad que se encargue de esta validacion, lo podemos hablar.
		
		Collection<Marine> listaDeMarines = new ArrayList<Marine>();
		
		if (this.sePuedeCrearAlosMarines(cantidad,mineralesDisponibles)) {
			
			for (int i = 0; i < cantidad; i++) {
				listaDeMarines.add(new Marine());
			} 
		}
		
		return listaDeMarines;
	}

	private boolean sePuedeCrearAlosMarines(int cantidad, int mineralesDisponibles) {
		
		return (mineralesDisponibles >= (cantidad * this.costoMarin));

	}
	
}
