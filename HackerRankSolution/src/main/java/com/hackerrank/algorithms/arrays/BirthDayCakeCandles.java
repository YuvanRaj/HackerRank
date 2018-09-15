package com.hackerrank.algorithms.arrays;

import java.util.Arrays;
import java.util.Collections;

public class BirthDayCakeCandles {

	public static void main(String[] args) {
		Integer[] arr = { 3, 2, 1, 3 };
		System.out.println(birthdayCakeCandles(arr));
	}

	private static int birthdayCakeCandles(Integer[] arr) {
		if (arr.length == 1)
			return arr[0];
		else if (arr.length == 2)
			return arr[0] > arr[1] ? arr[0] : arr[1];

		Arrays.sort(arr, Collections.reverseOrder());
		int oldValue = arr[0];
		int count = 1;
		for (int i = 1; i < arr.length; i++) {
			if (oldValue == arr[i]) {
				count++;
			} else {
				break;
			}
		}
		return count;
	}

}
