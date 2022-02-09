/**
 * Prints in ascending order all 3-digit numbers that don't have duplicated digits
 */

import java.lang.Math;

class MyClass045 {
	
	public static void main(String[] args) {

		int count = 3;
		int[] mas = new int[count];
		double temp;
		int temp2;
		int j;
		
		for (int n = 100; n < 1000; n++) {
			j = 0;
			for(int i = count - 1; i > -1; i--) {
				temp = n / Math.pow(10, i);
				temp2 = (int) temp;
				if (i != count - 1) {
					mas[j] = temp2 % 10;
				} else {
					mas[j] = temp2;
				}
				j++;
			}
			if (mas[0] != mas[1] && mas[0] != mas[2] && mas[1] != mas[2]) {
				System.out.print(n + " ");
			}
		}
	}
	
}