package application;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);

		int cont_par = 0;
		int cont_impar = 0;
		int cont_posi = 0;
		int cont_neg = 0;
		
		for ( int i = 0 ; i < 5 ; i++) {
			int val = ler.nextInt();
			if (val %2 == 0 ) {
				cont_par++;
			} else {
				cont_impar++;
			}
			if ( val > 0 ) {
				cont_posi++;
			}
			if ( val < 0 ) {
				cont_neg++;
			}

		}
		
		System.out.println(cont_par + " valor(es) par(es)");
		System.out.println(cont_impar + " valor(es) impar(es)");
		System.out.println(cont_posi + " valor(es) positivo(s)");
		System.out.println(cont_neg + " valor(es) negativo(s)");
		ler.close();
	}

}