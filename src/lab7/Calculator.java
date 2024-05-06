package lab7;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		int current = 0;
		char[] operators = { '+', '-', '*', '/', '!', 'c', 'e' };
		boolean end = false;

		showHelp();
		System.out.println(current);

		while (!end) {

			String input = getUserString();
			if (input == "") {
				continue;
			}

			char currentOp = getInputOperator(input, operators);
			int currentNum = getInputInt(input, currentOp);

			switch (currentOp) {
			case '+':
				current += currentNum;
				break;
			case '-':
				current -= currentNum;
				break;
			case '*':
				current *= currentNum;
				break;
			case '/':
				current /= currentNum;
				break;
			case '!':
				current = fakultaet(current);
				break;
			case 'c':
				current = 0;
				break;
			case 'e':
				end = true;
				break;
			case ' ':
				current = currentNum;
				break;
			}
			
			if (currentOp != 'e') {
				System.out.println(current);				
			}

		}
	}

	private static int fakultaet(int currentNum) {

		int n = 1;

		for (int i = 1; i <= currentNum; i++) {
			n *= i;
		}

		return n;
	}

	private static int getInputInt(String input, char currentOp) {

		if (currentOp != ' ') {
			input = input.substring(1);
		}

		int n;
		try {
			n = Integer.parseInt(input);
		} catch (Exception e) {
			n = 0;
		}

		return n;
	}

	private static char getInputOperator(String input, char[] operators) {

		char operator = ' ';

		for (int i = 0; i < operators.length; i++) {
			if (input.charAt(0) == operators[i]) {
				operator = input.charAt(0);
				break;
			} else {
				operator = ' ';
			}
		}

		return operator;
	}

	private static String getUserString() {
		String input = "";

		Scanner in = new Scanner(System.in);

		input = in.nextLine();
		
		return input;
	}

	private static void showHelp() {
		System.out.println(
				"Welcome to the calcuator3000 "
				+ "\nInput an integer to replace the current number with it. "
				+ "\nPrefix with an operator to calculate. (Valid operators: +, - , *, /, !) "
				+ "\n! does not require a following integer."
				+ "\nType c to clear current inputs."
				+ "\nType e to end the calculator :C");
	}

}

/*
 * X Erstellen Sie eine Programm Calculator. Das Programm soll die folgenden
 * Vorgaben erfüllen:
 * 
 * X Geben Sie zu Beginn des Programms eine Eingabehilfe mittels einer Methode
 * showHelp() aus.
 * 
 * Nach dieser Eingabehilfe soll zu Beginn der nächsten Zeile eine 0 als
 * Startwert ausgegeben werden.
 * 
 * Anschließend sollen paarweise Operator und Operand mit abschließendem <enter>
 * eingelesen werden, das Ergebnis berechnet und am Beginn der nächsten Zeile
 * ausgegeben werden. (s.u.)
 * 
 * Bei Eingabe von c (für clear) soll das Ergebnis auf 0 zurückgesetzt und
 * ausgegeben werden.
 * 
 * Eingabe und Berechnung sollen solange wiederholt werden, bis als Operator ein
 * e eingegeben wird; Anschließend soll das Programm ohne weitere Aktivitäten
 * (also auch ohne weitere Eingabe) terminieren. 
 * 
 * Achtung: die unären Operatoren
 * c und e haben keinen rechtsseitigen Operanden, also keine weitere Eingabe.
 * 
 * Gültige binäre Operatoren sind +, - , *, / und ! (Fakultätberechnung). 
 * 
 * Bei der Fakultätsberechnung ist folgendes zu beachten: Nach dem ! -Operator darf
 * kein weiterer Operand eingelesen werden Zur Berechnung der Fakultät soll eine
 * Methode fakultaet() definiert und verwendet werden. 
 * 
 * Der Methoden- und Parameter-Typ sollen int sein Da die Fakultät nur für natürliche Zahlen
 * definiert ist, soll vor dem Aufruf dieser Methode eine entsprechende Prüfung
 * stattfinden. Im Fehlerfall soll die selbstdefinierte
 * NotNaturalNumberException ausgelöst werden (Fehlermeldung und anschließend
 * erneut alten Wert ausgeben) Prüfen Sie in der Methode fakultaet(), ob ein
 * int-Overflow stattfindet und lösen Sie in diesem Fall die selbstdefinierte
 * ResultErrorException mit entsprechender Fehlermeldung aus, die auch über den
 * nicht mehr rechenbaren Multiplikatorwert informiert. Lösen Sie bei einer
 * Division durch Null die selbstdefinierte DivideByZeroException aus und fahren
 * Sie nach Ausgabe einer entsprechenden Fehlermeldung mit dem letzten gültigen
 * Wert fort Bei Eingabe ungültiger Operatoren soll eine selbstdefinierte
 * InvalidOperatorException mit entsprechender Fehlermeldung ausgelöst und das
 * Programm mit dem letzten korrekten Wert fortgesetzt werden. Die Fehlermeldung
 * soll im Exception-Handler ausgegeben werden Beim Auftreten einer
 * InputMismatchException soll im Handler ein Hinweis zum korrekten
 * Eingabeformat ausgegeben und mit dem letzten korrekten Ergebnis fortgefahren
 * werden Für alle anderen Exceptions soll die Meldung 'unbekannter Fehler'
 * ausgegeben werden Die Überprüfung eines double-Wertes auf Ganzzahligkeit soll
 * grundsätzlich (wo immer nötig) mittels einer Methode ganzZahl() erfolgen. Sie
 * können hierfür zum Beispiel prüfen, ob die Division des fraglichen Wertes
 * durch seinen int-cast den Wert 1.0 ergibt (Sollte für ganze Zahlen der Fall
 * sein). Wegen der möglichen Ungenauigkeit der 16. Nachkommastelle in der
 * Mantisse soll jedoch nicht geprüft werden, ob das Ergebnis gleich 1.0 ist,
 * sondern ob es einen Wert von 1.0 + 10-15 nicht überschreitet. Geben Sie im
 * Hauptprogramm bei einem int-Overflow die entsprechende Fehlermeldung aus und
 * ermöglichen Sie wie schon zuvor ein Weiterrechnen mit dem letzten korrekten
 * Ergebnis Beispiel: Einfacher Taschenrechner bitte jeweils Operator plus Zahl
 * eingeben oder ! für Fakultät: (c=clear, e=ende) 0.0 +2 2.0 *5 10.0 /2.5 4.0
 * /0 Fehler -- Division durch Null 4.0 -7 -3.0 c 0.0 e
 */