package razas.interfaces;

import razas.excepciones.YaFueDestruido;

public interface Atacable {

	public void atacadoPor(Unidad atacante) throws YaFueDestruido;
	
}
