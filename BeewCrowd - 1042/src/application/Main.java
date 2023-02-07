package application;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		int valor1 = ler.nextInt();
		int valor2 = ler.nextInt();
		int valor3 = ler.nextInt();
		
		int vet1[] = new int[3];
		int vet2[] = new int[3];
		vet1[0] = vet2[0] = valor1;
		vet1[1] = vet2[1] = valor2;
		vet1[2] = vet2[2] = valor3;

		Arrays.sort(vet2);   //order


		for ( int x = 0; x < 3; x++ ) {
			System.out.println(vet2[x]);
		}
		System.out.println();
		for ( int x = 0; x < 3; x++ ) {
			System.out.println(vet1[x]);
		}
		ler.close();
	}

}