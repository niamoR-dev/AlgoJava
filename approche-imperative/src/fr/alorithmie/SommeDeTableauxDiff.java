package fr.alorithmie;

public class SommeDeTableauxDiff {

	public static void main(String[] args) {

		int[] array1 = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		int[] array2 = { -1, 12, 17, 14, 5, -9, 0, 18 };
		int[] arrayTotal = array1;

		for (int i = 0; i < array2.length; i++) {
				arrayTotal[i] += array2[i];	
		}
		
		for (int i = 0; i < arrayTotal.length; i++) {
			System.out.println(arrayTotal[i]);
		}
		
	}

}
