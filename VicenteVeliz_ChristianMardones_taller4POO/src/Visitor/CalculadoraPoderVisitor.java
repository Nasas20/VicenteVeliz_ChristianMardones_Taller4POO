package Visitor;

import Dominio.Energy;
import Dominio.Item;
import Dominio.Pokemon;
import Dominio.Supporter;

public class CalculadoraPoderVisitor implements VisitorPoder {

	@Override
	public double visitar(Pokemon p) {
		return ((double) p.getDaño() / p.getCantEnergias()) * 100;
	}

	@Override
	public double visitar(Supporter s) {
		return s.getEfectosPorTurno()*50;
	}

	@Override
	public double visitar(Item i) {
		return i.getBonificacion()*20;
	}

	@Override
	public double visitar(Energy e) {
		return 1;
	}

}
