package application;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		int soma = 0;
		while(true) {
			
			int num = ler.nextInt();
			if ( num == 0 ) {
				break;
			}	
			
			for ( int i = num, cont = 1 ; cont <= 5; i++  ) {
				if ( i % 2 == 0) {
					cont++;
					soma = soma + i;
				}
			}
			

			System.out.println(soma);
			soma = 0;
		}
		ler.close();
	}
}