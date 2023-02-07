package application;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);

		while(true) {
			int j = 60;
			for ( int i = 1; j >= 0 ;i+=3) {
					System.out.println("I="+i+" J="+j);
					j = j - 5;
				}
			break;
		}
		
		ler.close();
	}
		
}
