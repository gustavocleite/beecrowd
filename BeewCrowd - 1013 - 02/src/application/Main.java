package application;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		int x = ler.nextInt();
		int maior = 0;
		
		if (x > maior ) {
			maior = x;
		}
		x = ler.nextInt();
		if ( x > maior ) {
			maior = x;
		}
		x = ler.nextInt();
		if ( x > maior) {
			maior = x;
		}
		System.out.println(maior+ " eh maior");
		
		ler.close();
	}

}