package lab5;
import java.util.Scanner;

public class Task1_Fakultät {
	public static void main(String[] args) {

		int n = getIntF("Please put in the number x! that you would like the faculty of.");

		int faculty = calcFaculty(n);

		System.out.println(n + "  " + faculty);

	}

	private static int getIntF(String info) {
		Scanner in = new Scanner(System.in);
		System.out.println(info);

		String directIn = "";
		char mark;
		boolean valid = false;
		int input = 0;
		
		
		while (!valid) {
			
			while (!valid) {
				directIn = in.nextLine();
				
				//inMark = directIn.indexOf('!');
				
				int inLength = directIn.length() -1;
				mark = directIn.charAt(inLength);
				
				if (mark != '!') {
					valid = false;
					System.err.println("Requires an ! after the number.");
				} else  {
					valid = true;
				}
			}
			directIn = directIn.replace("!", "");

			try {
				input = Integer.parseUnsignedInt(directIn);
				valid = true;
			} catch (NumberFormatException e) {
				input = 0;
				valid = false;
				System.err.println("Number has to be a natural number.");
			}

		}
		in.close();
		return input;
	}

	private static int calcFaculty(int x) {
		
		int result = 1;
		for (int i = 1; i <= x; i++) {
			result = result * i;
		}

		return result;
	}

}


/*
 * Erstellen Sie ein Programm zur Berechnung der Fakultät einer eingegebenen
 * Zahl. Verwenden Sie den Datentyp int. Die Fakultät von n ist das Produkt der
 * natürlichen Zahlen von 1 bis n Die Fakultät von n wird geschrieben als n! und
 * ist nur für natürliche Zahlen (ganze Zahlen >= 0) definiert. Nutzen Sie eine
 * robuste Eingabe. Die Berechnung der Fakultät soll in einer Methode erfolgen.
 * 0! ist definiert als 1 
 * 3! ist z.B. 1 * 2 * 3 = 6
 */