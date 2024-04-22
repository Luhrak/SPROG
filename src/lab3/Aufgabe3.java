package lab3;
import java.util.Scanner;

public class Aufgabe3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Welcome to Mensa Flensburg.");

		String input = "";
		int account, price;

		while (true) {
			System.out.println("How much money do you have on your account right now?");
			input = in.nextLine();
			try {
				account = Integer.parseUnsignedInt(input); // only allow positive "unsigned" int
				break;
			} catch (NumberFormatException e) {
				System.err.println("error");
			}
		}

		do {
			System.out.println("Type the price of your next meal or e to exit.");
			input = in.nextLine();

			if (input.equals("e")) {
				System.out.println("Thank you, come again!");
				break;
			}

			try {
				price = Integer.parseUnsignedInt(input); // only allow positive "unsigned" int

			} catch (NumberFormatException e) {
				price = 0;
			}
			account = account - price;

			if (account >= 0) {
				System.out.println("You have " + account + "€ left.");
			} else {
				System.out.println("You dont have enough money remaining. Please recharge.");
			}

		} while (account >= 0);

		in.close();
	}
}

/*
 * 3 - Mensa Schreiben Sie ein Programm, welches die Benutzung der Campus-Card
 * simuliert. Das Programm soll zuerst den Benutzer nach seinem Guthaben fragen.
 * Das Guthaben muss eine positive ganze Zahl sein. Hat der Benutzer das
 * Guthaben eingegeben, fordert ihn das Programm auf, seine Ausgaben einzugeben.
 * Dies soll solange geschehen, bis der Nutzer nicht mehr ausreichend Guthaben
 * auf seiner Campus-Card hat, oder er das Programm durch Eingabe eines Textes
 * abbricht. Das Programm soll dem Benutzer nach jeder Eingabe das aktuelle
 * Guthaben anzeigen.
 */