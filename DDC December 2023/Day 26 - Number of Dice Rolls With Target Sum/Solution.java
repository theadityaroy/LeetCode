// Problem Link : https://leetcode.com/problems/number-of-dice-rolls-with-target-sum/description/

public class Solution {
    public int numRollsToTarget(int n, int k, int target) {
        int MOD = 1000000007;
        
        if (n * k < target) {
            return 0;
        }

        int[][] dp = new int[n + 1][target + 1];
        dp[0][0] = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= target; j++) {
                for (int l = 1; l <= k && l <= j; l++) {
                    dp[i][j] = (dp[i][j] + dp[i - 1][j - l]) % MOD;
                }
            }
        }

        return dp[n][target];
    }
}