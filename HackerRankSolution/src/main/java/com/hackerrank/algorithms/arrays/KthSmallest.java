package com.hackerrank.algorithms.arrays;

import java.util.PriorityQueue;

public class KthSmallest {

	public static void main(String[] args) {
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();

		queue.offer(25);
		queue.offer(5);
		queue.offer(13);
		
		int[] array = new int[]{11,25,5,13,50,12,2};
		System.out.println(findKthSmallestElement(array, 3));

	}

	public static int findKthSmallestElement(int[] array, int k) {
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
		for (int i = 0; i < array.length; i++) {
			priorityQueue.offer(array[i]);
		}
		int currentNo = 0;
		while (k > 0) {
			currentNo = priorityQueue.poll();
			k--;
		}
		return currentNo;
	}
}
