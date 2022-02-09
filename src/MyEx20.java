/**
 * Zodiac sign
 */

import java.util.Scanner;

class MyEx20 {
	
	String zodiac(int day, int month) {
		String result = null;
		int x = month * 100 + day;
		if (x >= 120 && x <= 218) {
			result = "Vodoley";
		} else if (x >= 219 && x <= 320) {
			result = "Ryby";
		} else if (x >= 321 && x <= 419) {
			result = "Oven";
		} else if (x >= 420 && x <= 520) {
			result = "Telec";
		} else if (x >= 521 && x <= 621) {
			result = "Bliznecy";
		} else if (x >= 622 && x <= 722) {
			result = "Rak";
		} else if (x >= 723 && x <= 822) {
			result = "Lev";
		} else if (x >= 823 && x <= 922) {
			result = "Deva";
		} else if (x >= 923 && x <= 1022) {
			result = "Vesy";
		} else if (x >= 1023 && x <= 1122) {
			result = "Scorpion";
		} else if (x >= 1123 && x <= 1221) {
			result = "Strelec";
		} else if (x >= 1222 || x <= 119) {
			result = "Kozerog";
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the day of your birth: ");
		int day = scanner.nextInt();
		System.out.print("Enter the month of your birth: ");
		int month = scanner.nextInt();
		MyEx20 me = new MyEx20();
		System.out.println("Your Zodiac sign is " + me.zodiac(day, month));
	}

}