import java.util.Scanner;

public class URI1046 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int inicio, fim, duracao;
		inicio = sc.nextInt();
		fim = sc.nextInt();
		
		if (inicio < fim) {
			duracao = fim - inicio;
			System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		}
		else {
			duracao = 24 - inicio + fim;
			System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		}
		
	}

}
