package com.test.hackerrank;

import java.text.DecimalFormat;

public class Testing {

	private static DecimalFormat df2 = new DecimalFormat("###.000000");
	
	public static void main(String[] args) {
		double n = 6;
		double d = 6;
		double val = n/d;
		/*if(d%n == 0){
			String val = String.valueOf(n/d);
			String[] valArr = val.split(".");
			int length = valArr[1].length();
			String formatString = 
			
		}*/
		String str = String.format("%.6f", val);
		System.out.println(str);
		//System.out.println(df2.format(n/d));
		

	}

}
