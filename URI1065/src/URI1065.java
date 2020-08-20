import java.util.Scanner;
public class URI1065 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, n3, n4, n5, n6;
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		n4 = sc.nextInt();
		n5 = sc.nextInt();
		
		int count = 0;
		if (n1 % 2 == 0) {
			count++;
		}
		else {
			count += 0;
		}
		if (n2 % 2 == 0) {
			count++;
		}
		else {
			count += 0;
		}
		if (n3 % 2 == 0) {
			count++;
		}
		else {
			count += 0;
		}
		if (n4 % 2 == 0) {
			count++;
		}
		else {
			count += 0;
		}
		if (n5 % 2 == 0) {
			count++;
		}
		else {
			count += 0;
		}
		System.out.println(count + " valores pares");

	}

}
