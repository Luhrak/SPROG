package lab5;
import java.util.Scanner;

public class Task2_1x1 {
	public static void main(String[] args) {

		int n = getUserInt("Till what number would you like the multiplication tables of?");

		printMultiplicationTables(n);
		
	}


	private static int getUserInt(String info) {
		Scanner in = new Scanner(System.in);
		System.out.println(info);

		while (!in.hasNextInt()) {
			System.err.println("Has to be a natural number.");
			in.next();
		}
		int input = in.nextInt();
		
		in.close();
		return input;
	}
	
	private static void printMultiplicationTables(int n) {
		int multiply = 1; 
		
		for (int i = 1; i <= n; i++) {
			for (int i2 = 1; i2 <= 10; i2++) {
				multiply = i * i2;
				System.out.print(multiply + " ");
			}	
			System.out.println();
		}
	}
}

/*
 * Geben Sie eine Einmaleins Tabelle aus. Das Programm soll eine Zahl n einlesen
 * und die Einmaleinstabelle bis n ausgeben. Dazu benutzen Sie bitte eine
 * Methode, welche jeweils eine Zeile (z.B. für 2: 2 4 6 8 10 12 14 16 18 20)
 * ausgibt. Beispiel: Bitte Zahl eingeben: 3 1 2 3 4 5 6 7 8 9 10 2 4 6 8 10 12
 * 14 16 18 20 3 6 9 12 15 18 21 24 27 30
 */