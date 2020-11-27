package com.tech.maths;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StrongPassword {

	public static void main(String[] args) {
		String password = "ackeRrank";
		System.out.println(isUpperCaseNotPresent(password));
		System.out.println(minimumNumber(password.length(), password));
	}

	static int minimumNumber(int n, String password) {
		// Check length criteria
		int result = 0;
		if (n < 6) {
			int count = 6 - n;
			int validCount = getCount(password);
			int balancecharater = count - validCount;

			result = balancecharater + validCount;
		} else {
			result = getCount(password);

		}
		return result;

	}

	private static int getCount(String password) {
		int minimumNumber = 0;
		if (isDigitNotPresent(password)) {
			minimumNumber++;
		}
		if (isUpperCaseNotPresent(password)) {
			minimumNumber++;
		}
		if (isLowerCaseNotPresent(password)) {
			minimumNumber++;
		}
		if (isSplCharNotPresent(password)) {
			minimumNumber++;
		}
		return minimumNumber;
	}

	private static boolean isDigitNotPresent(String password) {
		Pattern p = Pattern.compile("^(?=.*\\d).+$", Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(password);
		boolean isPresent = m.find();

		if (isPresent) {
			return false;
		} else {
			return true;
		}
	}

	private static boolean isUpperCaseNotPresent(String password) {
		Pattern p = Pattern.compile("^(?=.*[A-Z]).+$", Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(password);
		boolean isPresent = m.find();

		if (isPresent) {
			return false;
		} else {
			return true;
		}
	}

	private static boolean isLowerCaseNotPresent(String password) {
		Pattern p = Pattern.compile("^(?=.*[a-z]).+$", Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(password);
		boolean isPresent = m.find();

		if (isPresent) {
			return false;
		} else {
			return true;
		}
	}

	private static boolean isSplCharNotPresent(String password) {
		// Pattern p = Pattern.compile("!@#$%^&*()-+", Pattern.CASE_INSENSITIVE);
		Pattern special = Pattern.compile("[!@#$%&*()_+]");
		Matcher m = special.matcher(password);
		boolean isPresent = m.find();

		if (isPresent) {
			return false;
		} else {
			return true;
		}
	}

}
