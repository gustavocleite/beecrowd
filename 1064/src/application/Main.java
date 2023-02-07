package application;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);

		int cont = 0;
		double media = 0;
		
		
		for ( int i = 0 ; i < 6 ; i++) {
			double val = ler.nextDouble();
			if (val  > 0 ) {
				cont++;
				media = media + val;
			}
		}
		System.out.println(cont + " valores positivos");
		System.out.printf("%.1f%n",media/cont);
		ler.close();
	}

}