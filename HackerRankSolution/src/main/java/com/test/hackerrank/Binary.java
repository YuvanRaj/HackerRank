package com.test.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Binary {

	public static void main(String str[]) {
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(5);
		arr.add(2);
		arr.add(1);
		arr.add(4);
		arr.add(3);

		System.out.println(findNumber(arr, -5));
	}

	// Complete the findNumber function below.
	static String findNumber(List<Integer> arr, int k) {
		Collections.sort(arr);
		int l = 0;
		int r = arr.size()-1;
		String value = binarySearch(arr, l, r, k);
		return value;
	}

	public static String binarySearch(List<Integer> arr, int l, int r, int k) {
		if (r >= l) {
			int mid = l + (r - l) / 2;

			// If the element is present at the
			// middle itself
			if (arr.get(mid) == k)
				return "YES";

			// If element is smaller than mid, then
			// it can only be present in left subarray
			if (arr.get(mid) > k)
				return binarySearch(arr, l, mid - 1, k);

			// Else the element can only be present
			// in right subarray
			return binarySearch(arr, mid + 1, r, k);
		}

		// We reach here when element is not present
		// in array
		return "NO";
	}

}
