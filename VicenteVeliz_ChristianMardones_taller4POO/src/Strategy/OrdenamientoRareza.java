package Strategy;

import java.util.ArrayList;

import Dominio.Carta;

public class OrdenamientoRareza implements OrdenamientoStrategy {

	@Override
	public void ordenar(ArrayList<Carta> lista) {
		int tamaño = lista.size();
		
		if (tamaño >0) {
			for (int i = 0; i < lista.size() -1 ; i++) {
				for (int j = 0; j < lista.size() - 1-i; j++) {
					if (lista.get(j).getRareza() < lista.get(j + 1).getRareza()) {
						Carta aux = lista.get(j);
						lista.set(j, lista.get(j+1));
						lista.set(j+1, aux);
					}
				}
			}
		}
		
	}

}
