package application;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		
		int hInicial = ler.nextInt();
		int hFinal = ler.nextInt();
		
		if (hInicial > hFinal) { 
			System.out.println("O JOGO DUROU " + (24 - (hInicial - hFinal)) + " HORA(S)");
		} else if (hFinal > hInicial) {
			System.out.println("O JOGO DUROU " + (hFinal - hInicial) + " HORA(S)");
		} else {
			System.out.println("O JOGO DUROU 24 HORA(S)");
		}
		
		ler.close();
		}
		
	}
