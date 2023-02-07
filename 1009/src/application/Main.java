package application;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		String nome = ler.next();
		double salario = ler.nextDouble();
		double vendas = ler.nextDouble();
		
		double total;
		
		total = salario + ( vendas * 0.15);
		
		System.out.printf("TOTAL = R$ %.2f%n",total);
		ler.close();
	}

}