package lab3;
import java.util.Scanner;

public class Aufgabe1 {

	public static void main(String[] args) {
	
	Scanner in = new Scanner(System.in);
	
	int output = 0; 
	String input = ""; 
	int inputNum;
	

	System.out.println("Hello please put in as many numbers as you like, then e to exit and calculate."); 
	
	do { 
		input = in.nextLine();
		
		try {
			   inputNum = Integer.parseInt(input);
		}
		catch (NumberFormatException e) {
			   inputNum = 0;
		}
		
		output = output + inputNum; 
		
		if (input.equals("e")) {
			System.out.println(output); 
			break;
		}
		
	} while (true);
	
	
	in.close();
	}
}

/* 
	1 - Polygon
	Schreiben Sie ein Programm, dass den Benutzer auffordert, Kantenlängen eines Polygons
	einzugeben. Das Programm liest dabei solange Werte des Benutzers ein, bis dieser die Eingabe durch
	einen Ungültigen Wert abschließt.
*/ 