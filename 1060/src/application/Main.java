package application;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);

		int cont = 0;
		
		for ( int i = 0 ; i < 6 ; i++) {
			double val = ler.nextDouble();
			if (val > 0 ) {
				cont++;
			}
		}
		System.out.println(cont+ " valores positivos");
		
		ler.close();
	}

}