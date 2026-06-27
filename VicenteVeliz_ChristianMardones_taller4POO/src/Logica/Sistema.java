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
