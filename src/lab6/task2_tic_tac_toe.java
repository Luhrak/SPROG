package lab6;
import java.util.Scanner;

public class task2_tic_tac_toe {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Tic Tac Toe!");
		
		int size = 3; // could be a user input instead also above 0
		
		char[][] gameState = new char[size][size];
		for (int i = 0; i < (size*size); i++) {
			gameState[i/size][i%size] = (' '); 
		}
		
		try (Scanner in = new Scanner(System.in)) {
		
		int round = 1;
		char player = 'X';
		
			while (round <=(size*size)) {
				
				System.out.println(player + "s turn.  (Type the number where you want to place at.)");
				printState(gameState, size);
				
				int thisTurn; //declare 
				
				while (true) {
					thisTurn = readInt(in, size); //define 
					if (gameState[(thisTurn-1)/size][(thisTurn-1)%size] == ' ') {
						break;
					} else {
						System.err.println("This placement is already taken.");
					}
				}
				
				
				gameState = updateGameState(gameState, thisTurn, player, size); 
				
				if (player == 'X') {  
					player = 'O';
				} else {
					player = 'X';
				}
				round++;
			}
			printState(gameState, size);
			System.out.println("Game Over!");
		}
	}

	// "markieren"
	private static char[][] updateGameState(char[][] gameState, int thisTurn, char player, int size) {
		thisTurn--;
		gameState[thisTurn/size][(thisTurn%size)] = player;
		return gameState;
	}

	private static void printState(char[][] gameState, int size) {
		System.out.print("\033[4m");
		for (int i = 0; i < (size*size); i++) {
			if (i%size == 0) {
				System.out.println("");
			} else {
				System.out.print("|");
			}
			char token = gameState[i/size][i%size]; // letter at postion that we check 
			if (token == ' ') {
				System.out.print(" " + (i+1) + " ");
			} else {
				System.out.print(" " + token + " ");
			}
		}
		System.out.println("\n\033[0m");
	}

	public static int readInt(Scanner in, int size) {
		int input = 0;
		while (true) {
			while (!in.hasNextInt()) {
				System.err.println("Has to be a number.");
				in.next();
			}
			input = in.nextInt();
			
			if (1<=input && input<=(size*size)) {
				break;
			} else {
				System.err.println("Has to be a number between 1-" + (size*size) + ".");
			}
			
		}
		
		return input;
	}
	
}


/* 
2 – Tic Tac Toe
Schreiben Sie ein Programm TicTacToe Bei Tic Tac Toe gibt es ein Spielfeld mit 3 x 3 Feldern. Ein
Spieler markiert mit dem Kreuz, einer mit dem Kreis.
Das Programm soll folgende Vorgaben erfüllen:
• Das Programm gibt das Spielfeld auf der Konsole (bzw. im Fenster) in folgender Form aus:
1 & 2 & 3
4 & 5 & 6
7 & 8 & 9
• ..und bittet die Spieler nacheinander die Position anzugeben, die markiert werden soll
• Spieler X beginnt, dann folgt Spieler O
• eine Methode markieren versucht, die Position zu markieren
• Nach einem gültigem Spielzug wird das aktuelle Spielfeld dargestellt z.B.:
1 & X & 3
4 & 5 & 6
7 & 8 & O
• Es gibt keine Spielauswertung, das Spiel ist zuende, wenn alle Felder ausgefüllt sind
• Die Größe des Spielfelds soll erweiterbar bleiben (z.B. 4 Gewinnt).



Beispiel
Spieler 1, bitte geben Sie Ihren Zug ein:
y
Feld schon belegt oder existiert nicht. Nochmal.
Spieler 1, bitte geben Sie Ihren Zug ein:
2
1 & X & 3
4 & 5 & 6
7 & 8 & 9
Spieler 2, bitte geben Sie Ihren Zug ein:
5
1 & X & 3
4 & O & 6
7 & 8 & 9
Spieler 1, bitte geben Sie Ihren Zug ein:
*/ 