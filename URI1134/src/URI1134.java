import java.util.Scanner;

public class URI1134 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);


		int combustivel, somaAlcool, somaGasolina, somaDiesel;
		combustivel = sc.nextInt();

		somaAlcool = 0;
		somaGasolina = 0;
		somaDiesel = 0;

		System.out.println("MUITO OBRIGADO");

		while (combustivel != 4) {
			if (combustivel == 1) {
				somaAlcool++;
			}
			else if (combustivel == 2) {
				somaGasolina++;
			}
			else if (combustivel == 3){
				somaDiesel++;
			}
			combustivel = sc.nextInt();
		}

		System.out.println("Alcool: " + somaAlcool);
		System.out.println("Gasolina: " + somaGasolina);
		System.out.println("Diesel: " + somaDiesel);

	}

}
