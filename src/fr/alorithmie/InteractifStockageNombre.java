package fr.alorithmie;

import java.util.ArrayList;
import java.util.Scanner;

public class InteractifStockageNombre {

	// public static Map<String, Integer> shoppingList = new HashMap<String,
	// Integer>();
	public static Scanner scannerName = new Scanner(System.in); // ouverture du scanner en globale
	public static ArrayList<Integer> numberArray = new ArrayList<Integer>(); // ouverture de la liste en globale
	// List est une fonction <nomclassobjet> nom de la liste = nouveau type de liste
	// tableau<nomclassobjet>

	public static void main(String[] args) {

		// d�claration des variables
		boolean wannaExit = false;

		numberArray.add(40);
		numberArray.add(6);
		numberArray.add(1);
		numberArray.add(1);
		// nameArray.add( new classObjetName(null, 0, null); possibilit� d'afficher les
		// valeurs r�clam� pour satisfaire le constructeur

		do { // boucle pour que l'utilisateur puisse recommencer � utiliser la liste de
				// course

			int userChoice = tryCatch();

			wannaExit = Menu(userChoice); // fonction pour utiliser la liste , le retour de valeur bool�enne permet de
											// boucler ou non

			// System.out.println("isExit" + isExit); // affichage de s�curit�

		} while (wannaExit != true);
	}

	private static int tryCatch() {

		boolean tryCatch;
		int userChoice = 666;
		do {
			try {
				tryCatch = false;
				ShowMenu(); // fonction d'affichage du menu de choix
				// peut on faire un deuxi�me menu ?
				userChoice = scannerName.nextInt(); // demande de saisie utilisateur
				System.out.println("\rVous avez tapé le numéro : " + userChoice);

			} catch (Exception e) {
				System.out.println("Veuillez seulement rentrer un chiffre ENTIER !!!!! \n");
				tryCatch = true;
				scannerName.nextLine();
			}

		} while (tryCatch == true);

		return userChoice;
	}

	// fonction d'affichage du menu
	private static void ShowMenu() {

		System.out
				.println("\rFaites votre choix\r" + " 1 - Afficher la liste des Éléments\r" + " 2 - Ajouter un nombre\r"

						+ " 3 - Quitter le programme\r");
	}

	// Fonction menu choix utilisateur avec param�tre d'entr�e

	private static boolean Menu(int choiceUser) {

		// red�claration des variables autre que les param
		boolean isExit = false;

		if (choiceUser < 1 || choiceUser > 3) {
			System.out.println("Veuillez faire un choix dans la liste");

			// affichage de la liste
		} else if (choiceUser == 1) {
			System.out.println("Vous demandez à afficher les éléments");

			showList();

			// ajout d'un truc � la liste
		} else if (choiceUser == 2) {

			choice2();

			// Quitter le programme
		} else if (choiceUser == 3) {
			System.out.println("Vous demandez à Quitter le programme");
			isExit = true;

			// Gestion des erreurs
		} else {
			System.err.println("error");
		}

		// Valeur retourn�e qui permet de sortir de la boucle
		return isExit;
	}

	private static void choice2() { // pour ajouter quelque chose dans la liste

		System.out.println("Vous demandez à Ajouter un Élément\r");

		System.out.println("Indiquez votre nombre ");
		int quantity = scannerName.nextInt();
		numberArray.add(quantity);

		newList();
	}

	private static void showList() {
		System.out.println("\rVotre liste de course");
		for (int i = 0; // d�claration de la valeur de d�part de la recherche dans l'index
				i < numberArray.size(); // condition d'arr�t, ici la longueur compl�te du tableau
				i++) { // type d'incr�mentation, ici de 1 en 1
			System.out.println(numberArray.get(i)); // affichage a chaque passage dans la boucle et selon la longueur du
													// tableau
		}
	}

	private static void newList() {
		System.out.println("\rVotre nouvelle liste : ");
		for (int i = 0; i < numberArray.size(); i++) {
			System.out.println(numberArray.get(i));
		}
	}
}
