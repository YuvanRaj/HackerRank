package com.tech.maths;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MostDistant {

	/*
	 * Brute force - Two Loop - Outer and Inner find the max distance and return.
	 * Best Way -> maximum distance means Long x negative axis to x positive axis
	 * similarly maximum distance means Long y negative axis and Long y positive
	 * axis
	 */
	public static double solve(List<List<Integer>> coordinates) {
		Integer minConstX = Integer.MAX_VALUE;
		Integer maxConstX = Integer.MIN_VALUE;
		Integer minConstY = Integer.MAX_VALUE;
		Integer maxConstY = Integer.MIN_VALUE;

		int minX = 0;
		int minY = 0;
		
		

		for (int i = 0; i < coordinates.size(); i++) {
			List<Integer> points = coordinates.get(i);
			minX = points.get(0);
			minY = points.get(1);

			// X axis
			if (minX < minConstX) {
				minConstX = minX;
			}
			if (minX > maxConstX) {
				maxConstX = minX;
			}

			// Y axis
			if (minY < minConstY) {
				minConstY = minY;
			}
			
			if (minY > maxConstY) {
				maxConstY = minY;
			}
		}
	
		return calculateDistance(minConstX, maxConstX, minConstY, maxConstY);
	}

	private static double calculateDistance(int x1, int x2, int y1, int y2) {
		return Math.max(Math.max(x2 - x1, y2 - y1), Math.sqrt(
				square(Math.max(Math.abs(x1), Math.abs(x2))) + square(Math.max(Math.abs(y1), Math.abs(y2)))));
	}

	private static long square(int x) {
		return (long) x * x;
	}

	public static void main(String[] args) {
		List<List<Integer>> inList = new ArrayList<List<Integer>>();

		List<Integer> first = Arrays.asList(-1,0);
		List<Integer> second = Arrays.asList(1, 0);
		List<Integer> third = Arrays.asList(0, 1);
		List<Integer> fourth = Arrays.asList(0,-1);
		

		inList.add(first);
		inList.add(second);
		inList.add(third);
		inList.add(fourth);
		

		System.out.println(solve(inList));
	}

}
