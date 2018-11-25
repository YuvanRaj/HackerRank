package com.hackerrank.algorithms.arrays;

import java.text.DecimalFormat;

public class PlusMinus {
	private static DecimalFormat df = new DecimalFormat("############.######");

	public static void main(String[] args) {
		int[] arr = { -4, 3, -9, 0, 4, 1 };
		plusMinus(arr);

	}

	// Complete the plusMinus function below.
	public static void plusMinus(int[] arr) {
		double positiveCount = 0.0;
		double negativeCount = 0.0;
		double zeroCount = 0.0;
		double size = arr.length;

		for (Integer value : arr) {
			if (value > 0) {
				positiveCount++;
			} else if (value < 0) {
				negativeCount++;
			} else {
				zeroCount++;
			}
		}

		System.out.println(String.format("%.6f", (positiveCount / size)));
		System.out.println(String.format("%.6f", (negativeCount / size)));
		System.out.println(String.format("%.6f", (zeroCount / size)));
	}
}
