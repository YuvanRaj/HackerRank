package com.hackerrank.algorithms.arrays;

public class MagicSquare {

	static int[][][] possiblePermutations = { { { 8, 1, 6 }, { 3, 5, 7 }, { 4, 9, 2 } },
			{ { 6, 1, 8 }, { 7, 5, 3 }, { 2, 9, 4 } }, { { 4, 9, 2 }, { 3, 5, 7 }, { 8, 1, 6 } },
			{ { 2, 9, 4 }, { 7, 5, 3 }, { 6, 1, 8 } }, { { 8, 3, 4 }, { 1, 5, 9 }, { 6, 7, 2 } },
			{ { 4, 3, 8 }, { 9, 5, 1 }, { 2, 7, 6 } }, { { 6, 7, 2 }, { 1, 5, 9 }, { 8, 3, 4 } },
			{ { 2, 7, 6 }, { 9, 5, 1 }, { 4, 3, 8 } }, };

	static int formingMagicSquare(int[][] s) {
		int minCost = Integer.MAX_VALUE;
		for (int x = 0; x < possiblePermutations.length; x++) {
			int actualCost = 0;
			for (int i = 0; i < s.length; i++) {
				for (int j = 0; j < s.length; j++) {
					actualCost = actualCost+((s[i][j] - possiblePermutations[x][i][j]) > 0 ? s[i][j] - possiblePermutations[x][i][j]: -1*(s[i][j] - possiblePermutations[x][i][j]));
				}				
			}
			if (actualCost < minCost) {
				minCost = actualCost;
			}
		}
		return minCost;
	}

	public static void main(String[] args) {
		int[][] s = { { 4, 8, 2 }, { 4, 5, 7 }, { 6, 1, 6 } };
		System.out.println(formingMagicSquare(s));
	}

}
