package Strategy;

import java.util.ArrayList;

import Dominio.Carta;

public class OrdenamientoNombre implements OrdenamientoStrategy {

	@Override
	public void ordenar(ArrayList<Carta> lista) {
		int tamaño = lista.size();
		
		if (tamaño >0) {
			for (int i = 0; i < lista.size() -1 ; i++) {
				for (int j = 0; j < lista.size() - 1-i; j++) {
					if (lista.get(j).getNombreCarta().compareTo(lista.get(j + 1).getNombreCarta()) > 0) {
						Carta aux = lista.get(j);
						lista.set(j, lista.get(j+1));
						lista.set(j + 1, aux);
					}
				}
			}
		}
	}

}
