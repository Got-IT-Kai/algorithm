package dev.hard;

import java.util.Arrays;

// 2551. Put Marbles in Bags
// To solve this problem, we need to understand how to get maximum and minimum scores
// by partitioning the weights array into k contiguous subarrays.
// The score of a partition is defined as sum between each pair of adjacent subarrays.
// for the sum of result we don't need to think about the first and the last element because it is difference between max and min
// the max and the min will always include the first and the last element
// so we can ignore them and just think about the middle elements
// if we sort the parts array we can easily get the largest and the smallest elements
// then we can calculate the result by subtracting the smallest from the largest
public class LeetCode2551 {
    public long putMarbles(int[] weights, int k) {
        if (k == weights.length) {
            return 0L;
        }
        int[] parts = new int[weights.length - 1];

        for (int i = 0; i < parts.length; ++i) {
            parts[i] = weights[i] + weights[i + 1];
        }

        Arrays.sort(parts);

        long result = 0L;
        for (int i = 0, len = k - 1; i < len; ++i) {
            result += parts[parts.length - 1 - i] - parts[i];
        }

        return result;
    }
}
