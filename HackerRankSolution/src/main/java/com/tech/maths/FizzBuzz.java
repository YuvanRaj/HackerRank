package com.tech.maths;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void fizzBuzz(int n) {
	    if(n %15 == 0)
	    	System.out.println("FizzBuzz");
	    else if(n %5 == 0)
	    	System.out.println("Fizz");
	    else if(n %3 == 0)
	    	System.out.println("Buzz");
	    else
	    	System.out.println(n);

	}
}
