package com.test.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		List<Integer> inputNumbers = new ArrayList<Integer>();

		for (int i = 1; i <= t; i++) {
			inputNumbers.add(sc.nextInt());
		}
		sc.close();
		printArmStrongNumber(inputNumbers);

	}

	private static void printArmStrongNumber(List<Integer> inputNumbers) {
		for (Integer n : inputNumbers) {
			int digit = n;
			int digitCount = String.valueOf(digit).length();
			int sum = 0;
			while (0 < digit) {
				int remainder = digit % 10;
				sum = sum + getPower(remainder, digitCount);
				digit = digit / 10;
			}
			if (sum == n)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}

	private static int getPower(int remainder, int digitCount) {
		int b = digitCount / 2;
		int result = 1;
		for (int i = 1; i <= b; i++) {
			result *= remainder;
		}
		result = result * result;
		int finalResult = (digitCount % 2 == 0) ? result : result * remainder;
		return finalResult;
	}

}
