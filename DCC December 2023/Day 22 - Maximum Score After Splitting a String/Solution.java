// Problem  Link : https://leetcode.com/problems/maximum-score-after-splitting-a-string/description/

public class Solution {
    public int maxScore(String s) {
        int res = 0;
        int ones = 0;
        int zeros = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                ones++;
            }
        }

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0') {
                zeros++;
            } else {
                ones--;
            }

            res = Math.max(res, zeros + ones);
        }

        return res;
    }
}