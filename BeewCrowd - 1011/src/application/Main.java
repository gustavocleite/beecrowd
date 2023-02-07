package application;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		double raio = ler.nextDouble();
		double volume;
		
		volume = (4.0/3) * 3.14159 * ( raio * raio * raio ); 
		
		
		System.out.printf("VOLUME = %.3f%n",volume);
		ler.close();
	}

}