package application;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		int valor_digitado = ler.nextInt();
		double qnt_anos = 0 ;
		double qnt_meses = 0;
		double qnt_dias = 0;
				
			qnt_anos = valor_digitado / 365;
			// SOBROU 70 dias
			int sobrou_dias = valor_digitado - ((int)qnt_anos * 365);
			// TODO MES TEM 30 dias
			qnt_meses = sobrou_dias / 30;
			// qnt_dias = valor_digitado / 365 % 12  % 30;
			qnt_dias = sobrou_dias - ( (int)qnt_meses * 30 );;
			
					
		System.out.printf("%d ano(s)%n", (int)qnt_anos);
		System.out.printf("%d mes(es)%n", (int)qnt_meses);
		System.out.printf("%d dia(s)%n", (int)qnt_dias);

		ler.close();
	}

}