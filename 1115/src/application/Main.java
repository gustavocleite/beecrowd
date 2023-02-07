package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		
		while(true) {
			int x = ler.nextInt();
			int y = ler.nextInt();
			
			if ( x == 0 || y == 0) {
				break;
			}
			
			if ( x > 0 && y > 0 ) {
				System.out.println("primeiro");
			}
			if ( x > 0 && y < 0 ) {
				System.out.println("quarto");
			}
			if ( x < 0 && y < 0 ) {
				System.out.println("terceiro");
			}
			if ( x < 0 && y > 0 ) {
				System.out.println("segundo");
			}
		}

		ler.close();
	}

}