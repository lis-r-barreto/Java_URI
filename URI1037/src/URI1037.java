import java.util.Locale;
import java.util.Scanner;

public class URI1037 {

	public static void main(String[] args) {
		 
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double N = sc.nextDouble();
		
		//[0,25], (25,50], (50,75], (75,100]
		
		if (N >= 0.0 && N <= 25.0) {
			System.out.println("Intervalo [0,25]");
		}
		else if (N > 25.0 && N <= 50.0) {
			System.out.println("Intervalo (25,50]");
		}
		else if (N > 50.0 && N <= 75.0) {
			System.out.println("Intervalo (50,75]");
		}
		else if (N > 75.0 && N <= 100.0) {
			System.out.println("Intervalo (75,100]");
		}
		else {
			System.out.println("Fora de intervalo");
		}

	}

}
