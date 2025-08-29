package dev.medium;

// 2560. House Robber IV
// We can change this problem.
// minimum capability to rob k houses
// so that we should find that minimum capability to rob k houses
// to do this we can use binary search
// find max and min in the array
// then if we can rob k houses with some capability, then we can try with less capability
// if we can't rob k houses with some capability, then we need to try with more capability
// So the problem is find min capability to rob k houses
// we can't still rob two adjacent houses
// so we also need to avoid adjacent houses
// it is not just a simple binary search
// Even if we find a capability, we need to check if we can rob k houses smaller than that capability
public class LeetCode2560 {
    public int minCapability(int[] nums, int k) {

        return 0;
    }
}
