package fr.boucles;

public class ExerciceBoucleBase {

	public static void main(String[] args) {
		
		String firstName = "Romain";
		String lastName = "Lemaire";
		
		
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
		
		for (int i = 0; i <= 20; i++) {
			System.out.println(firstName + " "+ lastName);
		}
		
	
		for (int i = 0; i <= 100 ; i = i + 2 ) {
			System.out.println(i);
		}
		
		for (int i = 1; i <= 100 ; i = i + 2 ) {
			System.out.println(i);
		}

	}

}
