/**
 * Bin search (recursion)
 */

import java.util.Scanner;

class MyClass405 {

    static int x;

    static void sequenceInput(Scanner scanner, int[] arr) {
        System.out.println("increasing sequence: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
            if (i > 0) {
                if (arr[i] < arr[i - 1]) {
                    System.out.print("wrong input");
                    System.exit(0);
                }
            }
        }
    }

    static void numberInput(Scanner scanner) {
        System.out.println("number: ");
        x = scanner.nextInt();
    }

    static void binSearch(int[] arr, int len, int mid) {
        if (arr[mid] == x) {
            System.out.println("index: " + mid);
            return;
        }
        if (x > arr[mid]) {
            len -= (len / 2) + 1;
            mid += (len / 2) + 1;
        }
        if (x < arr[mid]) {
            len -= (len / 2) + (arr.length % 2 == 0 ? 0 : 1);
            mid -= (len / 2) + 1;
        }
		binSearch(arr, len, mid);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
		int len = arr.length;
		int mid = len / 2;

        sequenceInput(scanner, arr);
        numberInput(scanner);
        binSearch(arr, len, mid);
    }
}