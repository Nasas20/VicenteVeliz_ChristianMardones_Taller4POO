package Dominio;

import Visitor.VisitorPoder;

public class Energy extends Carta {
	private String elemento;

	public Energy(String nombreCarta, int rareza, String elemento) {
		super(nombreCarta, rareza);
		this.elemento = elemento;
	}

	public String getElemento() {
		return elemento;
	}

	@Override
	public double aceptar(VisitorPoder v) {
		return v.visitar(this);
	}

	@Override
	public void modificar(String[] nuevo) {
		this.elemento = nuevo[0];
		
	}
	
	

}
