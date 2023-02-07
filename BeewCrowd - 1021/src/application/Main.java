package application;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);

		double valor = ler.nextDouble();
		double moedas = 0;
		if ( valor < 1000000 && valor > 0  ) {
			
			System.out.println("NOTAS:");
			System.out.printf((int)valor / 100+" nota(s) de R$ 100.00%n");
		
			valor = (valor % 100 );
			System.out.printf((int)valor/50 +" nota(s) de R$ 50.00%n");
		
			valor = (valor % 50 );
			System.out.printf((int)valor/20 +" nota(s) de R$ 20.00%n");
		
			valor = (valor % 20);
			System.out.printf((int)valor /10+" nota(s) de R$ 10.00%n");

			valor = (valor % 10);
			System.out.printf((int)valor/5 +" nota(s) de R$ 5.00%n");
			
			valor = (valor % 5);
			System.out.printf((int)valor/2 +" nota(s) de R$ 2.00%n");
			
			//MOEDAS 
			
			valor = (valor % 2);
			moedas = valor * 100;
			System.out.println("MOEDAS:");
			System.out.printf((int)moedas/100 +" moeda(s) de R$ 1.00%n");
						
			moedas = (moedas % 100);
			System.out.printf((int)moedas/50 + " moeda(s) de R$ 0.50%n");
			
			
			moedas =  (moedas % 50 ); 
			System.out.printf((int)moedas / 25 + " moeda(s) de R$ 0.25%n");
			
			
			moedas = (moedas % 25) ;
			System.out.printf((int)moedas / 10 + " moeda(s) de R$ 0.10%n");
			
			moedas = (moedas % 10);
			System.out.printf((int)moedas  / 5 + " moeda(s) de R$ 0.05%n");
			
			moedas = (moedas % 5);
			System.out.printf((int)moedas  / 1 + " moeda(s) de R$ 0.01%n");
			
			
		}
		ler.close();
	}

}