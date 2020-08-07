import java.util.Locale; 
import java.util.Scanner;

public class URI1017 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int tempo, velocidadeMedia;
		double distancia, combustivel;
		tempo = sc.nextInt();
		velocidadeMedia = sc.nextInt();
		distancia = velocidadeMedia * tempo;
		combustivel = distancia / 12.0;
		
		System.out.printf("%.3f%n", combustivel);

	}

}