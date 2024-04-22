package lab5;
import java.util.Scanner;

public class Task3_MagicNumber {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		System.out.println("Guess the secret number!");

		int guesses = 1;  // at least 1 guess is needed. 
		while (getUserInt(in)) {

			guesses++; // for every false guess another guess is needed 

		}

		System.out.println("You needed " + guesses + " guesses to find the magic number.");
		in.close();
	}

	private static boolean getUserInt(Scanner in) {
		System.out.println("Your guess:");

		int magicNumber = 126;

		while (!in.hasNextInt()) {
			System.err.println("Has to be a natural number.");
			in.next();
		}
		int input = in.nextInt();

		if (input < magicNumber) {
			System.out.println("The secret number is higher.");
		} else if (input > magicNumber) {
			System.out.println("The secret number is lower.");
		} else {
			System.out.println("Whoa! You guessed the number!");
			return false;
		}
		return true;
	}

	/*
	 * private static boolean inRange(int x, int start, int end) { boolean result =
	 * start <= x && x <= end; return result; }
	 */
}

/*
 * Schreiben Sie ein Programm welches den Benutzer auffordert die geheime Zahl
 * 126 zu erraten. Das Programm ließt dann ganze Zahlen aus der Benutzereingabe,
 * bis der Nutzer die Zahl erraten hat oder durch eine Falscheingabe (z.B. einen
 * Buchstaben) das Spiel beendet. Hat der Benutzer eine zu niedrige oder zu hohe
 * Zahl gewählt, wird ihm dies mitgeteilt. Hat der Benutzer die Zahl erraten,
 * gibt das Programm die Anzahl der benötigten Versuche aus. Verwenden Sie eine
 * Methode, die einen Scanner bekommt und zurückgibt, ob erneut geraten werden
 * soll (boolean). Beispiel: Raten Sie die geheime Zahl. Ihr Tipp? 50 Zu klein!
 * Ihr Tipp? 500 Zu gross! Ihr Tipp? 250 Zu gross! Ihr Tipp? 126 Richtig. Sie
 * benoetigten 4 Versuche.
 */