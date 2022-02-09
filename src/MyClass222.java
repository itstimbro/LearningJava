/**
 * Matrix:
 * x1 x2 x3
 * x4 x5 x6
 * x7 x8 x9
 *
 * Output: x3 x5 x9
 */

class MyClass222 {
	
	static int indexIJ;
	
	static void masOutput(int[][] mas) {
		int x = 0;
		for (int i = 0; i < mas[0].length; i ++) {
			for (int j = 0; j < mas[0].length; j++) {
				mas[i][j] = x;
				System.out.print(mas[i][j] + " ");
				x++;
			}
			System.out.println();
		}
	}
	
	static void diag1Output(int[][] mas) {
		int j = mas[0].length - 1;
		for (int i = 0; i < (mas[0].length + 1) / 2; i++) {
			System.out.print(mas[i][j] + " ");
			indexIJ = i;
			j--;
		}
	}
	
	static void diag2Output(int[][] mas) {
		int j = indexIJ + 1; 
		for (int i = indexIJ + 1; i < mas[0].length; i++) {
			System.out.print(mas[i][j] + " ");
			j++;
		}
	}
	
	public static void main(String[] args) {
		int[][] mas = new int[3][3];
		masOutput(mas);
		System.out.println();
		diag1Output(mas);
		diag2Output(mas);
	}
	
}