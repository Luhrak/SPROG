import java.util.Scanner;

public class Aufgabe1_HelloRegNumber {

	public static void main(String[] args) {
		int MaNu;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Bitte geben Sie Ihre Martikelnummer ein.");
		MaNu = in.nextInt();
		
		System.out.println("Hallo, " + MaNu);

	}

}
