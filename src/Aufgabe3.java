import java.util.Scanner;

public class Aufgabe3 {

	public static void main(String[] args) {
		int d;
		Scanner in = new Scanner(System.in);
		System.out.println("Bitte den Kugeldurchmesser eingeben.");
		d = in.nextInt();

		double r = d / 2.0;
		double V = (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
		
		// https://codegym.cc/de/groups/posts/mathpi-in-java-de 

		System.out.println("Der Radius beträgt: " + r + 
							"\nDas Volumen beträgt: " + V);

	}

}
