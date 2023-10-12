import java.util.Scanner;

public class Aufgabe4 {

	public static void main(String[] args) {
		int a, b, c, d;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Wert für Variable a eingeben.");
		a = in.nextInt();
		
		System.out.println("Wert für Variable b eingeben.");
		b = in.nextInt();
		
		System.out.println("Wert für Variable c eingeben.");
		c = in.nextInt();
		
		System.out.println("Wert für Variable d eingeben.");
		d = in.nextInt();

		int ab = a*b;
		int cd = c*d;
		int Ergebnis = ab + cd;

		System.out.println("Erstes Zwischenergebnis: " + ab + 
							"\nZweites Zwischenergebnis: " + cd +
							"\nDas Gesammtergebnis beträgt: " + Ergebnis);

		in.close();
	}

}
// a*b+c*d