package liveCoding;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n, x = 0, z;
		boolean yy = true;
		System.out.println("Taper : \n 1 pour continuer \n  0 pour quitter");
		z = sc.nextInt();
		switch (z) {
		case 1:
			yy = true;
			break;
		case 0:
			System.out.println("A bientot");
			yy = false;
			break;
		}

		while (yy) {
			System.out.println("selectionner: ");
			System.out.println("0 pour quitter");
			System.out.println("1 pour continuer ");
			x = sc.nextInt();
			switch (x) {
			case 0:
				System.out.println("A bientot");
				yy = false;
				break;
			case 1:
				System.out.println("Taper un nombre: ");
				n = sc.nextInt();
				if (n >= 0) {
					System.out.println("Resultat : " + Math.sqrt(n));
				} else {
					System.out.println("Taper un nombre positive");
				}
			}
		}

		sc.close();

	}

}
