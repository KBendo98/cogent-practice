package com.cogent.exercises;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class SecondMinMax {
    public static void main(String[] args) {
        int[] arr = {32, 5, -3, -2, 1, 56, 4, 13};
        int[] res = secondMinMax(arr);
        
        System.out.println("Second Minimum: " + res[0]);
        System.out.println("Second Maximum: " + res[1]);
    }

    public static int[] secondMinMax(int[] nums) {
        //create an array to store the second min and max value
        int[] res = new int[2];
        
        // create a stream of integers from the input array
        IntStream stream = Arrays.stream(nums);
        
        // summary statistics of the stream
        IntSummaryStatistics stats = stream.summaryStatistics();

        // minimum and maximum values of the stats
        int max = stats.getMax();
        int min = stats.getMin();
        
        // set second max and second min to lowest and highest possible values
        int secondMax = Integer.MIN_VALUE;
        int secondMin = Integer.MAX_VALUE;
        
        // iterate through nums array
        for (int i : nums) {
            // if current number is greater than second max but less than max
            if (i > secondMax && i < max) {
                secondMax = i;
            }
            
            // if current number is less than second min but greater than min
            if (i < secondMin && i > min) {
                secondMin = i;
            }
        }
        
        // store second min and max in the created array
        res[0] = secondMin;
        res[1] = secondMax;
        
        // return results
        return res;
    }
}
