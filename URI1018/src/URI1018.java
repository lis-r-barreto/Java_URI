import java.util.Scanner;

public class URI1018 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int notas100, notas50, notas20, notas10, notas5, notas2, notas1, resto;
		
		resto = sc.nextInt(); // Valor
		System.out.println(resto);
		
		notas100 = resto / 100;
		System.out.println(notas100 + " nota(s) de R$ 100,00");
		resto = resto % 100;
		
		notas50 = resto / 50;
		System.out.println(notas50 + " nota(s) de R$ 50,00");
		resto = resto % 50;
		
		notas20 = resto / 20;
		System.out.println(notas20 + " nota(s) de R$ 20,00");
		resto = resto % 20;
		
		notas10 = resto / 10;
		System.out.println(notas10 + " nota(s) de R$ 10,00");
		resto = resto % 10;
		
		notas5 = resto / 5;
		System.out.println(notas5 + " nota(s) de R$ 5,00");
		resto = resto % 5;
		
		notas2 = resto / 2;
		System.out.println(notas2 + " nota(s) de R$ 2,00");
		resto = resto % 2;
		
		notas1 = resto / 1;
		System.out.println(notas1 + " nota(s) de R$ 1,00");
		
	}

}
