// Problem Link : https://leetcode.com/problems/count-elements-with-maximum-frequency/description/

public class Solution {
    public int maxFrequencyElements(int[] nums) {
        int maxNum = Integer.MIN_VALUE;
        for (int num : nums) {
            maxNum = Math.max(maxNum, num);
        }

        int[] arr = new int[maxNum + 1];
        for (int num : nums) {
            arr[num]++;
        }

        int maxFreq = 0;
        for (int num : arr) {
            maxFreq = Math.max(maxFreq, num);
        }

        int res = 0;
        for (int num : arr) {
            if (maxFreq == num) {
                res += maxFreq;
            }
        }

        return res;
    }
}