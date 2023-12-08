// Problem Link : https://leetcode.com/problems/majority-element/description/

public class Solution {
    public int majorityElement(int[] nums) {
        int count = 1;
        int val = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == val) {
                count++;
            } else {
                count--;
            }

            if (count == 0) {
                val = nums[i];
                count = 1;
            }
        }

        count = 0;
        for (int i : nums) {
            if (i == val) {
                count++;
            }
        }

        if (count > nums.length / 2) {
            return val;
        }

        return -1;
    }
}