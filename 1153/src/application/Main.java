package application;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);		
		
		int x = ler.nextInt();
		int f = x;
		int teste =0;
		while ( f >= 1) {
			teste = f * (x -1);
			f--;
		}
		System.out.println(teste);
		ler.close();
	}
}
