package application;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		double vetor[] = new double[100];
		
		for( int i = 0 ; i < vetor.length; i++) {
			vetor[i] = ler.nextDouble();
 		}
		
		for ( int i = 0 ; i < vetor.length;i++) {
			if ( vetor[i] <= 10) {
				System.out.println("A["+i+"] = "+ vetor[i] );
			}
			
		}
		ler.close();
	}
}