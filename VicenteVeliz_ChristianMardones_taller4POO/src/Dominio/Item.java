package Dominio;

public class Item extends Carta {
	private int bonificacion;

	public Item(String nombreCarta, int rareza,int bonificacion) {
		super(nombreCarta, rareza);
		this.bonificacion = bonificacion;
	}

	public int getBonificacion() {
		return bonificacion;
	}
	

}
