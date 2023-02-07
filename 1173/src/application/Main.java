package application;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		int vetor[] = new int[10];
		int valor = ler.nextInt();
		
		vetor[0] = valor;
		
		for ( int i = 1; i < vetor.length; i++) {
			vetor[i] = 2 * vetor[i-1];
		}
		for ( int i = 0; i < vetor.length; i++) {
			System.out.println("N["+ i + "] = "+ vetor[i]);
		}
		ler.close();
	}
}