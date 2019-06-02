package com.hackerrank.algorithms.arrays;

import java.util.PriorityQueue;

public class KthLargest {
	public static Integer largestK(int[] nums, int k) {
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>(k + 1);
		int i = 0;
		while (i < k) {
			queue.add(nums[i]);
			i++;
		}
		for (; i < nums.length; i++) {
			Integer value = queue.peek();
			if (nums[i] > value) {
				queue.poll();
				queue.add(nums[i]);
			}
		}
		return queue.peek();
	}

	public static void main(String[] args) {
		int array[] = new int[] { 3, 6, 2, 8, 9, 4, 5 };
		System.out.println(largestK(array, 4));
	}
}
