package com.tech.maths;

import java.util.ArrayList;
import java.util.List;

public class DiagonalDifference {

	public static void main(String[] args) {
		List<List<Integer>> arr = new ArrayList<List<Integer>>();
		List<Integer> list = new ArrayList<Integer>();
		list.add(11);
		list.add(2);
		list.add(4);
		arr.add(list);

		list = new ArrayList<Integer>();
		list.add(4);
		list.add(5);
		list.add(6);
		arr.add(list);
		
		list = new ArrayList<Integer>();
		list.add(10);
		list.add(8);
		list.add(-12);
		arr.add(list);
		
		System.out.println(diagonalDifference(arr));
	}

	public static int diagonalDifference(List<List<Integer>> arr) {
	    
	int leftDiaSum =0;
	int rightDiaSum =0;
	int size = arr.size();
	int j=0;
		while(j < arr.size() && size > 0)
		{
			List<Integer> list= arr.get(j);
			leftDiaSum += list.get(j);
			rightDiaSum += list.get(size-1);
			size--;
			j++;
		}
		
		System.out.println("leftDiaSum "+leftDiaSum);
		System.out.println("rightDiaSum "+rightDiaSum);
		int result = leftDiaSum-rightDiaSum;
		result=result<0 ? result * -1 :result;
		return result;
    }
}
