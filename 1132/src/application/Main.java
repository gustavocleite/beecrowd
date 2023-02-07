package application;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);

		int x = ler.nextInt();
		int y = ler.nextInt();
		int soma = 0;
		
		if ( x > y ) {
			int aux = y;
			y = x;
			x = aux;
		}
		for ( int i = x; i <= y ; i++) {
			if ( i % 13 == 0) {
				
			} else {
				soma = soma + i;
			}
		}
		System.out.println(soma);
		ler.close();
	}
}