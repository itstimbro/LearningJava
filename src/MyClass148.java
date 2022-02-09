/**
 * Prints a matrix in spiral form
 */

class MyClass148 {
	
	static void masOutput(int[][] mas, int n) {
		for (int i = 0; i < n; i ++) {
			for (int j = 0; j < n; j++) {
				System.out.print(mas[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	static void mainFunc(int[][] mas, int n) {
		int count = 0;
		int d = n / 2;
		int i = 0;
		int j;
		while (true) {
			for (j = 0 + count; j < n - count; j++) {
				System.out.print(mas[i][j] + " ");
			}
			j--;

			if ((i == d) && (i + j == n - 1)) {
				break;
			}

			for (i = 1 + count; i < n - count; i++) {
				System.out.print(mas[i][j] + " ");
			}
			i--;

			for (j = j - 1; j > -1 + count; j--) {
				System.out.print(mas[i][j] + " ");
			}
			j++;

			if ((i == d) && (i + j == n - 1)) {
				break;
			}

			for (i = i - 1; i > 0 + count; i--) {
				System.out.print(mas[i][j] + " ");
			}
			i++;
			count++;
		}
	}
	
	public static void main(String[] args) {
		int n = 4;
		int[][] mas = {
			{0, 1, 2, 3},
			{11, 12, 13, 4},
			{10, 15, 14, 5},
			{9, 8, 7, 6}
		};
		System.out.println("matrix " + n + "x" + n);
		masOutput(mas, n);
		mainFunc(mas, n);
	}
	
}

/* tests

		int n = 4;
		int[][] mas = {
			{0, 1, 2, 3},
			{11, 12, 13, 4},
			{10, 15, 14, 5},
			{9, 8, 7, 6}
		};
		int n = 5;
		int[][] mas = {
			{0, 1, 2, 3, 4},
			{15, 16, 17, 18, 5},
			{14, 23, 24, 19, 6},
			{13, 22, 21, 20, 7},
			{12, 11, 10, 9, 8}
		};
		int n = 6;
		int[][] mas = {
			{0, 1, 2, 3, 4, 5},
			{19, 20, 21, 22, 23, 6},
			{18, 31, 32, 33, 24, 7},
			{17, 30, 35, 34, 25, 8},
			{16, 29, 28, 27, 26, 9},
			{15, 14, 13, 12, 11, 10}
		};
		int n = 7;
		int[][] mas = {
			{0, 1, 2, 3, 4, 5, 6},
			{23, 24, 25, 26, 27, 28, 7},
			{22, 39, 40, 41, 42, 29, 8},
			{21, 38, 47, 48, 43, 30, 9},
			{20, 37, 46, 45, 44, 31, 10},
			{19, 36, 35, 34, 33, 32, 11},
			{18, 17, 16, 15, 14, 13, 12}
		};
		
*/