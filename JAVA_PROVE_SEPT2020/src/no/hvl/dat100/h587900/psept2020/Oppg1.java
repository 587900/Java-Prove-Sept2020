package no.hvl.dat100.h587900.psept2020;

public class Oppg1 {

	public static void main(String[] args) {
		
		int a = 3;
		System.out.print("Oppgåve a): "); checkVariableA(a);	//a)
		System.out.print("Oppgåve b): "); checkVariableB(a);	//b)
		
		String s = checkVariableC(a);	//c)
		System.out.print("Oppgåve c): "); System.out.println(s);
		
	}
	
	public static void checkVariableA(int num) {
		if (num == 0) {
			System.out.println(String.format("Tallet %d er lik 0", num));
		} else if (num < 0) {
			System.out.println(String.format("Tallet %d er mindre enn 0", num));
		} else {
			System.out.println(String.format("Tallet %d er større enn 0", num));
		}
	}
	
	public static void checkVariableB(int num) { checkVariableB(num, 5, 8); }
	public static void checkVariableB(int num, int low, int high) {
		if (num < low || num > high) 
			System.out.println(String.format("Tallet %d er utenfor intervallet %d - %d", num, low, high));
		else
			System.out.println(String.format("Tallet %d er innenfor intervallet %d - %d", num, low, high));
	}
	
	public static String checkVariableC(int num) {
		String s;
		switch(num) {
			case 0:
				s = "null"; break;
			case 1:
				s = "en"; break;
			case 2: 
				s = "to"; break;
			case 3:
				s = "tre"; break;
			case 4:
				s = "fire"; break;
			default:
				s = "ulovlig verdi"; break;
		}
		return s;
	}
	
}
