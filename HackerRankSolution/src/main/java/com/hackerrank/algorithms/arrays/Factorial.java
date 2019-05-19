package com.hackerrank.algorithms.arrays;

import java.math.BigInteger;

public class Factorial {

	public static void main(String[] args) {
		extraLongFactorials(25);

	}

	// Complete the extraLongFactorials function below.
	static void extraLongFactorials(int n) {
		BigInteger value = getFactorial(new BigInteger(String.valueOf(n)));
		System.out.println(value);
	}

	public static BigInteger getFactorial(BigInteger n) {
		BigInteger x = new BigInteger("1");

		if (n.compareTo(x) == 0) {
			return x;
		}

		return n.multiply(getFactorial(n.subtract(x)));
	}

}
