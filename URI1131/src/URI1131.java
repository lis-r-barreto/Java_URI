import java.util.Scanner;

public class URI1131 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int golsInter, golsGremio, novoGrenal, totGrenais, vitoriasInter, vitoriasGremio, empates;
		vitoriasInter = 0;
		vitoriasGremio = 0;
		empates = 0;
		novoGrenal = 1;

		while (novoGrenal == 1) {
			golsInter = sc.nextInt();
			golsGremio = sc.nextInt();

			if (golsInter > golsGremio) {
				vitoriasInter++;
			}
			else if (golsInter < golsGremio) {
				vitoriasGremio++;
			}
			else {
				empates++;
			}
			System.out.println("Novo grenal (1-sim 2-nao)");
			novoGrenal = sc.nextInt();
		}

		totGrenais = vitoriasInter + vitoriasGremio + empates;

		System.out.println(totGrenais + " grenais");
		System.out.println("Inter:" + vitoriasInter);
		System.out.println("Gremio:" + vitoriasGremio);
		System.out.println("Empates:" + empates);

		if (vitoriasInter > vitoriasGremio) {
			System.out.println("Inter venceu mais");
		}
		else if (vitoriasInter < vitoriasGremio) {
			System.out.println("Gremio venceu mais");
		}
		else {
			System.out.println("Nao houve vencedor");
		}

	}

}
