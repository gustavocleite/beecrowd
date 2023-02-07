package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		double valor = ler.nextDouble();
		double novoSalario = 0;
		double valorReajuste = 0;
		int porcent = 0;
		

		if ( valor > 0 && valor <= 400.00) {
			valorReajuste = valor * 0.15;
			novoSalario = valor + valorReajuste;
			porcent = 15;
		}else if ( valor > 400.00 && valor <= 800.0) {
			valorReajuste = valor * 0.12;
			novoSalario = valor + valorReajuste;
			porcent = 12;
		}else if ( valor >= 800.01 && valor <= 1200.00) {
			valorReajuste = valor * 0.10;
			novoSalario = valor + valorReajuste;
			porcent = 10;
		}else if ( valor >= 1200.01 && valor <= 2000.00) {
			valorReajuste = valor * 0.07;
			novoSalario = valor +  valorReajuste;
			porcent = 7;
		}else if (valor > 2000.00) {
			valorReajuste = valor * 0.04;
			novoSalario = valor + valorReajuste;
			porcent = 4;
		}
		System.out.printf("Novo salario: %.2f\n",novoSalario);
		System.out.printf("Reajuste ganho: %.2f\n",valorReajuste);
		System.out.println("Em percentual: " + porcent + " %");
		ler.close();
	}
}

	