/**
 * Prints all divisors of integer Q, coprime with integer P
 */

import java.util.Scanner;

class MyClass037 {
	
	public static void main(String[] args) {
		int count = 20;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter q: ");
		int q = scanner.nextInt();
		System.out.print("Result: ");

		int[] div = new int[count];
		for (int i = 0; i < count; i++) {  
			div[i] = 1;
		}

		int temp = q;
		int j = 0;
		for (int i = 2; i < temp; ) {
			if (q % i == 0) {
				q = q / i;
				div[j] = i;
				System.out.print(div[j] + " ");
				j++;
			} else {
				i++;
			}
		}
		System.out.println();
		
		System.out.print("Enter p: ");
		int p = scanner.nextInt();
	
		int a = 0; // introducing a for not repeating "x and y are coprime"
		for (int i = 0; i < count; i++) {
			if (div[i] != a && (p % div[i]) != 0) {
				System.out.println(p + " and " + div[i] + " are coprime");
				a = div[i];
			}
		}
	}
}