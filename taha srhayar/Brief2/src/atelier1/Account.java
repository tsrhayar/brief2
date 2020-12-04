package atelier1;

public class Account {

	static String nom;
	static String adress;
	static double solde;

	public Account(String nom, String adress, double solde) {
		this.nom = nom;
		this.adress = adress;
		this.solde = solde;
	}

	private static void afficherInfosSolde(Account c1)  {
		System.out.println(nom + " habite à (" + adress + ") - infos solde " + solde + " DH");
	}

	private static void calculerInteret(Account c1Account) {
		System.out.println("Bonjour " + nom + " votre interet est: " + solde * 0.07 + " Dh");
	}

	public static void main(String[] args) {

		Account c1 = new Account("Taha Srhayar", "Safi", 10000);
		Account c2 = new Account("Khalid ahmed", "El jadida", 15000);
		
		afficherInfosSolde(c1);
		calculerInteret(c1);
	}

}
