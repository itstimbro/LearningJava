/**
 * Filling one matrix with elements of another randomly; max finder
 */

class MyClass269 {
	
	static int max, iMax, jMax;
	
	static void fillingMas(int[][] mas) {
		int num = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				mas[i][j] = num;
				num++;
			}
		}
	}
	
	static void fillingMas2Random(int[][] mas, int[][] mas2) {
		boolean isTrue = true;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (i == 0 && j == 0) {
					continue;
				}
				while (isTrue) {
					int iRandomCell = (int) (Math.random() * 4); 
					int jRandomCell = (int) (Math.random() * 4);
					if (mas2[iRandomCell][jRandomCell] == 0) {
						mas2[iRandomCell][jRandomCell] = mas[i][j];
						isTrue = false;
					}
				}
				isTrue = true;
			}
		}
	}
	
	static void masOutput(int[][] mas) {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(mas[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	static void mas2Output(int[][] mas2) {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(mas2[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	static void maxFinder(int[][] mas2) {
		max = mas2[0][0];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (max < mas2[i][j]) {
					max = mas2[i][j];
					iMax = i;
					jMax = j;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[][] mas = new int[4][4];
		fillingMas(mas);

		int[][] mas2 = new int[4][4];
		fillingMas2Random(mas, mas2);

		masOutput(mas);
		System.out.println();

		mas2Output(mas2);
		System.out.println();

		maxFinder(mas2);
		System.out.print("MAX: mas2[" + iMax + "][" + jMax + "] = " + max);
	}
	
}