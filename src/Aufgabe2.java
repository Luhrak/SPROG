import java.util.Scanner;

public class Aufgabe2 {

	public static void main(String[] args) {
		int a, b, c;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Willkommen zum Kisten-berrechner "
						+ "\nBitte die Länge eingeben.");
		a = in.nextInt();
		
		System.out.println("Bitte die Breite eingeben.");
		b = in.nextInt();
		
		System.out.println("Bitte die Höhe eingeben.");
		c = in.nextInt();

		int V = a*b*c;
		int O = (2*a*b) + (2*b*c) + (2*c*a); 
		int K = (4*a)+(4*b)+(4*c);

		System.out.println("Das Volumen beträgt: " + V + 
							"\nDie Oberfläche beträgt: " + O +
							"\nDie Kantenlänge beträgt: " + K);

		in.close();
	}

}
