package com.hackerrank.algorithms.arrays;

import java.util.HashMap;
import java.util.Map;

public class TimeInWords {

	public static Map<Integer, String> map = new HashMap<Integer, String>();

	static {

		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		map.put(4, "four");
		map.put(5, "five");
		map.put(6, "six");
		map.put(7, "seven");
		map.put(8, "eight");
		map.put(9, "nine");
		map.put(10, "ten");
		map.put(11, "eleven");
		map.put(12, "twelve");
		map.put(13, "thirteen");
		map.put(14, "fourteen");
		map.put(15, "quarter");
		map.put(16, "sixteen");
		map.put(17, "seventeen");
		map.put(18, "eighteen");
		map.put(19, "nineteen");
		map.put(20, "twenty");
		map.put(21, "twenty one");
		map.put(22, "twenty two");
		map.put(23, "twenty three");
		map.put(24, "twenty four");
		map.put(25, "twenty five");
		map.put(26, "twenty six");
		map.put(27, "twenty seven");
		map.put(28, "twenty eight");
		map.put(29, "twenty nine");
		map.put(30, "half");
	}

	public static void main(String[] args) {
		System.out.println(timeInWords(1, 1));

	}

	// Complete the timeInWords function below.
	static String timeInWords(int h, int m) {
		StringBuilder builder = new StringBuilder();

		if (m == 0) {
			builder.append(map.get(h));
			builder.append(" o\' clock");
		} else if (m >= 1 && m <= 30) {
			builder.append(map.get(m));
			if (m == 1) {
				builder.append(" minute past " + map.get(h));
			}
			else if (m % 15 != 0) {
				builder.append(" minutes past " + map.get(h));
			} else {
				builder.append(" past " + map.get(h));
			}
		} else if (m > 30) {
			int balance = 60 - m;
			builder.append(map.get(balance));

			if (balance == 1) {
				builder.append(" minute to " + map.get(h));
			}
			else if (balance % 15 != 0) {
				builder.append(" minutes to " + map.get(h + 1));
			} else {
				builder.append(" to " + map.get(h + 1));
			}
		}

		return builder.toString();
	}

}
