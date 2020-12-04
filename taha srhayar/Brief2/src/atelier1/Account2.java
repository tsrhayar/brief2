package atelier1;

public class Account2 {

	String nom;
	String adress;
	Double solde;

	public Account2(String nom, String adress, Double solde) {
		this.nom = nom;
		this.adress = adress;
		this.solde = solde;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public Double getSolde() {
		return solde;
	}

	public void setSolde(Double solde) {
		this.solde = solde;
	}



	@Override
	public String toString() {
		return "Account2 [nom=" + nom + ", adress=" + adress + ", solde=" + solde + "]";
	}
	
	public static void main(String[] args) {
		
		 Account2 a = new Account2("Taha", "Safi", (double) 20000);
		 
		 System.out.println(a);
 		
	}

}
