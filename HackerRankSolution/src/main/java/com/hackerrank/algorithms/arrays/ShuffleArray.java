package com.hackerrank.algorithms.arrays;

import java.util.Random;

public class ShuffleArray {

	public static void main(String[] args) {
		int[] a = new int[] { 1, 2, 3, 4, 5, 6 };
		printArray(a);

		int[] b = shffuleArray(a);
		printArray(b);
	}

	private static void printArray(int[] a) {
		for (int value : a) {
			System.out.print(value);
		}
		System.out.println("\n");
	}

	public static int[] shffuleArray(int[] a) {
		int temp;
		Random r = new Random();
		for (int i = 0; i < a.length; i++) {
			int j = r.nextInt(a.length);

			temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
		return a;
	}
}
