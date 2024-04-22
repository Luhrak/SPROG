package lab3;
import java.util.Scanner;

public class Aufgabe4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int a, b;

		while (true) {

			while (true) {
				System.out.println("Please give a natual number for the first side of the triangle.");

				if (in.hasNextInt()) {
					a = in.nextInt();
					break;
				} else {
					System.err.println("not a valid number.");
				}
				in.nextLine();
			}

			while (true) {
				System.out.println("Great! Now give a second natual number.");

				if (in.hasNextInt()) {
					b = in.nextInt();
					break;
				} else {
					System.err.println("not a valid number.");
				}
				in.nextLine();
			}

			if ((a * b) % 2 != 0) {
				System.err.println("The area is not a valid natural number.");
			} else {
				break;
			}

		}
		System.out.println("The area of the trinalge is: " + (a * b) / 2);

		in.close();

	}
}

/*
 * 4 - Dreieck Schreiben Sie ein Programm, welches beim Start zur Eingabe der
 * beiden Kantenlängen eines rechtwinkligen Dreiecks auffordert, diese daraufhin
 * einliest, die Fläche des Dreiecks berechnet und anschließend das Ergebnis
 * ausgibt. Verwenden Sie nur den Datentyp int. Sorgen Sie für eine robuste
 * Eingabe. Bei Eingabe einer Nicht-Ganzzahl wird der Benutzer aufgefordert die
 * Eingabe zu widerholen. Programmierhinweise: Ob ein Wert durch 2 teilbar ist,
 * können Sie mit folgendem Ausdruck prüfen: zahl % 2 == 0 Mit myScanner.next()
 * kann die aktuelle Eingabe des Scanners als String abgerufen werden
 */