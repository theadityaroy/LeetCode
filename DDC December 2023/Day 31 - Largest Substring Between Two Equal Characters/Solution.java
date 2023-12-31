// Problem Link : https://leetcode.com/problems/largest-substring-between-two-equal-characters/description/

import java.util.HashMap;

public class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int res = -1;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                res = Math.max(res, i - map.get(s.charAt(i)) - 1);
            } else {
                map.put(s.charAt(i), i);
            }
        }

        return res;
    }
}