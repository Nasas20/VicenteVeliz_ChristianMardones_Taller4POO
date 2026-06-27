package Strategy;

import java.util.ArrayList;

import Dominio.Carta;
import Visitor.CalculadoraPoderVisitor;

public class OrdenamientoPorPoder implements OrdenamientoStrategy {

	@Override
	public void ordenar(ArrayList<Carta> lista) {
		int tamaño = lista.size();
		CalculadoraPoderVisitor poder = new CalculadoraPoderVisitor();
		
		for (int i = 0; i < tamaño - 1; i++) {
	        for (int j = 0; j < tamaño - 1 - i; j++) {
	            double poderJ = lista.get(j).aceptar(poder);
	            double poderJ1 = lista.get(j + 1).aceptar(poder);

	            if (poderJ < poderJ1) {
	                Carta temp = lista.get(j);
	                lista.set(j, lista.get(j + 1));
	                lista.set(j + 1, temp);
	            }
	        }
	    }
	}

}
