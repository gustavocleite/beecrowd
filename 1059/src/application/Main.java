package application;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);

		for ( int x = 2 ; x <= 100 ; x++) {
			if ( x % 2 == 0 ) {
				System.out.println(x);
			}
		}
		
		
		ler.close();
	}

}