package fr.boucles;

public class exerciceTableauEntier {

	public static void main(String[] args) {
		
		int[] integer = {1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10};
	

		for ( int i = 0 ; i<integer.length ; i++) {
			System.out.println(integer[i]);
		}
		
		System.out.println(integer[0]);
		
		System.out.println(integer.length);
		
		System.out.println(integer[integer.length - 1]);
		
		integer[4] = 8;
		
		System.out.println(integer[4]);
	}

}
