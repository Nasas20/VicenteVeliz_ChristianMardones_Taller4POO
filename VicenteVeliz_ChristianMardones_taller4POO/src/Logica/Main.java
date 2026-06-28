package Logica;

import java.io.FileNotFoundException;

import GUI.Ventana;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Sistema sistema = Sistema.getInstancia();
		sistema.leerArchivo();
		new Ventana().iniciar();
	}

}
