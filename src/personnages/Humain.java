package personnages;

public class Humain {
	private String nom;
	private String boissonPreferee;
	private int argent;
	
	public Humain(String nom, String boissonPreferee, int argent) {
		this.nom = nom;
		this.boissonPreferee = boissonPreferee;
		this.argent = argent;
	}

	public String getNom() {
		return nom;
	}

	public int getArgent() {
		return argent;
	}
	
	private void gagnerArgent(int credit) {
		argent += credit;
	}
	
	private void perdreArgent(int debit) {
		argent -= debit;
	}

	public void parler(String texte) {
		System.out.println("\"(" + nom + ") - " + texte + "\"");
	}
	
	public void acheter(String achat, int prix) {
		if (argent >= prix ) {
			parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir "
			+ achat + " à " + prix + " sous.");
			perdreArgent(prix);
		}
		else {
			parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux même pas m'offrir "
			+ achat + " à " + prix + " sous.");
		}
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de " + boissonPreferee + " ! GLOUPS !");
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + boissonPreferee + " et j'aime boire du " + boissonPreferee);
	}
}
