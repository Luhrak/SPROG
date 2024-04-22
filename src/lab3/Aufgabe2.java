package lab3;
import java.util.Scanner;

public class Aufgabe2 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String redo = "n"; 
		int num1, num2; 
	
		do {
			System.out.println("Welcome to Blackjack, pleae put in a number");
			num1 = in.nextInt(); 
			System.out.println("Please put in a second number");
			num2 = in.nextInt(); 
			
			boolean same = num1 == num2; 
			boolean overshoot = (num1 > 21) && (num2 > 21); 
			
			boolean bigger = num1 > num2;
			boolean valid1 = num1 <= 21;
			boolean valid2 = num2 <= 21;
			
			
			if (same) {
				System.out.println("The numbers are the same please play again.");
			} else if (overshoot) {
				System.out.println("Sadly both numbers are over 21, meaning the bank wins.");
			} else if ((bigger || !valid2) && valid1) {
				System.out.println(num1);
			} else {
				System.out.println(num2);
			}
			
			System.out.println("Would you like to play again? (y/n)");
			in.nextLine(); //stdin buffer cleared (still had input of num1 & num2) 
			redo = in.nextLine(); 
			
		} while (redo.contains("y")); 
		
		System.out.println("Would you like to play againsknngfngdfng? (y/n)");
		
		in.close();
	}
}


/* 
	> give out bigger one thats also not bigger 21 
	> if both bigger > lost 
	> if both same > retry 
	
	
	
	2 - Blackjack
	Schreiben Sie ein Programm, welches den Benutzer zur Eingabe von 2 Zahlen auffordert. Dann gibt
	das Programm die Zahl aus, die näher an der 21 ist, aber nicht größer als 21. Wenn beide Zahlen
	größer als 21 sind, soll das Programm die Meldung: „Leider sind beide Zahlen größer 21, es gewinnt
	die Bank!“ ausgeben. Sind beide Zahlen gleich, soll das Programm „Die Zahlen sind gleich, bitte
	spielen Sie noch einmal“ ausgeben.
	Nach eine Runde Blackjack soll der Nutzer gefragt werden, ob er bzw. sie noch eine Runde spielen
	oder aufhören möchte (möchte er bzw. sie weiterspielen geht das Spiel von vorne los)
*/ 