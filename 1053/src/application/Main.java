package application;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		int fat = ler.nextInt();
		int res = 1;
		
		for ( int i = fat; i > 1; i= i -1) {
			res = res * i;
		}
		System.out.println(res);
		
		ler.close();
	}
}