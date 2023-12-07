// Problem Link : https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/

public class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 1;
        int val = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != val) {
                val = nums[i];
                nums[count] = nums[i];
                count++;
            }
        }

        return count;
    }
}