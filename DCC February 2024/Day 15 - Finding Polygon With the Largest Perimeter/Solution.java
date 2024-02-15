// Problem Link : https://leetcode.com/problems/find-polygon-with-the-largest-perimeter/description/

import java.util.Arrays;

public class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        long sum = 0;
        for (int num : nums) {
            sum += num;
        }
        for (int i = n - 1; i >= 2; i--) {
            if (sum - nums[i] > nums[i]) {
                return sum;
            }
            sum -= nums[i];
        }

        return -1;
    }
}