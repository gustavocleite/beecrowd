package application;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		

		double s = 1;
		int x = 1;
		int y = 2;
		
		
		for ( int i = 1; i < 100 ; i++) {
			s += x/y;
			y++;
		}
		System.out.printf("%.2f",s);
		ler.close();
	}
}
