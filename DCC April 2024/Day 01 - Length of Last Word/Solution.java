// Problem Link : https://leetcode.com/problems/length-of-last-word/description/

class Solution {
    public int lengthOfLastWord(String s) {
        if (s.length() == 1 && s.charAt(0) != ' ') {
            return 1;
        }

        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                count++;
                if (i - 1 >= 0 && s.charAt(i - 1) == ' ') {
                    break;
                }
            }
        }

        return count;
    }
}
