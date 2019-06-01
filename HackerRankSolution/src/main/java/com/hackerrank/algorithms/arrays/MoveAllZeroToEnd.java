package com.hackerrank.algorithms.arrays;

public class MoveAllZeroToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[]{ 1, 0, 2, 0, 1, 0 };
		printArray(a);

		int[] b = moveZeroToEnd(a, a.length);
		printArray(b);
	}

	private static void printArray(int[] a) {
		for (int value : a) {
			System.out.print(value);
		}
		System.out.println("\n");
	}

	public static int[] moveZeroToEnd(int[] a, int n) {

		int count = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] != 0) {
				a[count++] = a[i];
			}
		}

		while (count < n) {
			a[count++] = 0;
		}

		return a;
	}

}
