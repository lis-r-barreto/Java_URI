import java.util.Scanner;

public class URI1132 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int X, Y, limInferior, limSuperior, soma;
		X = sc.nextInt();
		Y = sc.nextInt();

		if (X > Y) {
			limSuperior = X;
			limInferior = Y;

		}
		else {
			limSuperior = Y;
			limInferior = X;
		}

		soma = 0;
		for (int i = limInferior; i <= limSuperior; i++) {
			if (i % 13 != 0) {
				soma += i;
			}
			else {
				soma += 0;
			}
		}
		System.out.println(soma);

	}

}
