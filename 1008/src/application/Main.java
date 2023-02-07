package application;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		int number = ler.nextInt();
		int salario = ler.nextInt(); 
		double qntHr = ler.nextDouble();
		
		double salarioFinal;
		salarioFinal = salario * qntHr;
	
		System.out.println("NUMBER = "+number);
		System.out.printf("SALARY = U$ %.2f%n",salarioFinal);
		ler.close();
	}

}