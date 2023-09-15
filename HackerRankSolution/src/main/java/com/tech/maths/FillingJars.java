package com.tech.maths;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FillingJars {

	public static void main(String[] args) {
		int[][] operations = { { 1, 2, 10 }, { 2, 5, 100 }, { 3, 4, 100 } };
		List<Integer> list1 = Arrays.asList(1, 2, 10);
		List<Integer> list2 = Arrays.asList(3, 5, 10);
		//List<Integer> list3 = Arrays.asList(3, 4, 100);

		List<List<Integer>> inList = new ArrayList<List<Integer>>();
		inList.add(list1);
		inList.add(list2);
	//	inList.add(list3);

		System.out.println(solve(5, inList));
	}

	// Complete the solve function below.
	/**
	 * (No of elements to be added with indices)* k
	 * 
	 * @param n
	 * @param operations
	 * @return
	 */

	public static int solve(int n, List<List<Integer>> operations) {
		int[] resultArr = new int[n];
		for (int i = 0; i < operations.size(); i++) {
			int startIndex = operations.get(i).get(0) - 1;
			int endIndex = operations.get(i).get(1) - 1;
			int val = operations.get(i).get(2);
			for (int m = startIndex; m <= endIndex; m++) {
				resultArr[m] = resultArr[m] + val;
			}
		}
		return getAverage(resultArr);
	}

	private static int getAverage(int[] resultArr) {
		int sum =0;
		for(Integer val:resultArr) {
			sum += val;
		}
		return (sum/resultArr.length);
	}

}
