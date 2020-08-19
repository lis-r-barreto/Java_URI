import java.util.Scanner;

public class URI1047 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hInicial, minInicial, hFinal, minFinal, instanteInicial, instanteFinal, duracao;
		hInicial = sc.nextInt();
		minInicial = sc.nextInt();
		hFinal = sc.nextInt();
		
		minFinal = sc.nextInt();
		instanteInicial = hInicial * 60 + minInicial;
		instanteFinal = hFinal * 60 + minFinal;
		
		if (instanteFinal > instanteInicial) {
			duracao = instanteFinal - instanteInicial;
		}
		else {
			duracao = (24 * 60 - instanteInicial) + instanteFinal;
		}
		
		int duracaoHoras = duracao / 60;
		int duracaoMinutos = duracao % 60;
		
		System.out.println("O JOGO DUROU " + duracaoHoras + " HORA(S) E " + 
		                   duracaoMinutos + " MINUTO(S)");

	}

}
