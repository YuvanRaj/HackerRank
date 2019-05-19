package com.hackerrank.algorithms.arrays;

public class ArrayTest {

	public static void main(String[] args) {
		int[] a = new int[] { 1, 2, 3 };
		int[] b = a.clone();
		
		System.out.println(a==b);
		test(a);
		for (Integer val : a) {
			System.out.println(val);
		}

	}

	public static void test(int[] a)

	{
		a[1] = 4;
	}

}
