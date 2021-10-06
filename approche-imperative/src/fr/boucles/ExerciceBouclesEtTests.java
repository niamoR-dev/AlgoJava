package fr.boucles;

public class ExerciceBouclesEtTests {

	public static void main(String[] args) {

		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };

		int[] arrayReverse = new int[array.length];
		int reverse = -1;

		// lecture du array
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		
		
		
		// inversion du array dans un nouvel array
		for (int i = array.length - 1; i >= 0; i--) {
			reverse++;
			arrayReverse[reverse] = array[i];
		}

		// lecture du reverse array
		for (int i = 0; i < arrayReverse.length; i++) {

			System.out.println("reverse" + arrayReverse[i]);
		}

		
		
		// affichage des index supérieur à 3
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 3) {
				System.out.println(">3 " + array[i]);
			}
		}
		// afficher les entiers pairs

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0 ) {
				System.out.println("pair " + array[i]);
			}
		}

		// afficher les index pair
		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0 ) {
				System.out.println("index pair " + i +  " " + array[i]);
			}
		}
		
		// afficher les entiers impairs
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 != 0 ) {
				System.out.println("impair " + array[i]);
			}
		}
	}
}
