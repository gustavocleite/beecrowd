package application;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);

		int x = ler.nextInt();
		int y = ler.nextInt();
		
		if ( x > y ) {
			int aux = y;
			y = x;
			x = aux;
		}
		for ( int i = x; i < y ; i++) {
			if (i == x) {
				
			} else if ( i % 5 == 2 || i % 5 == 3) {
			 
				System.out.println(i);
			}
		}
		
		ler.close();
	}
}