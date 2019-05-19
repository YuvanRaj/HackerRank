package com.hackerrank.algorithms.arrays;

import java.util.HashSet;

public class Pairs {

	public static void main(String[] str){
		int[] a = new int[]{1,2,3,4};
		int k =1;
		
		System.out.println(pairs(k, a));
		
	}
	
	static int pairs(int k, int[] arr) {
		HashSet<Integer> s = new HashSet<Integer>(); 
		int count = 0;
        for (int i=0; i<arr.length; ++i) 
        { 
            int temp = k-arr[i]; 
  
            // checking for condition 
            if (temp>=0 && s.contains(temp)) 
            { 
                count++;
            } 
            s.add(arr[i]); 
        }
		return count;


    }
}
