import java.util.Locale;
import java.util.Scanner;

public class URI1014 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int distanciaTotal = sc.nextInt();
		double totalCombustivel = sc.nextDouble();
		
		double consumoMedio = distanciaTotal / totalCombustivel;
		
		System.out.printf("%.3f km/l%n", consumoMedio);
	}
}
