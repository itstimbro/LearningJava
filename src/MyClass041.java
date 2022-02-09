/**
 * Prints all perfect numbers, less than n
 */

import java.util.Scanner;

class MyClass041 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = scanner.nextInt();
		int[] mas = new int[100];
		int count = 10000;
		int m = 0;
		int sum = 1;
		
		for (int i = 3; i < count; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
						mas[m] = j;
						sum += mas[m];
						m++;
				}
				if (i == sum && j == i-1 && i < n) {
					System.out.println (i + " is a perfect number");
				}
			}
			sum = 1;
			m = 0;
		}
	}
	
}