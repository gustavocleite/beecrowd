package application;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		int vetor[] = new int[1000];
		int t = ler.nextInt();
		int j = 0;
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = j;
			j++;
			if(j == t) {
				j = 0;
			}
		}
		
		for ( int i = 0 ; i < vetor.length; i ++) {
			System.out.printf("N[%d] = %d\n",i,  vetor[i]);
		}
		ler.close();
	}
}