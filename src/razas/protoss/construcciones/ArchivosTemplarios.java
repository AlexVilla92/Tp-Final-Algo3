package razas.protoss.construcciones;

import java.util.ArrayList;
import java.util.Collection;

import razas.Protoss;
import razas.interfaces.Construccion;
import razas.interfaces.Constructor;
import razas.protoss.unidades.AltoTemplario;

public class ArchivosTemplarios extends Protoss implements Construccion, Constructor {

	public ArchivosTemplarios() {
		
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
	public int getCostoGasVespeno() { return 200; }

	@Override
	public int getTiempoDeConstruccion() { return 9; }
	
	public Collection<AltoTemplario> crearAltosTemplarios(int cantidad) {
		
		// Deberia verificarse que cuando se crea un zealot existen los recursos para crearlo, pasando por parametro la cantidad
		// de recursos del jugador, o en otro caso que haya otra entidad que se encargue de esta validacion, lo podemos hablar.
		
		Collection<AltoTemplario> listaDeAltosTemplarios = new ArrayList<AltoTemplario>();
		
		for (int i = 0; i < cantidad; i++) {
			listaDeAltosTemplarios.add(new AltoTemplario());
		}
		
		return listaDeAltosTemplarios;
	}

}
