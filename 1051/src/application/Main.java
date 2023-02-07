package application;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		double salario, finalImp = 0, aux;
		
		salario = ler.nextDouble();
		
		if ( salario < 2000 ) {
			System.out.println("Isento");
		}else {
			if ( salario > 2000.01 && salario <= 3000.00) {
				aux = salario - 2000;
				finalImp = aux * 0.08;
			}else {
					if ( salario > 3000 && salario <= 4500 ) {
						aux = (salario - 3000) * 0.18;
						finalImp = aux + ( 1000 * 0.08);
					}else {
						if (  salario > 4500 ) {
							aux = (salario - 4500) * 0.28;
							finalImp = aux + ( 1000 * 0.08) + ( 1500 * 0.18);
						}
					}
				}
			System.out.printf("R$ %.2f%n",finalImp);
		}
		ler.close();
	}

}