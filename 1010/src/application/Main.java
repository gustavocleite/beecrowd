package application;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		int cod1 = ler.nextInt();
		int num1 = ler.nextInt();
		double valor1 = ler.nextDouble();
		int cod2 = ler.nextInt();
		int num2 = ler.nextInt();
		double valor2 = ler.nextDouble();
		
		double total;
		
		total = ( num1 * valor1 ) + ( num2 * valor2);
		
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n",total);
		ler.close();
	}

}