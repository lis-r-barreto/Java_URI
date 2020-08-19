import java.util.Scanner;

public class URI1049 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String classificacao1 = sc.nextLine();
		String classificacao2 = sc.nextLine();
		String classificacao3 = sc.nextLine();
		
		if (classificacao1.equals("vertebrado")) {
			if (classificacao2.equals("ave")) {
				if (classificacao3.equals("carnivoro")) {
					System.out.println("aguia");
				}
				else {
					System.out.println("pomba");
				}
			}
			else {
				if (classificacao3.equals("onivoro")) {
					System.out.println("homem");
				}
				else {
					System.out.println("vaca");
				}
			}
		}
		else {
			if (classificacao2.equals("inseto")) {
				if (classificacao3.equals("hematofago")) {
					System.out.println("pulga");
				}
				else {
					System.out.println("lagarta");
				}
			}
			else {
				if (classificacao3.equals("hematofago")) {
					System.out.println("sanguessuga");
				}
				else {
					System.out.println("minhoca");
				}
			}
		}

	}

}
