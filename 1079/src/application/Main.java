package application;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);

		int qnt_caso = ler.nextInt();
		
		for ( int x = 0 ; x < qnt_caso ; x++) {
			double valor1_caso1 = ler.nextDouble();
			double valor2_caso1 = ler.nextDouble();
			double valor3_caso1 = ler.nextDouble();
			
			double media_caso1 = ((valor1_caso1 * 2) + (valor2_caso1 * 3) + (valor3_caso1 * 5)) / 10;
	
			System.out.printf("%.1f%n",media_caso1);

		}
		ler.close();
	}

}