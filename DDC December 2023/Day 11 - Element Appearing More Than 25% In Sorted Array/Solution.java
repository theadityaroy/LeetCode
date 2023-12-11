// Problem Link : https://leetcode.com/problems/element-appearing-more-than-25-in-sorted-array/description/

public class Solution {
    public int findSpecialInteger(int[] arr) {
        int quaterLength = arr.length / 4;

        for (int i = 0; i < arr.length - quaterLength; i++) {
            if (arr[i] == arr[i + quaterLength]) {
                return arr[i];
            }
        }

        return -1;
    }
}