package com.tech.maths;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] str) {
		List<List<Integer>> samples = getSamples();
		int size = samples.get(0).size();
		int M[][] = new int[size][size];

		int i = 0;
		int j = 0;
		for (List<Integer> list : samples) {
			for (Integer val : list) {
				M[i][j] = val;
				j++;
			}
			j=0;
			i++;
		}
		
		printMaxSubSquare(M);
		
	}

	static int printMaxSubSquare(int M[][]) 
    { 
        int i,j; 
        int R = M.length;         //no of rows in M[][] 
        int C = M[0].length;     //no of columns in M[][] 
        int S[][] = new int[R][C];      
          
        int max_of_s, max_i, max_j;  
      
        /* Set first column of S[][]*/
        for(i = 0; i < R; i++) 
            S[i][0] = M[i][0]; 
      
        /* Set first row of S[][]*/
        for(j = 0; j < C; j++) 
            S[0][j] = M[0][j]; 
          
        /* Construct other entries of S[][]*/
        for(i = 1; i < R; i++) 
        { 
            for(j = 1; j < C; j++) 
            { 
                if(M[i][j] == 1)  
                    S[i][j] = Math.min(S[i][j-1], 
                                Math.min(S[i-1][j], S[i-1][j-1])) + 1; 
                else
                    S[i][j] = 0; 
            }  
        }      
          
        /* Find the maximum entry, and indexes of maximum entry  
            in S[][] */
        max_of_s = S[0][0]; max_i = 0; max_j = 0; 
        for(i = 0; i < R; i++) 
        { 
            for(j = 0; j < C; j++) 
            { 
                if(max_of_s < S[i][j]) 
                { 
                    max_of_s = S[i][j]; 
                    max_i = i;  
                    max_j = j; 
                }      
            }                  
        }      
          
        int count=0;
        for(i = max_i; i > max_i - max_of_s; i--) 
        { 
        	count++;
            for(j = max_j; j > max_j - max_of_s; j--) 
            { 
                System.out.print(M[i][j] + " "); 
            }  
            System.out.println(); 
        } 
        return count;
    }
	
	private static List<List<Integer>> getSamples() {
		List<List<Integer>> samples = new ArrayList<List<Integer>>();
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(1);
		list.add(1);
		samples.add(list);
		
		list = new ArrayList<Integer>();
		list.add(1);
		list.add(1);
		list.add(0);
		samples.add(list);
		
		list = new ArrayList<Integer>();
		list.add(1);
		list.add(0);
		list.add(1);
		samples.add(list);
		
		
		return samples;
	}
}
