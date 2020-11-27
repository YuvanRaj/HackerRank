package com.tech.maths;

import java.util.Arrays;

public class HackerRank1 {
	static final int MAX_CHARS = 256;

	public static void main(String[] args) {
		String str = "dabbcabcd"; 
		System.out.println(fewestCoins(str));
	}

	
	
	public static int fewestCoins(String coins) {
		
		int n = coins.length(); 
		  
       
        int dist_count = 0; 
  
        boolean[] visited = new boolean[MAX_CHARS]; 
        Arrays.fill(visited, false); 
        for (int i = 0; i < n; i++) { 
            if (visited[coins.charAt(i)] == false) { 
                visited[coins.charAt(i)] = true; 
                dist_count++; 
            } 
        } 
  
       
        int start = 0, start_index = -1; 
        int min_len = Integer.MAX_VALUE; 
  
        int count = 0; 
        int[] curr_count = new int[MAX_CHARS]; 
        for (int j = 0; j < n; j++) { 
          
            curr_count[coins.charAt(j)]++; 
  
           
            if (curr_count[coins.charAt(j)] == 1) 
                count++; 
  
          
            if (count == dist_count) {                
                while (curr_count[coins.charAt(start)] > 1) { 
                    if (curr_count[coins.charAt(start)] > 1) 
                        curr_count[coins.charAt(start)]--; 
                    start++; 
                } 
  
              
                int len_window = j - start + 1; 
                if (min_len > len_window) { 
                    min_len = len_window; 
                    start_index = start; 
                } 
            } 
        }     
        int distinctCount =  coins.substring(start_index, start_index + min_len).length(); 
        return distinctCount;
  
	}
}
