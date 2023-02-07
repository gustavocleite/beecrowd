package application;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		int num = ler.nextInt();
		for ( int i = 1; i <= num ; i++) {
			System.out.println(i +" "+ i*i+ " " + i*i*i);
		}
		
		ler.close();
	}

}