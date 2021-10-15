package fr.alorithmie;

public class FirstLast {

	public static void main(String[] args) {

		int[] array1 = { 1, 15, -3, 8, 3, 0, 14, 1 };

		int[] array2 = { 6, 15, -3, 2, 3, 0, 14, 7 };

		int[] array3 = {};
		
		int[] array4 = { 7, 15, -3, 2, 3, 0, 14, 7 };
		
		firstLastWith6(array1);
		firstLastWith6(array2);
		firstLastWith6(array3);
		firstLastWith6(array4);

	}

	private static void firstLastWith6(int[] array) {

		boolean firstLast6 = false;
		firstLast6 = array.length >= 1 && (array[0] == array[array.length - 1]); 
		System.out.println(firstLast6);

	}

}
