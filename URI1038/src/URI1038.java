import java.util.Locale;
import java.util.Scanner;

public class URI1038 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo, qtd;
		codigo = sc.nextInt();
		qtd = sc.nextInt();
		
		double cachorroQuente, xSalada, xBacon, torrada, refrigerante, total;
		switch (codigo) {
		case 1:
			cachorroQuente = 4.00; 
			total = cachorroQuente * qtd;
			System.out.printf("Total: R$ %.2f%n", total);
			break;
		case 2:
			xSalada = 4.50;
			total = xSalada * qtd;
			System.out.printf("Total: R$ %.2f%n", total);
			break;
		case 3:
			xBacon = 5.00;
			total = xBacon * qtd;
			System.out.printf("Total: R$ %.2f%n", total);
			break;
		
		case 4:
			torrada = 2.00;
			total = torrada * qtd;
			System.out.printf("Total: R$ %.2f%n", total);
			break;
		case 5:
			refrigerante = 1.50;
			total = refrigerante * qtd;
			System.out.printf("Total: R$ %.2f%n", total);
			break;
		}

	}

}
