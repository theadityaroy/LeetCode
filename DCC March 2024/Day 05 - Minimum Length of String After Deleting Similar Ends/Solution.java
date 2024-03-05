// Problem Link : https://leetcode.com/problems/minimum-length-of-string-after-deleting-similar-ends/description/

public class Solution {
    public int minimumLength(String s) {
        int low = 0;
        int high = s.length() - 1;

        while (low < high && s.charAt(low) == s.charAt(high)) {
            char ch = s.charAt(low);
            while (low <= high && s.charAt(low) == ch) {
                low++;
            }
            while (low <= high && s.charAt(high) == ch) {
                high--;
            }
        }

        return high - low + 1;
    }
}