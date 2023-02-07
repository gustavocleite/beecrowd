package application;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		int num1 = ler.nextInt();
		int contador = 0;
		
		while ( contador < 12 ) {
			if ( num1 % 2 ==1 ) {
				System.out.println(num1);
			}
			num1++;
			contador++;
		}
	
	ler.close();
	}

}