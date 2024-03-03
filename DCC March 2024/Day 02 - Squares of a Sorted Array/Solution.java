// Problem Link : https://leetcode.com/problems/squares-of-a-sorted-array/description/

public class Solution {
    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }

        int[] res = new int[nums.length];
        int start = 0;
        int end = res.length - 1;

        for (int i = res.length - 1; i >= 0; i--) {
            if (nums[start] < nums[end]) {
                res[i] = nums[end];
                end--;
            } else {
                res[i] = nums[start];
                start++;
            }
        }

        return res;
    }
}