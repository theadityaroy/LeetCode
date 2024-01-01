// Problem Link : https://leetcode.com/problems/largest-3-same-digit-number-in-string/description/

public class Solution {
    public String largestGoodInteger(String num) {
        int n = num.length();
        String maxGoodInteger = "";

        for (int i = 0; i < n - 2; i++) {
            String currentSubstring = num.substring(i, i + 3);
            if (isGoodInteger(currentSubstring) && currentSubstring.compareTo(maxGoodInteger) > 0) {
                maxGoodInteger = currentSubstring;
            }
        }

        return maxGoodInteger;
    }

    private boolean isGoodInteger(String str) {
        return str.charAt(0) == str.charAt(1) && str.charAt(1) == str.charAt(2);
    }
}