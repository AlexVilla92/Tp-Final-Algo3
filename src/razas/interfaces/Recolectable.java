package razas.interfaces;

import mapa.excepciones.MineralAgotado;

public interface Recolectable {
	
	public void recolectar();

	public int obtenerMinerales();

	public void recolectar(int mineralRestante) throws MineralAgotado;


}
