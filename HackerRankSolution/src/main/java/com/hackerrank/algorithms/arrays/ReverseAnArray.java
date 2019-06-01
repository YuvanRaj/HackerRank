package com.hackerrank.algorithms.arrays;

public class ReverseAnArray {

	public static void main(String[] args) {
		int[] a = new int[] { 1,2,3,4,5,6 };
		printArray(a);

		int[] b = reverseAnArray(a, a.length);
		printArray(b);
	}
	
	private static void printArray(int[] a) {
		for (int value : a) {
			System.out.print(value);
		}
		System.out.println("\n");
	}

	public static int[] reverseAnArray(int[] a,int n){
		int start =0;
		int end = n-1;
		int temp;
		while(start<end){
			temp = a[start];
			a[start]=a[end];
			a[end] = temp;
			start++;
			end--;
		}
		return a;
	}
}
