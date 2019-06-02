package com.hackerrank.algorithms.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class HackathanSnapDeal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		int[] input = new int[N];
		for (int i = 0; i < N; i++) {
			input[i] = sc.nextInt();
		}

		for (int i = 1; i <= Q; i++) {
			int X = sc.nextInt();
			int K = sc.nextInt();
			int TYPE = sc.nextInt();
			int[] y = getNewArray(input, X, TYPE);
			if (TYPE == 0) {
				System.out.println(findKthSmallestElement(y, K));
			} else {
				System.out.println(largestK(y, K));
			}
		}
		sc.close();
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

	private static int[] getNewArray(int[] input, int x, int fact) {
		List<Integer> list = new ArrayList();

		if (fact == 0) {
			for (int i = 0; i < input.length; i++) {
				if (input[i] > x) {
					list.add(input[i]);
				}
			}
		} else {
			for (int i = 0; i < input.length; i++) {
				if (input[i] < x) {
					list.add(input[i]);
				}
			}
		}

		int[] primitive = list.stream().mapToInt(Integer::intValue).toArray();
		return primitive;
	}

}
