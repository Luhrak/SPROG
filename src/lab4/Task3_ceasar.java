package lab4;
import java.util.Scanner;

public class Task3_ceasar {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		boolean valid = false;
		int number = 0;
		String message = "";
		String code = "";
		String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

		System.out.println("Welcome to the ceasar cypher maker.");

		while (!valid) {
			System.out.println("Please type the number of digits youd like to move the letters by.");
			String input = in.nextLine();

			try {
				number = Integer.parseInt(input);
				valid = true;
			} catch (NumberFormatException e) {

			}
		}
		valid = false;

		while (!valid) {
			System.out.println("Please type the message you'd like to encypher.");
			message = in.nextLine();

			for (char c : message.toCharArray()) {
				String token = String.valueOf(c); // token is current letter of the message
				int i = 0; // position in alphabet

				for (; i < alphabet.length(); i++) { // as long as were within the alphabet we increase i
					String letter = String.valueOf(alphabet.charAt(i)); // letter (of alphabet) at position i

					if (token.equals(letter)) { // if letter of alphabet = letter of word
						valid = true;
						break; // stop increasing i
					}

				}
				if (i >= alphabet.length()) { // when i is outside of alphabet
					valid = false;
					break;

				} else {
					i += number; // shift letters by input
					i = i % alphabet.length(); // overflow protection
					code += alphabet.charAt(i); // assembly :) 
				}
			}
		}

		System.out.println(code);

		in.close();
	}

}

/*
 * Erstellen Sie ein Programm Caesar.java. Das Caesar-Chiffre Verfahren dient
 * zur Verschlüsselung. Jeder Buchstabe eines Wortes wird um eine definierte
 * Anzahl von Zeichen verschoben. Ist diese Verschiebung 1 wird aus „haus“ z.B.
 * „ibvt“. Lesen Sie vom Benutzer einen String und einen int ein. Achten Sie auf
 * eine robuste Eingabe. Ihr Programm gibt dann das verschlüsselte Wort zurück.
 */