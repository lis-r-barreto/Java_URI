import java.util.Scanner;

public class URI1066 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, qtdPares, qtdImpares, qtdPositivos, qtdNegativos;
		qtdPares = 0;
		qtdImpares = 0;
		qtdPositivos = 0;
		qtdNegativos = 0;
				
		for(int i = 0; i < 5; i++)
        {
            n = sc.nextInt();

            if (n % 2 == 0)
            {
                qtdPares += 1;
            }
            else
            {
                qtdImpares += 1;
            }

            if (n > 0)
            {
                qtdPositivos += 1;
            }
            else if (n < 0)
            {
                qtdNegativos += 1;
            }
        }
		System.out.println(qtdPares + " valor(es) par(es)");
		System.out.println(qtdImpares + " valor(es) impar(es)");
		System.out.println(qtdPositivos + " valor(es) positivo(s)");
		System.out.println(qtdNegativos + " valor(es) negativo(s)");

	}

}
