package personnages;

public class Commercant extends Humain {

	public Commercant(String nom, int argent) {
		super(nom, "thé", argent);
	}
	
	public int seFaireExtorquer() {
		parler("J'ai tout perdu ! Le monde est trop injuste...");
		int perdu = getArgent();
		perdreArgent(perdu);
		return perdu;
	}
	
	public void recevoir(int don) {
		parler(don + " sous ! Je te remercie généreux donateur !");
		gagnerArgent(don);
	}
}
