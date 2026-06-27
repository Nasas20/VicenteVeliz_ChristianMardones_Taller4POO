package Dominio;

import Visitor.VisitorPoder;

public class Supporter extends Carta {
	private int efectosPorTurno;

	public Supporter(String nombreCarta, int rareza, int efectosPorTurno) {
		super(nombreCarta, rareza);
		this.efectosPorTurno = efectosPorTurno;
	}

	public int getEfectosPorTurno() {
		return efectosPorTurno;
	}
	
	public double aceptar(VisitorPoder v) {
		return v.visitar(this);
	}

	@Override
	public void modificar(String[] nuevo) {
		this.efectosPorTurno = Integer.valueOf(nuevo[0]);
	}
	
	

}
