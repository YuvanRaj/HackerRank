package com.hackerrank.algorithms.arrays;

/**
 * Own Sqrt Java Class which determines the square root of the give number by single decimal place
 * @author Yuvaraj
 *
 */
public class Sqrt {

	public static void main(String[] str) {		
		for (int i = 2; i <= 30; i++) {
			System.out.println("For Number = " + i + "\t Single Decimal SQRT Own Function = " + sqrt(i)
					+ "\t SQRT MathUtil Function = " + Math.sqrt(i));
		}
	}
	/**
	 * <p>Method will do sqrt of given number by single decimal place</p>
	 * @author Yuvaraj
	 * @param x
	 * @return double
	 */
	public static double sqrt(int x) {
		int whole = 0;
		for (int i = 2; i <= 100; i++) {
			if (i * i > x) {
				whole = i - 1;
				break;
			}
			if (i * i == x) {
				return Double.valueOf(String.valueOf(i));
			}
		}
		int remaind = (x - (whole * whole)) * 100;
		int firstFraction = 0;
		int firstFractionFact = 2 * whole * 10;

		for (int j = 1; j <= 9; j++) {
			int temp = firstFractionFact + j;
			if (temp * j > remaind) {
				firstFraction = j - 1;
				break;
			}
		}
		StringBuilder builder = new StringBuilder();
		builder.append(whole);
		builder.append(".");
		builder.append(firstFraction);

		double value = Double.parseDouble(builder.toString());
		return value;
	}
}
