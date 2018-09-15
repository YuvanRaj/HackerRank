package com.hackerrank.algorithms.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinPower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> p = new ArrayList<Integer>(Arrays.asList(10, 4, 3, 6));
		System.out.println(minPower(p));
	}

	public static int minPower(List<Integer> p) {
		int sum = 0;
		for (Integer x : p) {
			sum = sum + x;
		}
		if (1 - sum < 0) {
			return 1;
		}
		return 1 - sum;
	}

}
