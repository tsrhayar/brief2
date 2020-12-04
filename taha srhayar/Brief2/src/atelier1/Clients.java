package atelier1;

public class Clients {

	String nom, adress,afficherInfoSolde;
	double solde;

	public Clients(String string, String string2, double solde) {
		this.nom = string;
		this.adress = string2;
		this.solde = solde;
	}

	@Override
	public String toString() {
		return nom + "habite à (" + adress + ") - infos solde " + solde + " DH";
	}

	public static void main(String[] args) {

		Clients c1 = new Clients("El Alami Hassan", "Safi", 14765.8);
		System.out.println(c1);

		Clients c2 = new Clients("Karimi Khalid", "Casablaca", 7654.0);
		System.out.println(c2);

	}

}
