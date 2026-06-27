package Dominio;

import Visitor.VisitorPoder;

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
	
	public double aceptar(VisitorPoder v) {
		return v.visitar(this);
	}

	@Override
	public void modificar(String[] nuevo) {
		this.daño = Integer.valueOf(nuevo[0]);
		this.cantEnergias = Integer.valueOf(nuevo[1]);

	}
	
	
	
	
	
}
