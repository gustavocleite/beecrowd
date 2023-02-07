package application;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		double vetor[] = new double[20];
		vetor[0] = ler.nextDouble();
		
		for (int i = 1; i < vetor.length; i ++) {
			vetor[i] = vetor[i-1] /2;
		}
		
		for ( int i = 0 ; i < vetor.length; i ++) {
			System.out.printf("N[%d] = %.4f\n", i ,vetor[i]);
		}
		ler.close();
	}
}