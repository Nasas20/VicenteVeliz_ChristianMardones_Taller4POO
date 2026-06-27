package Logica;

import java.io.FileNotFoundException;

public interface ISistema {
	void leerArchivo() throws FileNotFoundException;
	void agregarCarta(String[] partes);
	void eliminarCarta(String nombreCarta);
	void modificarCarta(String nombre, String[] nuevo);

}
