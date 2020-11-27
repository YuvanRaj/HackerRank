package com.tech.maths;

import java.math.BigDecimal;
import java.math.BigInteger;

public class FillingJars {

	public static void main(String[] args) {
		int[][] operations = {{1, 2,100}, {2, 5,100},{3,4,100}};
		System.out.println(solve(5, operations));
	}
	
	// Complete the solve function below.
	/**
	 * (No of elements to be added with indices)* k 
	 * @param n
	 * @param operations
	 * @return
	 */
    static long solve(int n, int[][] operations) {    	    	
    	long sum = 0;
    	for(int i=0;i<operations.length;i++){
    		long a =operations[i][0];
    		long b =operations[i][1];
    		long k =operations[i][2];
    		
    		sum += ((b-a)+1)*k;
    		
    		
    			
    	}
    	sum = Math.round(sum/n);
    	return sum;
    }

}
