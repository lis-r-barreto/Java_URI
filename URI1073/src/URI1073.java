import java.util.Scanner;

public class URI1073 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i=1; i<=N;i++) {
			if (i % 2 == 0) {
				int quadrado = (int) Math.pow(i, 2);
				System.out.println(i + "^2 = " + quadrado);
			}
			
		}

	}

}
