package application;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		int vetor[] = new int[20];
		int vetorA[] = new int[20];
		
		for( int i = 0 ; i < vetor.length; i++) {
			vetor[i] = ler.nextInt();
 		}
		
		for ( int i = 0 ; i < (vetorA.length/2 ); i++) {
			int aux = vetor[i];
			vetor[i] = vetor[vetor.length -1 -i];
			vetor[vetor.length -1 -i ] = aux;
		}
		for ( int i = 0 ; i < vetor.length; i++) {
			System.out.println("N["+ i + "] = " + vetor[i]);
		}
		ler.close();
	}
}