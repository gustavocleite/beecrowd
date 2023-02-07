package application;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);

	     int N = ler.nextInt();
	        int X, cont;
	        for (int i = 0; i < N; i++) {
	        	cont = 0;
	        	X = ler.nextInt();
	        	for (int j = 2; j < X; j++) {
	        		if (X % j == 0) cont++;
	        	}
	        	if (cont == 0) System.out.println(X + " eh primo");
	        	else System.out.println(X + " nao eh primo");
	        }
	       ler.close();
	    }
		
}