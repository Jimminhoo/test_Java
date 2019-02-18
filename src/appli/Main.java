package appli;

import java.time.LocalDate;

import metier.Chambre;
import metier.Client;
import metier.Valet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Valet valet1 = new Valet("Benoit", "Dupond", 26, 01251);
		Valet valet2 = new Valet("Maurice", "Kévinou", 27, 01254);
		valet1.toString();
		valet2.toString();
		
		Client clt1 = new Client("BELAYAT", "Fayçal", LocalDate.now(), 3);
		Client clt2 = new Client("TATSINOU", "Jimmy", LocalDate.now(),5);
		clt1.toString();
		clt2.toString();
		
		Chambre chambre1 = new Chambre(125, 1, 19, "Benoit", 01251);
		Chambre chambre2 = new Chambre(365, 3, 28, "TATSINOU", 01254);
		chambre1.toString();
		chambre2.toString();
	}

}
