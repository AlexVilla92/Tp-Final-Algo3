package razas.interfaces;

import razas.excepciones.EspecieYaEstaMuerta;

public interface Atacable {

	public void atacadoPor(Unidad atacante) throws EspecieYaEstaMuerta;
	
}
