package atelier1;

public class Chien {

	String manger, aboyer;

	public Chien(String m, String a) {
		this.manger = m;
		this.aboyer = a;
	}

	public String getManger() {
		return manger;
	}

	public void setManger(String manger) {
		this.manger = manger;
	}

	public String getAboyer() {
		return aboyer;
	}

	public void setAboyer(String aboyer) {
		this.aboyer = aboyer;
	}

	@Override
	public String toString() {
		return "manger=" + manger + ", aboyer=" + aboyer;
	}

	public static void main(String[] args) {

		Chien Rex = new Chien("Je suis en colère. Ghhhhhhhhhh !!! WWWWOARF !!", "Je mange de la viande");

		System.out.println("Rex: " + Rex);

		Chien Max = new Chien("Je ne suis pas du tout en colère. Iwiw !! awaw !!", "Je mange du poisson");

		System.out.println("Max: " + Max);
	}

}
