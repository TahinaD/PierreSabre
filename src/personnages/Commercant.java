package personnages;

public class Commercant extends Humain {

	public Commercant(String nom, int argent) {
		super(nom, "th�", argent);
	}
	
	public int seFaireExtorquer() {
		parler("J'ai tout perdu ! Le monde est trop injuste...");
		int perdu = getArgent();
		perdreArgent(perdu);
		return perdu;
	}
	
	public void recevoir(int don) {
		parler(don + " sous ! Je te remercie g�n�reux donateur !");
		gagnerArgent(don);
	}
}
