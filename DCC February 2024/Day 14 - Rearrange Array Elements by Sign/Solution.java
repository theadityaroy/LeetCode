// Problem Link : https://leetcode.com/problems/rearrange-array-elements-by-sign/description/

public class Solution {
    public int[] rearrangeArray(int[] nums) {
        int pos = 0;
        int neg = 1;
        int n = nums.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            if (nums[i] >= 0) {
                ans[pos] = nums[i];
                pos = pos + 2;
            } else {
                ans[neg] = nums[i];
                neg = neg + 2;
            }
        }

        return ans;
    }
}