import java.util.Scanner;

public class URI1080 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N, maior, posicao;
		N = sc.nextInt();
		
		maior = N;
		posicao = 1;
		for (int i=2; i<=100; i++) {
			int X = sc.nextInt();
			if (X > maior) {
				maior = X;
				posicao = i;
			}
		}
		System.out.println(maior);
		System.out.println(posicao);

	}

}
