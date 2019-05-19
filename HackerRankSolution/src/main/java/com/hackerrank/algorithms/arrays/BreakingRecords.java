package com.hackerrank.algorithms.arrays;

public class BreakingRecords {

	public static void main(String[] args) {
		int[] scores = {10,5,20,20,4,5,2,25,1};
		
		int[] result = breakingRecords(scores);
		
		System.out.println(result[0]);
		System.out.println(result[1]);

	}

	static int[] breakingRecords(int[] scores) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		int[] maxArray = new int[scores.length];
		int[] minArray = new int[scores.length];

		for (int i = 0; i < scores.length; i++) {
			if (scores[i] > max) {
				max = scores[i];
			}
			if (scores[i] < min) {
				min = scores[i];
			}
			maxArray[i] = max;
			minArray[i] = min;
		}

		int previous = maxArray[0];
		int counter = 0;
		int[] result = new int[2];

		for (Integer value : maxArray) {
			if (value > previous) {
				previous = value;
				counter++;
			}
		}
		result[0] = counter;

		previous = maxArray[0];
		counter = 0;

		for (Integer value : minArray) {
			if (value < previous) {
				previous = value;
				counter++;
			}
		}
		result[1] = counter;
		return result;
	}

}
