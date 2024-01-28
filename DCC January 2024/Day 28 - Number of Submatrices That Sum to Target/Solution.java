// Problem Link : https://leetcode.com/problems/number-of-submatrices-that-sum-to-target/description/

import java.util.HashMap;

public class Solution {
    public int numSubmatrixSumTarget(int[][] arr, int target) {
        int m = arr.length;
        int n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 1; j < n; j++) {
                arr[i][j] += arr[i][j - 1];
            }
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                HashMap<Integer, Integer> map = new HashMap<>();
                map.put(0, 1);
                int sum = 0;
                for (int k = 0; k < m; k++) {
                    sum += arr[k][j] - (i > 0 ? arr[k][i - 1] : 0);
                    count += map.getOrDefault(sum - target, 0);
                    map.put(sum, map.getOrDefault(sum, 0) + 1);
                }
            }
        }

        return count;
    }
}