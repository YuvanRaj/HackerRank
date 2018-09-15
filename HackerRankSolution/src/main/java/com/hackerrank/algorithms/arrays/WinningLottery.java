package com.hackerrank.algorithms.arrays;

import java.util.HashSet;
import java.util.Set;

public class WinningLottery {

	public static void main(String[] args) {
		String[] tickets = { "129300455", "5559948277", "012334556", "56789", "123456879" };
		System.out.println(winningLotteryTicket(tickets));
	}

	static long winningLotteryTicket(String[] tickets) {
		Set<Integer> set = new HashSet<Integer>();
		long counter = 0;
		for (int i = 0; i < tickets.length-1; i++) {
			set = new HashSet<Integer>();
			for (int j = i + 1; j <= tickets.length-1; j++) {
				set = new HashSet<Integer>();
				String input = tickets[i] + tickets[j];
				for (int k = 0; k < input.length(); k++) {
					set.add(Integer.parseInt(String.valueOf(input.charAt(k))));
					if (set.size() == 10) {						
						counter++;
						break;
					}
				}
			}
		}
		return counter;
	}
}
