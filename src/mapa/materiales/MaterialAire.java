package mapa.materiales;

import razas.interfaces.Unidad;
import mapa.Material;

public class MaterialAire extends Material {
	
	private static MaterialAire instancia = null;
	
	public static MaterialAire instancia() {
	      if(instancia == null) {
	         instancia = new MaterialAire();
	      }
	      return instancia;
	   }

	@Override
	public boolean esTranspasablePor(Unidad unidad) {
		return puedeVolar(unidad);
	}
	
}
