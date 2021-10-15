package fr.alorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {

	public static Scanner scanner = new Scanner(System.in);
	public static int nb;
	public static int nbNumber;
	public static int[] numbersUser = new int[10];

	public static void main(String[] args) {

		mainMethod();

	}

	/////////////////////////////////////////// Méthodes////////////////////////////////////////////////////////////////////////////////////////////////////////////

	// méthode principale
	private static void mainMethod() {

		trycatch();

		

		scanner.close();

		calcul();
	}

	// méthode qui fait une multiplication
	private static void calcul() {

		int maxNumber = numbersUser[0];

		for (int i = 0; i < numbersUser.length; i++) {

			if (numbersUser[i] > maxNumber) {
				maxNumber = numbersUser[i];
			}

		}
		System.out.println("Le chiffre le plus gros de vos saisies est " + maxNumber);
	}

//	// méthode trycatch pour chiffre non entier
//	private static void tryatch() {
//		
//	}

	// méthode pour demander une saisie utilisateur
	public static void trycatch() {

		boolean tryCatch;

		for (int i = 0; i <= 9; i++) {

			System.out.println("Donnez 10 fois un chiffre entier. Vous en êtes à " + i);

			do {

				try {
					tryCatch = false;

					nb = scanner.nextInt();
				} catch (Exception e) {
					System.out.println("Veuiller rentrer un numéro ENTIER !!!!");
					tryCatch = true;
					scanner.nextLine();
				}
			} while (tryCatch == true);

			numbersUser[i] = nb;
			System.out.println("Votre chiffre est le suivant " + nb);
			nbNumber++;

		}
	}
}
