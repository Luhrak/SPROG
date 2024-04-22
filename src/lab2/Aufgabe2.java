package lab2;
import java.util.Scanner;

public class Aufgabe2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	
		int input; 
		double a, b, c; 
		System.out.println("Welcome to the calc2000! \nPress 1 to calculate a rectangle. \nPress 2 to calculate a cuboid.");
		input = in.nextInt();
		
		if (input == 1) {
			
			System.out.println("Give Value for a.");
			a = in.nextInt();
			
			System.out.println("ive Value for b.");
			b = in.nextInt();
			
			double A = a * b;
			double U = (2 * a) + (2 * b);
			boolean square = a == b; 
			
			System.out.println("Area: " + A +
							"\nCircumference: " + U +
							"\nDoes it square? " + square);
			
		} else if (input == 2) {
			
			System.out.println("Give Value for a.");
			a = in.nextInt();
			
			System.out.println("ive Value for b.");
			b = in.nextInt();
			
			System.out.println("ive Value for c.");
			c = in.nextInt();
			
			double V = a * b * c;
			double U = (2*a) + (2*b);
			boolean cube = a == b && b == c;
			
			System.out.println("Volume: " + V +
					"\nCircumference: " + U +
					"\nDoes it cube? " + cube);
		}
		
		in.close();
	}
}
