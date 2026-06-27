package Dominio;

public class Energy extends Carta {
	private String elemento;

	public Energy(String nombreCarta, int rareza, String elemento) {
		super(nombreCarta, rareza);
		this.elemento = elemento;
	}

	public String getElemento() {
		return elemento;
	}
	
	

}
