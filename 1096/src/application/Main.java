package application;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		int i = 1;
		while (i <= 9) {
			for (int j = 7; j > 4; j--) {
				System.out.println("I=" + i + " J=" + j);
			}
			i+=2;
		}
		ler.close();
	}
		
}
