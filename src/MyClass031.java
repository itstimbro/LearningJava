/**
 * Coprime numbers
 */

import java.util.Scanner;

class MyClass031 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter n: ");
		int n = scanner.nextInt();

		for(int num = 1; num < n; num++) {
			System.out.print(num + " ");
		}
		System.out.println();
		
		for (int i = n - 1; i > 1; i--) {
			for (int j = i; j > 1; j--) {
				if (n % j == 0 && i % j == 0) {
					break;
				} else if (j == 2) {
					System.out.println(n + " and " + i + " are coprime");
				}
			}
		}
	}
	
}