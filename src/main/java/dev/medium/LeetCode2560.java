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
// for the edges
// when the capability is max
// when the k is 1
// when the min and max are same
// when the min and max are repeated
// when the small numbers and large numbers are repeated
public class LeetCode2560 {
    public int minCapability(int[] nums, int k) {
        int min = nums[0];
        int max = nums[0];

        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        while (min <= max) {
            int mid = min + (max - min) / 2;
            if (canRob(nums, k, mid)) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }

        return min;
    }

    private boolean canRob(int[] nums, int k, int mid) {
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] <= mid) {
                --k;
                ++i;
            }

            if (k == 0) {
                return true;
            }
        }

        return false;
    }
}
