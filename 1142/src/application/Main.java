package application;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		int num = ler.nextInt();
		int cont = 0;
		for (int i = 0; i < num; i++) {
			 System.out.println((cont+1)+" "+(cont+2)+" "+(cont+3)+" PUM");
			 cont+=4;
		 }
		ler.close();
	}

}