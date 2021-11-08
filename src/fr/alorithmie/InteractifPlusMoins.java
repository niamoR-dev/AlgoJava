package fr.alorithmie;

import java.util.Random;
import java.util.Scanner;

/**
 * Jeu du nombre myst�re
 * 
 * @author niamoR eriameL
 * 
 *         Le syst�me choisit un nombre al�atoire entre 1 et 100 (il est
 *         possible de le fixer dans un premier temps). Le joueur doit trouver
 *         le nombre myst�re en 7 coups maximum ! A chaque tentative, le syst�me
 *         indique si le nombre myst�re est plus grand ou plus petit. A la fin
 *         du jeu, le syst�me indique le nombre de coup en cas de victoire, ou
 *         un message de d�faite le cas �ch�ant
 */
public class InteractifPlusMoins {

	public static Scanner scannerInputNumberUser = new Scanner(System.in);
	public static Scanner playAgain = new Scanner(System.in);

	public static void main(String[] args) {


		// �tape 1
		int numberToGuess;
		int inputNumberUser = 0;
		int testNumber = 0;
		int maxNumberToGuess = 100;
		int minNumberToGuess = 0;
		boolean errorIsCatched = false;
		int maxTry = 7;
		boolean startAgain = false;

		// �tape 2
		// numberToGuess = Math.random();
		// System.out.println(numberToGuess * 100);

		do {
			System.out.println(
					"voulez-vous paramétrer le jeu ? Dans la prochaine features, vous pourrez choisir le chiffre minimum et le chiffre maximum");

			Random fonctionRandom = new Random(); // Fonction random
			numberToGuess = fonctionRandom.nextInt((maxNumberToGuess - minNumberToGuess) + 1) + minNumberToGuess; // permet de prendre en/ compte
																													// le chiffre 100
			// System.out.println(numberToGuess);
			do {
				// demander à l'utilisateur de donner un entier 0 ><
				do {
					try {
						errorIsCatched = false;
						System.out.println("Ecrivez un chiffre entier entre 0 et " + maxNumberToGuess);
						inputNumberUser = scannerInputNumberUser.nextInt();

					} catch (Exception e) {
						System.err.println("Veuillez rentrer un  chiffre ENTIER !!!!! \n");
						errorIsCatched = true;
						scannerInputNumberUser.nextLine(); // Efface la donn�e du scanner et permets de sortir d'une
															// boucle infinie
					}

				} while (errorIsCatched == true);

				if (inputNumberUser < 0 || inputNumberUser > 100) { // gestion des nombres n�gatif ou sup�rieur au
																	// maximum
					System.err.println("c'est une erreur TRY AGAIN AND AGAIN");

				} else if (inputNumberUser < numberToGuess) { // Cas o� le chiffre est inf�rieur
					testNumber++;
					System.out.println("Vous en êtes à " + testNumber + " coup(s), encore " + (maxTry - testNumber)
							+ " coup(s)\r");
					System.out.println("Votre chiffre est INFERIEUR au chiffre à deviner \n            TRY AGAIN");

				} else if (inputNumberUser > numberToGuess) { // Cas o� le chiffre est sup�rieur
					System.out.println("Votre chiffre est SUP�RIEUR au chiffre à deviner \n            TRY AGAIN");
					testNumber++;
					System.out.println("Vous en êtes à " + testNumber + " coup(s), encore " + (maxTry - testNumber)
							+ " coup(s)\r");

				} else if (inputNumberUser == numberToGuess) { // quand il trouve
					System.out.println("trouvé");
					testNumber++;
					System.out.println("Vous avez trouvé en " + testNumber + " tours");

				} else {
					System.err.println("BAD DOne ");
				}

			} while (inputNumberUser != numberToGuess && testNumber < 7); // condition de bouclage

			if (testNumber > 7) { // si il sort de la boucle � cause du nombre d�pass�

				System.err.println("t'as abusé ");
			}

			// Possibilit� de rejouer sans relancer le script

			System.out.println(
					"Voulez-vous rejouer ? \rTapez 1 pour oui \rTapez n'importe quoi pour non \rTapez dans vos mains pour avoir l'air con");
			int wannaStartAgain = playAgain.nextInt();

			if (wannaStartAgain == 1) {
				startAgain = true;
				testNumber = 0;
			} else if (wannaStartAgain != 1) {
				System.out.println("En vrai j'avoue c'est nul comme jeu");
			}

		} while (startAgain == true);
	}
}
