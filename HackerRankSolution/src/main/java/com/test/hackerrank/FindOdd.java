package com.test.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class FindOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> op = oddNumbers(3, 100);

		for (Integer value : op) {
			System.out.println(value);
		}
	}

	private static List<Integer> oddNumbers(int l, int r) {
		List<Integer> oddNumbers = new ArrayList<Integer>();
		boolean isOdd = l % 2 != 0 ? true : false;
		if (isOdd)
			for (int i = l; i <= r; i = i + 2) {
				oddNumbers.add(i);
			}
		else {
			for (int i = l + 1; i <= r; i = i + 2) {
				oddNumbers.add(i);
			}
		}
		return oddNumbers;
	}

}
