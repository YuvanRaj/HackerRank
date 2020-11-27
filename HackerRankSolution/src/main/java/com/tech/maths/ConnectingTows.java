package com.tech.maths;

public class ConnectingTows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =4;
		int[] routes = new int[] {2,2,2};
		System.out.println(connectingTowns(n, routes));
	}
	
	/*
     * Complete the connectingTowns function below.
     */
    static int connectingTowns(int n, int[] routes) {
    	
    	int answer =1;
    	for(int i=0;i<routes.length;i++) {
    		answer = answer *routes[i]%1234567;
    	}
    	
		return answer;        
    }

}
