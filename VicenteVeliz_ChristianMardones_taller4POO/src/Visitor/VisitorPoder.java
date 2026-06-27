package Visitor;

import Dominio.Energy;
import Dominio.Item;
import Dominio.Pokemon;
import Dominio.Supporter;

public interface VisitorPoder {
	double visitar(Pokemon p);
	double visitar(Supporter s);
	double visitar(Item i);
	double visitar(Energy e);



}
