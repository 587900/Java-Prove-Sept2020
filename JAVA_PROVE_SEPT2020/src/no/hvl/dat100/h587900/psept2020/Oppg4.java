package no.hvl.dat100.h587900.psept2020;

public class Oppg4 {

	//a og b
	public static void main(String[] args) {
		double a = 5;
		double b = 6.7;
		double c = 20459;
		
		System.out.println(String.format("Metode 1: %f",  min(a, b, c)));
		System.out.println(String.format("Metode 2: %f", min3(a, b, c)));
	}
	
	//Skikkeleg fancy
	public static double min(double ...nums) {
		double m = Double.MAX_VALUE;
		for (double d : nums) { if (d < m) m = d; }
		return m;
	}
	
	public static double min3(double t1, double t2, double t3) {
		if (t2 < t1) t1 = t2;
		if (t3 < t1) t1 = t3;
		return t1;
	}
	
}
