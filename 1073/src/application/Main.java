package application;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);


		int  val = ler.nextInt();
		for ( int i = 1 ; i <= val ; i++) {
			if (i  % 2 ==  0 ) {
				System.out.printf("%d^2 = %d%n",i ,(int)Math.pow(i, 2) );
			}
		}
		ler.close();
	}

}