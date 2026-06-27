package Dominio;

public class Supporter extends Carta {
	private int efectosPorTurno;

	public Supporter(String nombreCarta, int rareza, int efectosPorTurno) {
		super(nombreCarta, rareza);
		this.efectosPorTurno = efectosPorTurno;
	}

	public int getEfectosPorTurno() {
		return efectosPorTurno;
	}
	
	

}
