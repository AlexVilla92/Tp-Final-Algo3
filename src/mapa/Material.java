package mapa;

import razas.interfaces.Unidad;

public abstract class Material {
	@SuppressWarnings("unused") //Lo usan las clases hijas
	private boolean puedeVolar(Unidad unidad) {
		return unidad.esVolador();
	}
	public abstract boolean esTranspasable(Unidad unidad);
}
