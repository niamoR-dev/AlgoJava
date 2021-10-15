package fr.alorithmie;

public class FirstLast6 {

	public static void main(String[] args) {

		int[] array1 = { 1, 15, -3, 8, 3, 0, 14, 6 };

		int[] array2 = { 6, 15, -3, 2, 3, 0, 14, 1 };

		int[] array3 = { 1, 15, -3, 0, 14, 0 };

		int[] array4 = {};

		FirstLastWith6(array1);
		FirstLastWith6(array2);
		FirstLastWith6(array3);
		FirstLastWith6(array4);

	}

	private static void FirstLastWith6(int[] array) {

		boolean firstLast6 = false;

		if (array.length > 0 && (array[0] == 6 || array[array.length - 1] == 6)) {
			firstLast6 = true;
		}
		System.out.println(firstLast6);

	}

}