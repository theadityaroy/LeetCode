// Problem Link : https://leetcode.com/problems/find-the-town-judge/description/

public class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] trustCount = new int[n + 1];

        for (int[] pair : trust) {
            trustCount[pair[0]]--;
            trustCount[pair[1]]++;
        }

        for (int i = 1; i <= n; i++) {
            if (trustCount[i] == n - 1) {
                return i;
            }
        }

        return -1;
    }
}