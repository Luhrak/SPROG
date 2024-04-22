package lab4;
import java.util.Scanner;

public class Task2_equation {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String input;
		double p = 0, q = 0;
		boolean valid = false;
		boolean end = false;

		System.out.println("Hello user, to calculate the quadratic equation put in two rational numbers.");

		while (!end) {

			while (!valid) {
				System.out.println("Please type the a valid number for p.");
				input = in.nextLine();

				try {
					p = Double.parseDouble(input);
				} catch (NumberFormatException e) {
					p = 0;
				}

				if (p != 0) {
					valid = true;
				}

			}
			valid = false;

			while (!valid) {
				System.out.println("Please type the a valid number for q.");
				input = in.nextLine();

				try {
					q = Double.parseDouble(input);
				} catch (NumberFormatException e) {
					q = 0;
				}

				if (q != 0) {
					valid = true;
				}

			}
			valid = false;

			double x1 = -(p / 2) + Math.sqrt(Math.pow((p / 2), 2) - q);
			double x2 = -(p / 2) - Math.sqrt(Math.pow((p / 2), 2) - q);
			
			if (Double.isNaN(x1) || Double.isNaN(x2)) {
				System.err.println("The value within the squareroot is negative and therefore cant be calculated.");
			} else {
				System.out.println("X1 = " + x1 + "\nX2 = " + x2);
			}

			System.out.println("Want to do another caluclation? (y/n)");

			while (!valid) {
				input = in.nextLine();

				if (input.equals("y")) {
					valid = true;
				} else if (input.equals("n")) {
					end = true;
					valid = true;
				}
			}
			valid = false;
		}

		in.close();
	}

}

/*
 * Schreiben Sie ein Programm, welches beim Start zur Eingabe zweier
 * double-Werte auffordert und lesen Sie diese ein. Mit diesen Werten sollen Sie
 * quadratische Gleichungen lösen. Dazu können Sie die so genannte p-q-Formel
 * verwenden (Sie können gerne weitere Informationen recherchieren). Diese sieht
 * wie folgt aus: 𝑥1,2 = − 𝑝 2 ± √(𝑝 2) 2 − 𝑞 Eine Wurzel ziehen können Sie
 * mit einem Aufruf von Math.sqrt(x). Nach der Berechnung soll der Benutzer
 * entscheiden, ob das Programm beendet werden soll, oder eine weitere Rechnung
 * durchgeführt werden soll. Achten Sie auf eine robuste Eingabe.
 */