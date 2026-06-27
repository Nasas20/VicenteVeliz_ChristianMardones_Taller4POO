package Dominio;

public class Pokemon extends Carta {
	private int daño;
	private int cantEnergias;
	
	public Pokemon(String nombreCarta, int rareza, int daño, int cantEnergias) {
		super(nombreCarta, rareza);
		this.daño = daño;
		this.cantEnergias = cantEnergias;
	}

	public int getDaño() {
		return daño;
	}

	public int getCantEnergias() {
		return cantEnergias;
	}
	
	
	
	
	
}
