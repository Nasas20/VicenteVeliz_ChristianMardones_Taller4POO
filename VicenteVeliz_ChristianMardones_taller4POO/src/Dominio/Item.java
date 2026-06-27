package Dominio;

import Visitor.VisitorPoder;

public class Item extends Carta {
	private int bonificacion;

	public Item(String nombreCarta, int rareza,int bonificacion) {
		super(nombreCarta, rareza);
		this.bonificacion = bonificacion;
	}

	public int getBonificacion() {
		return bonificacion;
	}

	@Override
	public double aceptar(VisitorPoder v) {
		// TODO Auto-generated method stub
		return v.visitar(this);
	}

	@Override
	public void modificar(String[] nuevo) {
		this.bonificacion = Integer.valueOf(nuevo[0]);
	}
	

}
