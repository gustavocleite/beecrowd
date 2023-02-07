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
		
		double media;
		
		media = (2.0*a + 3.0*b + 5.0*c) / 10;
		
		System.out.printf("MEDIA = %.1f%n", media );
				
		ler.close();
	}

}
