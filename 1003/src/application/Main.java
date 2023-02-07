package application;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		int a = ler.nextInt(); 
		int b = ler.nextInt();
		
		int soma;
		
		soma = a + b;
		
		System.out.println("SOMA = " + soma );
				
		ler.close();
	}

}
