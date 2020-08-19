import java.util.Locale;
import java.util.Scanner;

public class URI1043 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, perimetro, area;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		if (A < B + C && B < A + C && C < A + B) {
			perimetro = A + B + C;
			System.out.printf("Perimetro = %.1f%n", perimetro);
		}
		else {
			area = (A + B) * C / 2.0;
			System.out.printf("Area = %.1f%n", area); 
		}
		
	}

}
