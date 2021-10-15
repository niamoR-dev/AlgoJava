package fr.alorithmie;

import java.util.Scanner;

public class InteractifTantQue {

	public static Scanner scanner = new Scanner(System.in);
	public static int nb;

	public static void main(String[] args) {

		mainMethod();
		
		

	}

/////////////////////////////////////////// Méthodes ///////////////////////////////////////////////////////	
	
private static void mainMethod() {
	
	do {
		nb = trycatch();

	} while (nb <= 0 || nb >= 10);

	System.out.println("Sorti de la boucle");

	scanner.close();
		
	}



	// méthode trycatch pour chiffre non entier
	private static int trycatch() {

		boolean tryCatch;
		do {

			try {
				tryCatch = false;
				nb = askNumber();

			} catch (Exception e) {
				System.out.println("Veuiller rentrer un numéro ENTIER !!!!");
				tryCatch = true;
				scanner.nextLine();
			}

		} while (tryCatch == true);
		
		return nb;

	}

	public static int askNumber() {
		

		System.out.println("Donnez un chiffre entre 1 et 10");
		nb = scanner.nextInt();

		System.out.println("Votre chiffre est le suivant " + nb);

		return nb;

	}

}
