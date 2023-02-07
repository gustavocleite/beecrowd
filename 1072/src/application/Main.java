package application;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		int qntCaso = ler.nextInt();
		int vetor[] = new int[qntCaso];
		int in= 0;
		int out = 0;
		for ( int i = 0; i < vetor.length ; i++  ) {
			vetor[i] = ler.nextInt();	
		}
		
		for ( int i = 0; i < vetor.length ; i++  ) {
			if ( vetor[i] >= 10 && vetor[i] <= 20) {
				in++;
			}else {
				out++;
			}
		}
		System.out.println(in+ " in");
		System.out.println(out+ " out");
	
	ler.close();
	}

}