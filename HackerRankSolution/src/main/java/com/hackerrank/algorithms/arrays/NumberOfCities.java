package com.hackerrank.algorithms.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberOfCities {

	static int gcd(int a, int b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}

	static boolean isGCD(int a, int g) {
		for (int i = 1; i <= a; i++) {
			int div = a % i;
			if (div == 0 && i > g)
				return true;
		}
		return false;
	}

	// Driver method
	public static void main(String[] args) {
		int n = 10;
		int g = 1;
		List<Integer> originCities = new ArrayList<Integer>(Arrays.asList(10, 4, 3, 6));
		List<Integer> destinationCities = new ArrayList<Integer>(Arrays.asList(3, 6, 2, 9));
		System.out.println(connectedCities(n, g, originCities, destinationCities));
	}

	public static List<Integer> connectedCities(int n, int g, List<Integer> originCities,
			List<Integer> destinationCities) {
		List<Integer> value = new ArrayList<Integer>();
		for (int i = 0; i < originCities.size(); i++) {
			int a = originCities.get(i);
			int b = destinationCities.get(i);			
			if (isGCD(a, g) && isGCD(b, g)) {
				value.add(1);
			} else {
				value.add(0);
			}
		}
		return value;
	}

}
