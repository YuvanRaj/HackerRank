package com.hackerrank.algorithms.arrays;
class Test 
{ 
    static int arr[] = new int[]{3,2,1,4,5}; 
      
    public static int answer(int[] list) {
        int maxHeight = 0;
        int previousHeight = 0;
        int previousHeightIndex = 0;
        int coll = 0;
        int temp = 0;

        // find the first peak (all water before will not be collected)
        while(list[previousHeightIndex] > maxHeight) {
            maxHeight = list[previousHeightIndex];
            previousHeightIndex++;
            if(previousHeightIndex==list.length)            // in case of stairs (no water collected)
                return coll;
            else
                previousHeight = list[previousHeightIndex];
        }

        for(int i = previousHeightIndex; i<list.length; i++) {
            if(list[i] >= maxHeight) {      // collect all temp water
                coll += temp;
                temp = 0;
                maxHeight = list[i];        // new max height
            }
            else {
                temp += maxHeight - list[i];
                if(list[i] > previousHeight) {  // we went up... collect some water
                    int collWater = (i-previousHeightIndex)*(list[i]-previousHeight);
                    coll += collWater;
                    temp -= collWater;
                }
            }

            // previousHeight only changes if consecutive towers are not same height
            if(list[i] != previousHeight) {
                previousHeight = list[i];
                previousHeightIndex = i;
            }
        }
        return coll;
    }
      
    // Driver method to test the above function 
    public static void main(String[] args)  
    { 
          
        System.out.println("Maximum water that can be accumulated is " +  
        		answer(arr)); 
    } 
} 