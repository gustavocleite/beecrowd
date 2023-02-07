package application;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		

		double s = 0;
		double x = 1;
		
		
		for ( int i = 1; i <= 100 ; i++) {
			s += x/i;
		}
		System.out.printf("%.2f",s);
		ler.close();
	}
}
