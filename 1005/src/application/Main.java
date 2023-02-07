package application;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		int a = ler.nextInt(); 
		int b = ler.nextInt();
		int c = ler.nextInt();
		int d = ler.nextInt();
		
		int diferenca;
		
		diferenca = (a * b - c * d);
		
		System.out.println("DIFERENCA = " + diferenca);
		ler.close();
	}

}
