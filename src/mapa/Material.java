package mapa;

import razas.interfaces.Unidad;

public abstract class Material {
	protected boolean puedeVolar(Unidad unidad) {
		return unidad.esVolador();
	}
	public abstract boolean esTranspasablePor(Unidad unidad);
}
