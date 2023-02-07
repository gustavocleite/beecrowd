package application;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		int qntCaso =  ler.nextInt();
		int valor =0;
		int menor = 32760;
		int posicao =0;
		
		
		for ( int i = 0; i< qntCaso; i++) {
			valor = ler.nextInt();
	
			if ( valor < menor ) {
				menor = valor;
				posicao = i;
			}
		}
		
		System.out.println("Menor valor: "+ menor);
		System.out.println("Posicao: "+ posicao);
		
		ler.close();
	}

}