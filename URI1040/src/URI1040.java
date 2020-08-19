import java.util.Locale;
import java.util.Scanner;

public class URI1040 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		float N1, N2, N3, N4, media, notaExame, mediaFinal;
		N1 = sc.nextFloat();
		N2 = sc.nextFloat();
		N3 = sc.nextFloat();
		N4 = sc.nextFloat();
		
		media = (N1 * 2f + N2 * 3f + N3 * 4f + N4 * 1f) / 10f;
		System.out.printf("Media: %.1f%n", media);
		
		if (media >= 7f) {
			System.out.println("Aluno aprovado.");
		}
		else if (media < 5f) {
			System.out.println("Aluno reprovado.");
		}
		else {
			System.out.println("Aluno em exame.");
			notaExame = sc.nextFloat();
			System.out.printf("Nota do exame: %.1f%n", notaExame);
			mediaFinal = (media + notaExame) / 2f;
			
			if (mediaFinal >= 5f) {
				System.out.println("Aluno aprovado.");
			}
			else {
				System.out.println("Aluno reprovado.");
			}
			
			System.out.printf("Media final: %.1f%n", mediaFinal);
		}

	}

}
