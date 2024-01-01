// Problem Link : https://leetcode.com/problems/widest-vertical-area-between-two-points-containing-no-points/description/

import java.util.Arrays;

public class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int n = points.length;
        int[] xAxis = new int[n];

        for (int i = 0; i < n; i++) {
            xAxis[i] = points[i][0];
        }

        Arrays.sort(xAxis);
        int res = 0;
        for (int i = 1; i < n; i++) {
            res = Math.max(res, xAxis[i] - xAxis[i - 1]);
        }

        return res;
    }
}