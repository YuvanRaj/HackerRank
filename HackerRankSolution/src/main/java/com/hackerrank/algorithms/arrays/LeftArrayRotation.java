package com.hackerrank.algorithms.arrays;

public class LeftArrayRotation {
	public static void main(String[] args) {

		int[] a = new int[]{1,2,3,4,5};

		int[] b = new int[a.length];

		int d = 2;

		int n = a.length;


		for(int i=0;i<n;i++)

		{

		   // Add the element n-d (5-2) =  3 

			// Substarct it for remaining d elements

		   b[i] = a[(i-d) < 0 ? n + (i-d) : (i-d)];

		   System.out.println(b[i]);

		}

	}
}
