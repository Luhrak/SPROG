package lab2;
import java.util.Scanner;

public class Aufgabe1 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a, b, c;
		
		
		System.out.println("Bitte ein Wert für a eingeben.");
		a = in.nextInt();
		
		System.out.println("Bitte ein Wert für b eingeben.");
		b = in.nextInt();
		
		System.out.println("Bitte ein Wert für c eingeben.");
		c = in.nextInt();
		
		int big = a; 
		
		
		if (b > a) {
			big = b; 
		} 
		if (c > big) {
			big = c; 
		} 
		
		System.out.println(big);
		
		in.close();
	}

}
