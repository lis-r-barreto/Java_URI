import java.util.Scanner;

public class URI1072 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N, qtdIn, qtdOut;
		N = sc.nextInt();
		
		qtdIn = 0;
		qtdOut = 0;
		for (int i=1; i<=N; i++) {
			int X;
            X = sc.nextInt();

            if (X >= 10 && X <=20)
            {
                qtdIn += 1;
            }

            else
            {
                qtdOut += 1;
            }
		}
		
		System.out.println(qtdIn + " in");
		System.out.println(qtdOut + " out");

	}

}
