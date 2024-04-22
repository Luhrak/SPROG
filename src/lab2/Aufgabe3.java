package lab2;
import java.util.Scanner;

public class Aufgabe3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		for (int year = 0; year >= 0;) {
			year = in.nextInt();
			
			boolean four = year % 4 == 0; 
			boolean fourhundred = year % 400 == 0;
			boolean hundred = year % 100 == 0;
			
			boolean case1 = hundred && fourhundred; 
			boolean case2 = four && !hundred; 
			boolean leapYear = case1 || case2;
			
			
				String answer[] = {
						"the year is a leap year.",
						"the year is not a leap year.",
				};
				
				if (year > 0  && leapYear){
					System.out.println(answer[0]);
				} else {
					System.out.println(answer[1]);
				}

		}
		in.close();
	}

}

/* 

if 100 true 
and 400 false 
false 

if 100 true 
and 400 true 
true 

if 4 true 
 !and if 100 false 
 false 
 
if 4 true 
 !and if 100 true 
 true 


Durch 4 
 aber nicht durch 100 
 außer durch 400 


1. Ein Jahr ist ein Schaltjahr, wenn es restlos durch 4 teilbar ist.
2. Falls sich die Jahrzahl durch 100 restlos teilen lässt, ist es kein Schaltjahr.
3. Falls auch eine Teilung durch 400 ganzzahlig möglich ist, dann ist es ein Schaltjahr.

3 - Schaltjahr
Schreiben Sie ein Programm, in dem eine Jahreszahl eingegeben werden kann. Das Programm soll
dann ausgeben, ob es sich bei dem Jahr um ein Schaltjahr handelt.
*/ 