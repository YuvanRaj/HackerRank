package com.hackerrank.algorithms.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PickingNumbers {

	public static void main(String[] args) {
		List<Integer> inList = Arrays.asList(4,6,5,3,3,1);
		System.out.println(pickingNumbers(inList));
	}

	public static int pickingNumbers(List<Integer> a) {
		Collections.sort(a);
		int counter = 1;
		int maxiumCount = Integer.MIN_VALUE;
		for (int i = 0; i < a.size(); i++) {
			if (i == a.size() - 1) {				
				break;
			}
			if (a.get(i + 1) - a.get(i) <= 1) {
				counter++;
			} else {
				if (counter > maxiumCount) {
					maxiumCount = counter;
					counter = 1;
				}
			}
		}
		return counter;
	}

}
