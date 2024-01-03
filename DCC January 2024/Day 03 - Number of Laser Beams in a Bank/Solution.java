// Problem Link : https://leetcode.com/problems/number-of-laser-beams-in-a-bank/description/

public class Solution {
    public int numberOfBeams(String[] bank) {
        int prevRowCount = 0;
        int total = 0;

        for(String row : bank) {
            int curRowCount = calc(row);
            if(curRowCount==0) {
                continue;
            }

            total += curRowCount * prevRowCount;
            prevRowCount = curRowCount;
        }

        return total;
    }

    private int calc(String s) {
        int count = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '1') {
                count++;
            }
        }

        return count;
    }
}