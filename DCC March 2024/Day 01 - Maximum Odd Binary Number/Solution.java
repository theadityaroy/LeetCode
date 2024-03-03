// Problem Link : https://leetcode.com/problems/maximum-odd-binary-number/description/

public class Solution {
    public String maximumOddBinaryNumber(String s) {
        byte ones = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '1')
                ones++;
        }

        char[] result = new char[s.length()];
        for (byte i = 0; i < s.length() - 1; i++) {
            if (i < ones - 1)
                result[i] = '1';
            else
                result[i] = '0';
        }
        result[s.length() - 1] = '1';
        return String.valueOf(result);
    }
}