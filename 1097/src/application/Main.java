package application;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		int i = 1;
		int j = 7;
		while (i <= 9) {
			
			for (int l =0 ; l < 3; l++) {
				System.out.println("I=" + i + " J=" + j);
				j--;
			}
			j+=5;
			i+=2;
		}
		ler.close();
	}
		
}
