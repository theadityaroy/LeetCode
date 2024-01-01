// Problem Link : https://leetcode.com/problems/count-of-matches-in-tournament/description/

public class Solution {
    public int numberOfMatches(int n) {
        int totalMatches = 0;

        while (n > 1) {
            totalMatches += n / 2;
            n = (n + 1) / 2; // Adjust the number of teams for the next round
        }

        return totalMatches;
    }
}