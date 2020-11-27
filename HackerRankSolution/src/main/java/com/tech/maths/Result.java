package com.tech.maths;

import java.util.ArrayList;
import java.util.List;

public class Result {

	public static void main(String[] args) {
		/*List<String> related = new ArrayList<String>();
		related.add("10000");
		related.add("01000");
		related.add("00100");
		related.add("00010");
		related.add("00001");
		
		System.out.println(countGroups(related));*/
		
		Float f1 = new Float("3.0");
		int  x = f1.intValue();
		byte  b = f1.byteValue();
		double d = f1.doubleValue();
		System.out.println(x+b+d);
	}
	
	public static int countGroups(List<String> related) {
	    int n = related.size();
	    Result uf = new Result(n);
	    for (int r = 0; r < n; r++) {
	        String row = related.get(r);
	        for (int c = 0; c < n; c++) {
	            if (row.charAt(c) == '1') {
	                uf.union(r, c);
	            }
	        }
	    }
	    return uf.size();
	}

	
	    private int[] parent;
	    private byte[] rank;
	    private int size;

	    public Result(int n) {
	        if (n < 0) throw new IllegalArgumentException();
	        parent = new int[n];
	        rank = new byte[n];
	        for (int i = 0; i < n; i++) {
	            parent[i] = i;
	        }
	        size = n;
	    }

	    public int find(int p) {
	        while (p != parent[p]) {
	            parent[p] = parent[parent[p]];
	            p = parent[p];
	        }
	        return p;
	    }

	    public void union(int p, int q) {
	        int pr = find(p);
	        int qr = find(q);
	        if (pr == qr) return;
	        if (rank[pr] < rank[qr]) {
	            parent[pr] = qr;
	        } else {
	            parent[qr] = pr;
	            if (rank[pr] == rank[qr]) rank[pr]++;
	        }
	        size--;
	    }

	    public int size() {
	        return size;
	    }
	

}
