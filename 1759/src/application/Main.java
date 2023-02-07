package application;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		int qnt = ler.nextInt();
		
		for ( int i = 0 ; i < qnt-1; i++) {
			System.out.printf("Ho ");
		}
		System.out.println("Ho!");
		ler.close();
	}
}