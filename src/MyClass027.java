/**
 * Sum of the digits in a number
 */

import java.util.Scanner;
import java.lang.Math;

class MyClass027 {
	
	public static void main(String[] args) {
		System.out.print("Enter the number: ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		int count = 0;
		int perm = n;
		while (perm > 0 ) {
			perm = perm / 10;
			count++;
		}

		int[] mas = new int[count];
		double temp;
		int temp2;
		int j = 0;
		for (int i = count - 1; i > -1; i--) {
			temp = n / Math.pow(10, i);
			temp2 = (int)temp;
			if (i != count - 1) {
				mas[j] = temp2 % 10;
			} else {
				mas[j] = temp2;
			}
			j++;
		}

		int result = 0;
		for (int i = 0; i < count; i++) {
			result = result + mas[i];
		}

		System.out.print("Result: " + result);
	}
	
}