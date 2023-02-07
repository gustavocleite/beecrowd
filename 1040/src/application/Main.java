package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		double n1 = ler.nextDouble();
		double n2 = ler.nextDouble();
		double n3 = ler.nextDouble();
		double n4 = ler.nextDouble();
		double mediaFinal = 0;
		
		double media = (float)((n1*2) + (n2*3) + (n3*4) + (n4)) / 10;
		
		if ( media >= 7 ) {
			System.out.printf("Media: %.1f\n", media);
			System.out.println("Aluno aprovado.");
		}
		if ( media < 5 ) {
			System.out.printf("Media: %.1f\n", media);
			System.out.println("Aluno reprovado.");
		}else{
			double Exame = ler.nextDouble();
			System.out.printf("Media: %.1f\n", media);	
			System.out.println("Aluno em exame.");			
			System.out.printf("Nota do exame: %.1f\n", Exame);
			mediaFinal = (float)(Exame + media) / 2;
			
			if (mediaFinal < 5) {
				System.out.println("Aluno reprovado.");
				System.out.printf("Media final: %.1f\n", mediaFinal);
				
			}else {
				System.out.println("Aluno aprovado.");
				System.out.printf("Media final: %.1f\n", mediaFinal);
			}
		}
		
		ler.close();
	}

}