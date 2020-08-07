import java.util.Locale;
import java.util.Scanner;

public class URI1009 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome = sc.nextLine();
		double salarioFixo = sc.nextDouble();
		double montanteVendas = sc.nextDouble();
		double salarioTotal = salarioFixo + montanteVendas * 0.15;
		
		System.out.printf("TOTAL = R$ %.2f%n", salarioTotal);
		
	}
}
