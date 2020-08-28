import java.util.Locale;
import java.util.Scanner;

public class URI1154 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);


		int n = sc.nextInt();

		int i = 0;
		double soma = 0.0;
		while (n >= 0) {
			i++;
			soma += n;
			n = sc.nextInt();
		}
		double media = soma / i;
		System.out.printf("%.2f%n", media);

	}

}
