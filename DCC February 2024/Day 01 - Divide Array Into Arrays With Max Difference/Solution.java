// Problem Link : https://leetcode.com/problems/divide-array-into-arrays-with-max-difference/description/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);

        List<int[]> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i += 3) {
            int min = nums[i];
            int max = nums[i];

            for (int j = i + 1; j < Math.min(nums.length, i + 3); j++) {
                min = Math.min(min, nums[j]);
                max = Math.max(max, nums[j]);
            }

            if (max - min > k) {
                return new int[0][];
            }

            result.add(Arrays.copyOfRange(nums, i, Math.min(nums.length, i + 3)));
        }

        return result.toArray(new int[result.size()][]);
    }
}