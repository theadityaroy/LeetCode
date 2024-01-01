// Problem Link : https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/description/

public class Solution {
    public int maxProduct(int[] nums) {
        int first = 0;
        int second = 0;

        for (int i = 0; i < nums.length; i++) {
            if (first < nums[i]) {
                second = first;
                first = nums[i];
            } else {
                if (second < nums[i]) {
                    second = nums[i];
                }
            }
        }

        return (first - 1) * (second - 1);
    }
}