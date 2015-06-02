package mapa.materiales;

import razas.interfaces.Unidad;
import mapa.Material;

public class MaterialTierra extends Material {

	@Override
	public boolean esTranspasable(Unidad unidad) {
		return true;
	}
	
}
