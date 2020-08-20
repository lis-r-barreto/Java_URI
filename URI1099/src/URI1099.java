import java.util.Scanner;

public class URI1099 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i=0; i<N; i++)
        {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (x > y)
            {
                int aux = x;
                x = y;
                y = aux;
            }

            int soma = 0;
            for (int j= x + 1; j < y; j++)
            {
                if (j % 2 != 0)
                {
                    soma += j;
                }
            }

            System.out.println(soma);
        }

	}

}
