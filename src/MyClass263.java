/**
 * Matrix output from min to max (or from max to min)
 */

class MyClass263 {
	
	static int min, max;
	static int minI, maxI, minJ, maxJ;
	static boolean fromMinToMax, fromMaxToMin;
	
	static void masOutput(int[][] mas) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(mas[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	static void minFinder(int[][] mas) {
		min = mas[0][0];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				if (mas[i][j] < min) {
					min = mas[i][j];
					minI = i;
					minJ = j;
				}
			}
		}
	}
	
	static void maxFinder(int[][] mas) {
		max = mas[0][0];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				if (mas[i][j] > max) {
					max = mas[i][j];
					maxI = i;
					maxJ = j;
				}
			}
		}
	}
	
	static void coordCompare() {
		if (minI < maxI) {
			fromMinToMax = true;
		} else if (maxI < minI) {
			fromMaxToMin = true;
		} else {
			if (minJ < maxJ) {
				fromMinToMax = true;
			} else if (maxJ < minJ) {
				fromMaxToMin = true;
			}
		}
	}
	
	static void fromMaxToMinOutput(int[][] mas) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				if ((i > maxI) || ((i == maxI) && (j >= maxJ))) {
					System.out.print(mas[i][j] + " ");
				}
				if (mas[i][j] == min) {
					return;
				}
			}
		}
	}
	
	static void fromMinToMaxOutput (int[][] mas) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				if ((i > minI) || ((i == minI) && (j >= minJ))) {
					System.out.print(mas[i][j] + " ");
				}
				if (mas[i][j] == max) {
					return;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[][] mas = {
			{3, 5, 2, 8},
			{23, 5, 12, 1},
			{4, 12, -5, 0}};

		masOutput(mas);
		minFinder(mas);
		maxFinder(mas);
		coordCompare();

		if (fromMaxToMin) {
			fromMaxToMinOutput(mas);
		}

		if (fromMinToMax) {
			fromMinToMaxOutput(mas);
		}
	}
	
}