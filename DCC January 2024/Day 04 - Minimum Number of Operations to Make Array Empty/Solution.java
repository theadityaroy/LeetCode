// Problem Link : https://leetcode.com/problems/minimum-number-of-operations-to-make-array-empty/description/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int minOperations(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int count = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int value = entry.getValue();

            if (value == 1) {
                return -1;
            }

            int rem = value % 3;
            count += (value / 3) + (rem == 0 ? 0 : 1);
        }

        return count;
    }
}