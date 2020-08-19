import java.util.Scanner;

public class URI1042 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, n1, n2, n3;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		
		if (A < B && A < C) {
			n1 = A;
			if (B < C) {
				n2 = B;
				n3 = C;
			}
			else {
				n2 = C;
				n3 = B;
			}

		}
		
		else if (B < A && B < C) {
			n1 = B;
			if (A < C) {
				n2 = A;
				n3 = C;
			}
			else {
				n2 = C;
				n3 = A;
			}
		}
		
		else {
			n1 = C;
			if (B < A) {
				n2 = B;
				n3 = A;
			}
			else {
				n2 = A;
				n3 = B;
			}
		}
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println();
		System.out.println(A);
		System.out.println(B);
		System.out.println(C);


	}

}
