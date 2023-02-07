package application;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);		
		
		int contador = 0;
		double total = 0;
		double qnt = 0;
		while ( contador >= 0) {
		
			contador = ler.nextInt();
			if ( contador >= 0) {
				qnt = qnt + 1;
				total = total + contador;
			}

		}
		double media = total / qnt;
		System.out.printf("%.2f",media);
		ler.close();
	}
}
