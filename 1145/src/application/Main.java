package application;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);

		int x = ler.nextInt();
		int y = ler.nextInt();
		if (x > 1 && x < 20 && y > x && y < 100000) {
		      for (int i = 1; i <=y; i++) {
		            System.out.print(i);
		        if(i%x==0){
		           System.out.println("");
		        }else{
		           System.out.print(" ");
		        }
		       }
		            if(y%x!=0){
		                System.out.println("");
		            }
		            
		        }
		        ler.close();
		    }
		}
