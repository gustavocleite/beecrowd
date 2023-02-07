package application;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);		
		
		int num1 = 0;
		int num2 = 1;
		int vetor[] = new int[46];
		//vetor[0] = 0;
		
			for (int i = 0; i < 46; i++) {
				num1 = num2 + num1;
				num2 = num1 - num2;
				vetor[i] = num2;
			}

			int qnt = ler.nextInt();
			for (int j = 0; j < qnt; j++) {
				if (j < qnt -1) {
					System.out.printf("%d ",vetor[j]);
				} else {
					System.out.printf("%d\n",vetor[j]);
				}
				
			}
		ler.close();
	}
}
