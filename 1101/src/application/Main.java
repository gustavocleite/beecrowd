package application;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		while (true) {
			int m = ler.nextInt();
			int n = ler.nextInt();
			if ( m <= 0 || n <= 0) {
				break;
			}else {
				if ( m < n ) {
					int aux = m;
					m = n;
					n = aux;
				}
				int soma = 0;
				for( int i = n ; i <= m ; i++) {
					System.out.print(i+" ");
					soma += i;
				}
				System.out.println("Sum="+ soma);
			}
		}
		ler.close();
	}
}