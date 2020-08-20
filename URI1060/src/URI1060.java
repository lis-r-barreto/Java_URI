import java.util.Locale;
import java.util.Scanner;

public class URI1060 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double n1, n2, n3, n4, n5, n6;
		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
		n3 = sc.nextDouble();
		n4 = sc.nextDouble();
		n5 = sc.nextDouble();
		n6 = sc.nextDouble();
		
		int count = 0;
		if (n1 >= 0) {
			count++;
		}
		else {
			count += 0;
		}
		if (n2 >= 0) {
			count++;
		}
		else {
			count += 0;
		}
		if (n3 >= 0) {
			count++;
		}
		else {
			count += 0;
		}
		if (n4 >= 0) {
			count++;
		}
		else {
			count += 0;
		}
		if (n5 >= 0) {
			count++;
		}
		else {
			count += 0;
		}
		if (n6 >= 0) {
			count++;
		}
		else {
			count += 0;
		}
		System.out.println(count + " valores positivos");

	}

}
