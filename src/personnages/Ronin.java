package personnages;

public class Ronin extends Humain {
	private int honneur = 1;
	
	public Ronin(String nom, String boissonPreferee, int argent) {
		super(nom, boissonPreferee, argent);
	}
	
	public void donner(Commercant beneficiaire) {
		int don = argent/10;
		perdreArgent(don);
		parler(beneficiaire.getNom() + ", prend ces " + don + " sous.");
		beneficiaire.recevoir(don);
	}
}
