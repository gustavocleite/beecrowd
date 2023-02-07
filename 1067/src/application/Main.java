package application;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);


		int  val = ler.nextInt();
		for ( int i = 1 ; i <= val ; i++) {
			if (i  % 2 ==  1 ) {
				System.out.println(i);
			}
		}
		ler.close();
	}

}