package Dominio;

import Visitor.VisitorPoder;

public abstract class Carta {
	protected String nombreCarta;
	protected int rareza;
	
	
	public Carta(String nombreCarta, int rareza) {
		this.nombreCarta = nombreCarta;
		this.rareza = rareza;
	}
	
	public abstract double aceptar(VisitorPoder v);
	public abstract void modificar(String[] nuevo);


	public String getNombreCarta() {
		return nombreCarta;
	}


	public int getRareza() {
		return rareza;
	}
	
	
	
	
	

}
