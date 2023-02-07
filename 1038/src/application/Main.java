package application;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		for ( int i = 0 ; i < 1; i++) {
			int cod1 = ler.nextInt();
			int qnt = ler.nextInt();
			double total = 0;
			if ( cod1 == 1 ) {
				total = total + 4.0 * qnt;
			}
			if ( cod1 == 2 ) {
				total = total + 4.5 * qnt;
			}
			if ( cod1 == 3 ) {
				total = total + 5.0* qnt;
			}
			if ( cod1 == 4 ) {
				total = total + 2.0* qnt;
			}
			if ( cod1 == 5 ) {
				total = total + 1.5 * qnt;
			}

			
			System.out.printf("Total: R$ %.2f\n",total);
		}
		
	}

}