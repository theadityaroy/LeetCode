// Problem Link : https://leetcode.com/problems/bag-of-tokens/description/

import java.util.Arrays;

public class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int low = 0;
        int high = tokens.length - 1;
        int score = 0;
        int maxScore = 0;

        while (low <= high) {
            if (tokens[low] <= power) {
                power -= tokens[low];
                score++;
                low++;
                maxScore = Math.max(maxScore, score);
            } else if (score > 0) {
                power += tokens[high];
                score--;
                high--;
            } else {
                break;
            }
        }

        return maxScore;
    }
}