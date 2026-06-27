package Logica;

import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		ISistema sistema = Sistema.getInstancia();
		sistema.leerArchivo();
	}

}
