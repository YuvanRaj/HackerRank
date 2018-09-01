package com.hackerrank.algorithams.string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SherlockAndValidString {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String result = isValid(s);
		System.out.println(result);
		sc.close();
	}

	public static String isValid(String value) {
		Map<Character, Integer> characterMapCount = new HashMap<Character, Integer>();
		int counter = 1;
		int oldValue = 0;
		boolean firstTime = false;
		boolean isValid = true;
		int count = 0;
		for (int i = 0; i < value.length(); i++) {
			if (characterMapCount.get(value.charAt(i)) != null) {
				count = characterMapCount.get(value.charAt(i)) + 1;
				characterMapCount.put(value.charAt(i), count);
			} else {
				count = 1;
				characterMapCount.put(value.charAt(i), count);
			}
		}
		for (Map.Entry<Character, Integer> entry : characterMapCount.entrySet()) {
			int charCount = entry.getValue();
			if (counter == 1) {
				oldValue = charCount;
			} else if (oldValue != charCount && !firstTime) {
				if (charCount - 1 == oldValue) {
					firstTime = true;
				} else if (oldValue > 1 && counter != characterMapCount.size()) {
					isValid = false;
					break;
				}

			} else if (oldValue != charCount && firstTime) {
				isValid = false;
				break;
			}
			counter++;
		}
		if (isValid) {
			return "YES";
		} else {
			return "NO";
		}
	}
}
