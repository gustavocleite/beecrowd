package application;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		int x = ler.nextInt(); 
		int y = ler.nextInt();
		
		int prod;
		
		prod = x * y;
		
		System.out.println("PROD = " + prod );
				
		ler.close();
	}

}
