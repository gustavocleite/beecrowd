package application;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		int vetor[] = new int[5];
		
		for( int i = 0 ; i < vetor.length; i++) {
			vetor[i] = ler.nextInt();
			if ( vetor[i] < 0 || vetor[i] ==0 ) {
				vetor[i] = 1;
			}
 		}
		
		for ( int i = 0 ; i < vetor.length;i++) {
			System.out.println("X["+i+"] = "+ vetor[i] );
		}
		ler.close();
	}
}