package mapa.materiales;

import razas.interfaces.Unidad;
import mapa.Material;

public class MaterialTierra extends Material {
	
	private static MaterialTierra instancia = null;
	
	public static MaterialTierra instancia() {
	      if(instancia == null) {
	         instancia = new MaterialTierra();
	      }
	      return instancia;
	   }

	@Override
	public boolean esTranspasablePor(Unidad unidad) {
		//Todo puede estar sobre tierra (a menos que hagamos botes...)
		return true;
	}
	
}
