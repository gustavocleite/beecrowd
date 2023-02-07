package application;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		double a = ler.nextDouble();
		double b = ler.nextDouble();
		double c = ler.nextDouble();
		
		double delta = (Math.pow(b, 2)) -(4 * a * c);
		if ( delta <= 0 ) {
			System.out.println("Impossivel calcular");
		}else {
			delta = Math.sqrt(delta);
			double x1 = -b + delta;
			double x2 = -b - delta;

			if ( delta - b != 0 ) {
				System.out.printf("R1 = %.5f\n", x1/(2*a));
				System.out.printf("R2 = %.5f\n", x2/(2*a));
			}else {
				System.out.println("Impossivel calcular");
			}
		}
			
		
	}	

}