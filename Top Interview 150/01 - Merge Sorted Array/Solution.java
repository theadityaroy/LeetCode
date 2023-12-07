// Problem Link : https://leetcode.com/problems/merge-sorted-array/description/

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr = new int[n + m];

        int ptr1 = 0;
        int ptr2 = 0;
        int i = 0;

        while (ptr1 < m && ptr2 < n && i < m + n) {
            if (nums1[ptr1] < nums2[ptr2]) {
                arr[i] = nums1[ptr1];
                ptr1++;
            } else {
                arr[i] = nums2[ptr2];
                ptr2++;
            }
            i++;
        }

        while (ptr1 < m && i < m + n) {
            arr[i] = nums1[ptr1];
            ptr1++;
            i++;
        }

        while (ptr2 < n && i < m + n) {
            arr[i] = nums2[ptr2];
            ptr2++;
            i++;
        }

        System.arraycopy(arr, 0, nums1, 0, m + n);
    }
}