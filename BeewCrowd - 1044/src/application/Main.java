package application;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		

		
			int num1 = ler.nextInt();
			int num2 = ler.nextInt();
			int aux = 0;

			if ( num2 < num1) {
				aux = num1;
				num1 = num2;
				num2 = aux;
			}
			if ( num2 % num1 == 0) {
				System.out.printf("Sao Multiplos\n");
			} else {
				System.out.printf("Nao sao Multiplos\n");
			}

		ler.close();
	}
}