package no.hvl.dat100.h587900.psept2020;

import static javax.swing.JOptionPane.*;

public class Oppg3 {

	//Oppgåva sa ingenting om det, men eg antek at "0" ikkje skal telle på antal tal. D.v.s. 3,5,0 = 2 tal
	public static void main(String[] args) {
		
		int antal = 0;
		int sum = 0;
		
		int acc;
		//while ((acc = inputDialog...) != 0) { ... }	<- dette er det som skjer under
		while ((acc = Integer.parseInt(showInputDialog("Skriv inn eit heiltal.\nSkriv 0 for å avslutte"))) != 0) {
			antal++;
			sum += acc;
		}
		
		showMessageDialog(null, String.format("Antall tall: %d\nSum: %d", antal, sum));
		
	}
	
}
