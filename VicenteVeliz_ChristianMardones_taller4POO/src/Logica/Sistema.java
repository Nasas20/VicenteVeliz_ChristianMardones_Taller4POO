package Logica;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import Dominio.Carta;
import Dominio.Factory;

public class Sistema implements ISistema {
	private ArrayList<Carta> lista = new ArrayList<>();

	@Override
	
	public void modificarCarta(String nombre, String[] nuevo) {
		for (Carta c : lista) {
			if (nombre.equalsIgnoreCase(c.getNombreCarta())) {
				c.modificar(nuevo);
				return;
			}
		}
		
	}
	
	public void eliminarCarta(String nombreCarta) {
		for (int i = 0; i < lista.size(); i++) {
	        if (lista.get(i).getNombreCarta().equalsIgnoreCase(nombreCarta)) {
	            lista.remove(i);
	            return;
	        }
	    }
	}
	
	public void agregarCarta(String[] partes) {
		Carta c = Factory.getFactory(partes);
		if (c!= null) {
			lista.add(c);
		}
	}
	
	
	public void leerArchivo() throws FileNotFoundException {
		File arch = new File("archivos/sobres.txt");
		Scanner scan = new Scanner(arch);
		
		while(scan.hasNextLine()) {
			String linea = scan.nextLine();
			String[] partes = linea.split(";");
			
			Carta c = Factory.getFactory(partes);
			lista.add(c);
		}
		
	}
	
	private static Sistema instancia;

	private Sistema() {
    }

    public static Sistema getInstancia() {
        if (instancia == null) {
            instancia = new Sistema();
        }
        return instancia;
    }


	

}
