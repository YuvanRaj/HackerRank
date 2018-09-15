package com.hackerrank.algorithms.arrays;

public class TimeConversion {

	public static void main(String[] args) {
		String str = "01243";		
		String s = timeConversion("12:45:54PM");
		System.out.println(s);
	}

	private static String timeConversion(String s) {
		String type = s.substring(s.length() - 2, s.length());
		if ("PM".equals(type)) {
			String[] tokenArray = s.split(":");
			if(Integer.parseInt(tokenArray[0]) == 12){
				return  "12"+s.substring(2,s.length()-2);
			}
			String hour = String.valueOf(Integer.parseInt(tokenArray[0]) + 12);
			return hour + s.substring(2, s.length()-2);
		} else {
			String[] tokenArray = s.split(":");
			if(Integer.parseInt(tokenArray[0]) == 12){
				return  "00"+s.substring(2,s.length()-2);
			}
			return  s.substring(0,s.length()-2);
		}
	}

}
