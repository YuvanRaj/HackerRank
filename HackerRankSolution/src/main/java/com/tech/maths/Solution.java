package com.tech.maths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

class Cell {
    public int x, y, h; /* axis and height */
    Cell() {}
    Cell(int xx, int yy, int hh) {
        x = xx;
        y = yy;
        h = hh;
    }
}
/* Comparing Cell with the heights */
class CellComparator implements Comparator<Cell> {
    @Override
    public int compare(Cell x, Cell y) {
        if (x.h > y.h) {
            return 1;
        } else if (x.h == y.h) {
            return 0;
        } else {
            return -1;
        }
    }
}

public class Solution {
    /*
        Pouring water from outside to inside. Treat the pillars as the buckets
        The time complexity for this problem is :
        O(2n + 2m) + O(n*m log(2n + 2m)) =
        
            n*m log(n + m) where m and n are the rows and columns of the matrix
     */
    
    
    public static void main(String[] str) {
    	//int heights[][]={{0,1,1,0},{1,0,1,0},{1,0,0,1},{1,1,1,1}};
    	
    	int heights[][]=getArray();
    	System.out.println(trapRainWater(heights));
    	
    }
    
    private static int[][] getArray() {
    	Scanner s = new Scanner(System.in);
    	int row = s.nextInt();
    	int column = s.nextInt();
    	int[][] input = new int[row][column];
    	List<String> test = new ArrayList<String>();
    	
    	for(int i=0;i<row;i++) {
    		String x= s.nextLine();
    		if(i == row-1) {
    			x = s.next();
    		}
    		if(!x.isEmpty())
    			test.add(x);
    	}
    	
    	for(int i=0;i<row;i++) {
    		for(int j=0;j<column;j++) {
    			String value = test.get(i);
    			Character ch = value.charAt(j);
    			if("*".equals(Character.toString(ch))) {
    				input[i][j] = 1;
    			}
    			else if(".".equals(Character.toString(ch))) {
    				input[i][j] = 0;    				
    			}
    		}
    	}
    	
		return input;
	}

	public static int trapRainWater(int[][] heights) {
    	int[] dx = {1, -1, 0, 0}; /* For traversal */
        int[] dy = {0, 0, 1, -1};  
        if (heights.length == 0) {
            return 0;
        }
        PriorityQueue<Cell> heap = new PriorityQueue<>(new CellComparator());
        int m = heights.length;
        int n = heights[0].length;
        int[][] visit = new int[m][n];

        /* Just draw a matrix and traverse */
        for (int i = 0; i < m; i++) {
            heap.offer(new Cell(i, 0, heights[i][0])); /* left most col */
            heap.offer(new Cell(i, n - 1, heights[i][n - 1])); /* rightmost col */

            visit[i][0] = 1;
            visit[i][n - 1] = 1;
        }

        for (int i = 0; i < n; i++) {
            heap.offer(new Cell(0, i, heights[0][i]));
            heap.offer(new Cell(m - 1, i, heights[m - 1][i]));

            visit[0][i] = 1;
            visit[m - 1][i] = 1;
        }

        int ans = 0;
        /* Traverse neighbors from outside to inside */
        while (!heap.isEmpty()) {
            Cell now = heap.poll();

            for (int i = 0; i < 4; i++) {
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];
                if (nx >= 0 && nx < m && ny >= 0 && ny < n && visit[nx][ny] == 0) {
                    visit[nx][ny] = 1;
                    heap.offer(new Cell(nx, ny, Math.max(now.h, heights[nx]
                        [ny]))); /* Note that we should update the height */
                    ans += Math.max(0, now.h - heights[nx][ny]);
                }
            }
        }
        return ans;
    }
}