package application;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		double x = ler.nextDouble();
		double y = ler.nextDouble();
		
		if ( x > 0 && y > 0 ) {
			System.out.println("Q1");
		}
		if ( x > 0 && y < 0 ) {
			System.out.println("Q4");
		}
		if ( x < 0 && y < 0 ) {
			System.out.println("Q3");
		}
		if ( x < 0 && y > 0 ) {
			System.out.println("Q2");
		}
		if ( x == 0 && y == 0) {
			System.out.println("Origem");
		}
		ler.close();
	}

}