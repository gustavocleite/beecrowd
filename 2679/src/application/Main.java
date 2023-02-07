package application;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		int x = ler.nextInt();
		
		while(true) {
			if ( x % 2 == 0) {
				System.out.println(x+2);
				break;
			}else {
				System.out.println(x+1);
				break;
			}
		}

		
		ler.close();
	}

}