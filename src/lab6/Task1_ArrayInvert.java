package lab6;
import java.util.Scanner;

public class Task1_ArrayInvert {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			
			System.out.println("Welcome to the number inverter. \n"
					+ "How many numbers do you want to put in?");
			
			int amount = readInt(in);
			
			System.out.println("Please put in your " + amount + " numbers.");

			int[] numbers = new int[amount];
			
			for (int i = 0; i < amount; i++) {
				
				numbers[i] = readInt(in); 
				
			}
			
			printArray(numbers); 
			
			int[] reverseNumbers = invertArrayElements(numbers);
			
			printArray(reverseNumbers);

		}
	}

	
	public static int readInt(Scanner in) {
		while (!in.hasNextInt()) {
			System.err.println("Has to be a natural number.");
			//in.next();
		}
		int input = in.nextInt();
		
		return input;
	}

	public static void printArray(int[] numbers) { 
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println("");
	}
	
	public static int[] invertArrayElements(int[] numbers) {
		int oppositeValue = numbers.length -1;
		int[] reverseNumbers = new int[numbers.length]; 
		
		for (int i = 0; i < numbers.length; i++) {
			reverseNumbers[i] = numbers[oppositeValue];
			oppositeValue--; 
		}
		
		return reverseNumbers;
	}
	
	/*
	public static int[] expandArr(int[] numbers, int i) {
		
		int[] expanded = Arrays.copyOf(numbers, numbers.length + 1);
		
		expanded[numbers.length] = i;
		
		return expanded;
	}
	*/ 
	
}

/*
 * ArrayInvert
 * 
 * Erstellen Sie ein Programm dass zur Eingabe mehrerer ganzer Zahlen
 * auffordert. Lesen Sie diese Zahlen ein und speichern Sie diese in einem
 * Array. Erstellen Sie nun ein zweites Array gleicher Länge in dem die Werte
 * invertiert gespeichert werden. Lassen Sie sich beide Arrays ausgeben.
 * Schreiben und nutzen Sie eine Methode printArray um ein Array auszugeben.
 * Schreiben und nutzen Sie eine Methode invertArrayElements um die Elemente
 * eines übergebenen Arrays zu invertieren. Schreiben und nutzen Sie eine
 * Methode static int readInt(Scanner in) um eine ganze Zahl einzulesen. Achten
 * Sie auf eine robuste Eingabe. (Nur ganze Zahlen; Für die Anzahl der Elemente
 * nur ganze Zahlen größer 0) Beispiel: Wieviele Elemente wollen sie eingeben? 5
 * Bitte geben Sie 5 Elemente an: 3 6 12 -4 5 Array 1: 3 6 12 -4 5 Array 2: -3
 * -6 -12 4 -5
 */