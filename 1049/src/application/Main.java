package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);

		String palavra1 = ler.nextLine();
	
		
		if (palavra1.equals("vertebrado")) {
			palavra1 = ler.nextLine();
			if ( palavra1.equals("ave")) {
				palavra1 = ler.nextLine();
				if(palavra1.equals("carnivoro")) {
					System.out.println("aguia");
				}else {
					System.out.println("pomba");
				}
			} else if (palavra1.equals("mamifero")) {
				palavra1 = ler.nextLine();
				if ( palavra1.equals("onivoro")) {
					System.out.println("homem");
				}else {
					System.out.println("vaca");
				}
			}
			
		}
		
		if (palavra1.equals("invertebrado")) {
			palavra1 = ler.nextLine();
			if ( palavra1.equals("inseto")) {
				palavra1 = ler.nextLine();
				if(palavra1.equals("hematofago")) {
					System.out.println("pulga");
				}else {
					System.out.println("lagarta");
				}
			} else if (palavra1.equals("anelideo")) {
				palavra1 = ler.nextLine();
				if ( palavra1.equals("hematofago")) {
					System.out.println("sanguessuga");
				}else {
					System.out.println("minhoca");
				}
			}
			
		}
		
		
		ler.close();
	}
}

	