package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		double a = ler.nextDouble();
		double b = ler.nextDouble();
		double c = ler.nextDouble();
		
		if ( a + b > c && b + c > a && a + c > b) {
			double peri = a + b + c;
			System.out.printf("Perimetro = %.1f\n", peri);
		}else {
			double area = (0.5)* c* (a + b);
			System.out.printf("Area = %.1f\n", area);
		}
		
		
		ler.close();
	}

}