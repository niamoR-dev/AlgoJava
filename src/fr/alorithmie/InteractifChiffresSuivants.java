package fr.alorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {

	public static Scanner scanner = new Scanner(System.in);
	public static int nb;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		mainMethod();

	}

	/////////////////////////////////////////// Méthodes
	/////////////////////////////////////////// //////////////////////////////////////////////////////////////////

	
	// méthode principale
	private static void mainMethod() {

		do {
			trycatch();

		} while (nb < 1 || nb > 10);

		System.out.println("Sorti de la boucle");

		scanner.close();

		calcul();
	}

	
	// méthode qui fait un calcul
	private static void calcul() {
		
		for (int i = nb; i >= 1; i--) {
			System.out.println(i);
			//int add2 = nb ;
			//System.out.println(add2);
		}

	}

	// méthode trycatch pour chiffre non entier
	private static void trycatch() {

		boolean tryCatch;
		do {

			try {
				tryCatch = false;
				askNumber();

			} catch (Exception e) {
				System.out.println("Veuiller rentrer un numéro ENTIER !!!!");
				tryCatch = true;
				scanner.nextLine();
			}

		} while (tryCatch == true);

	}

	// méthode pour demander une saisie utilisateur
	public static void askNumber() {

		System.out.println("Donnez un chiffre entre 1 et 10");
		nb = scanner.nextInt();

		System.out.println("Votre chiffre est le suivant " + nb);

	}

}

