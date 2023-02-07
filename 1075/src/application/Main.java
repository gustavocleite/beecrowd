package application;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);


		int contador = 1;
		int x = ler.nextInt();
		
		while ( contador <= 10000 ) {
			if ( contador % x == 2 ) {
				System.out.println(contador);
			}
			contador++;
		}
		
		ler.close();
	}

}