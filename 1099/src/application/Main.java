package application;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);

		int qntCaso = ler.nextInt();
		
		for ( int i = 1; i <= qntCaso; i++) {
			int x = ler.nextInt();
			int y = ler.nextInt();
			if ( y < x ) {
				int aux = y;
				y = x;
				x = aux;
			}
			int total = 0;

			for ( int j = x  ; j < y; j++ ) {
				if ( j == x) {
				}else if( j % 2 == 1) {
					total += j;
				}
			}
			System.out.println(total);
		}
		ler.close();
	}

}