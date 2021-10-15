package fr.alorithmie;

public class Rotation {

	public static void main(String[] args) {

		int array[] = { 0, 1, 2, 3 };
		int reverse = -1;
		int arrayReverse[] = new int[array.length];

		for (int i = array.length - 1; i >= 0; i--) {
			reverse++;
			arrayReverse[reverse] = array[i];
		}

		for (int i = 0; i < arrayReverse.length; i++) {

			System.out.println("reverse " + arrayReverse[i]);
		}

	}

}
