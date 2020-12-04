package liveCoding;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {

		double solde, soldePrecedent, interet = 0.01;
		int nombreMois;

		Scanner sc = new Scanner(System.in);

		System.out.println("Taper le solde: ");
		solde = sc.nextDouble();
		soldePrecedent = solde;

		System.out.println("Taper le nombre des mois: ");
		nombreMois = sc.nextInt();

		for (int i = 0; i < nombreMois; i++) {
			solde = solde + (solde * interet);
		}

		System.out.println("Les intérêts cumulés après " + nombreMois + " mois est: " + (solde - soldePrecedent));
		System.out.println("Le solde total est: " + solde);

		sc.close();
	}

}
