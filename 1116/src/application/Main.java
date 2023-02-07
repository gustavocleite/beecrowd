package application;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);

		int qnt_caso = ler.nextInt();
		
		for ( int x = 0 ; x < qnt_caso ; x++) {
			int caso1 = ler.nextInt();
			int caso2 = ler.nextInt();

			if ( caso2 == 0 ) {
				System.out.printf("divisao impossivel\n");
			}else {
				double fim = (double)caso1/caso2;
				System.out.printf("%.1f\n",fim);
			}
		}
		ler.close();
	}

}