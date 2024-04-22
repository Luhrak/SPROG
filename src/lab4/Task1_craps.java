package lab4;
import java.util.Scanner;

public class Task1_craps {

	public static void main(String[] args) {
		Scanner ins = new Scanner(System.in);
		System.out.println("Welcome to the dice game craps.");

		String input = "";
		int w1, w2, roll1, roll2;
		int points = 0;
		boolean gameend = false;
		boolean repeat = true;

		while (repeat) {

			System.out.println(
					"If you roll a total of 7 or 11 you win. " + "\nIf you roll a total of 2, 3 or 12 you lose. "
							+ "\nOn the other numbers you may roll again. " + "\nTo roll your 2d6 press [enter].");
			input = ins.nextLine();
			w1 = (int) (Math.random() * 6 + 1);
			w2 = (int) (Math.random() * 6 + 1);
			roll1 = w1 + w2;
			System.out.println("Your rolls: " + w1 + " " + w2 + " - Total: " + roll1);

			if (roll1 == 7 || roll1 == 11) {
				System.out.println("Congratulations you won!");
				gameend = true;
				points = points + 1;
			} else if (roll1 == 2 || roll1 == 3 || roll1 == 12) {
				System.out.println("Aw sadly lost.");
				gameend = true;
			} else {
				System.out.println("Now you need to roll a total of " + roll1 + " again to win."
						+ "\nRolling a total of 7 means you lose." + "\nRoll again with [enter].");
			}

			while (!gameend) {
				input = ins.nextLine();

				w1 = (int) (Math.random() * 6 + 1);
				w2 = (int) (Math.random() * 6 + 1);
				roll2 = w1 + w2;
				System.out.println("Your rolls: " + w1 + " " + w2 + " - Total: " + roll2);

				if (roll1 == roll2) {
					System.out.println("Congratulations you won!");
					points = points + 1;
					gameend = true;
				} else if (roll2 == 7) {
					System.out.println("Aw sadly you rolled a total a " + roll2 + " which means you lost.");
					gameend = true;
				}
			}

			while (gameend) {
				System.out.println("Your points: " + points + " \nWould you like to play again? (y/n)");
				input = ins.nextLine();

				if (input.equals("y")) {
					repeat = true;
					gameend = false;
				} else if (input.equals("n")) {
					repeat = false;
					gameend = false;
				}

			}

		}
		
		ins.close();
	}

}

/*
 * 1 - Craps Würfelspiel mit zwei Würfeln. Nutzen Sie die Methode Math.random,
 * die einen zufälligen Wert vom Typ double zwischen 0.0 (inklusive) und 1.0
 * (exklusive) liefert. Ihr Spiel soll zuerst zwei Würfel werfen.
 * 
 * Beträgt die Summe der Würfe sieben oder elf, hat der Spieler sofort gewonnen.
 * Beträgt die Summe der Würfe zwei, drei oder zwölf, hat der Spieler sofort
 * verloren. In allen anderen Fällen kann der Spieler noch einmal würfeln.
 * 
 * Ab dem zweiten Wurf gelten die folgenden Regeln. Liefert ein Wurf eine
 * sieben, hat der Spieler verloren, liefert ein Wurf genau die Augenzahl des
 * ersten Wurfes, hat der Spieler gewonnen. Liefert ein Wurf eine andere Zahl,
 * darf der Spieler noch einmal würfeln. Es wird so lange geworfen, bis der
 * Spieler gewonnen oder verloren hat. Nach jeder Runde soll der Spieler befragt
 * werden, ob er eine weitere Runde spielen möchte. Dabei sollen Falscheingaben
 * abgefangen werden.
 * 
 * Außerdem soll vor jeder Runde der Punktestand ausgegeben werden.
 */