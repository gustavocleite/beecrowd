package application;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);


		int  val = ler.nextInt();
		
		for ( int i = 1; i <= val; i++) {
			int num = ler.nextInt();
			if ( num == 0) {
				System.out.println("NULL");
			}else if ( num > 0 && num % 2 == 0) {
				System.out.println("EVEN POSITIVE");
			}else if ( num < 0 && num % 2 == 0) {
				System.out.println("EVEN NEGATIVE");
			}else if ( num > 0 && num % 2 == 1) {
				System.out.println("ODD POSITIVE");
			}else if ( num < 0 && num % 2 == -1) {
				System.out.println("ODD NEGATIVE");
			}
		}
		ler.close();
	}
}