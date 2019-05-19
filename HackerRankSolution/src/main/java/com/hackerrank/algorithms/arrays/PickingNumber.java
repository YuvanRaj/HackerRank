package com.hackerrank.algorithms.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PickingNumber {

	public static void main(String[] args) {
		List<Integer> a = Arrays.asList(1,2,2,3,1,2);
		System.out.println(pickingNumbers(a));
	}

	public static int pickingNumbers(List<Integer> a) {
		Collections.sort(a);
		int minimum = a.get(0);
		int maximum = a.get(a.size() - 1);
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();

		for (Integer value : a) {
			if (map.get(value) != null) {
				int previous = map.get(value) + 1;
				map.put(value, previous);
			} else {
				map.put(value, 1);
			}
		}

		populateBalanceKey(map, minimum, maximum);

		int previousValue = 0;
		int count = 0;
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			int currentValue = entry.getValue();

			if ((previousValue + currentValue) > count) {
				count = (previousValue + currentValue);
			}

			previousValue = entry.getValue();
		}
		return count;
	}

	private static void populateBalanceKey(Map<Integer, Integer> map, int minimum, int maximum) {
		for (int i = minimum; i <= maximum; i++) {
			if (!map.containsKey(i)) {
				map.put(i, 0);
			}
		}

	}

}
