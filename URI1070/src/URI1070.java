import java.util.Scanner;

public class URI1070 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n= sc.nextInt();
		
		 if (n % 2 == 0)
         {
             n += 1;
         }
		 System.out.println(n);
		 System.out.println(n + 2);
		 System.out.println(n + 4);
		 System.out.println(n + 6);
		 System.out.println(n + 8);
		 System.out.println(n + 10);

	}

}
