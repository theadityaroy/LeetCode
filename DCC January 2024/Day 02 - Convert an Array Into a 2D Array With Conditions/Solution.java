// Problem Link : https://leetcode.com/problems/convert-an-array-into-a-2d-array-with-conditions/description/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            count = Math.max(map.get(num), count);
        }

        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            List<Integer> list = new ArrayList<>();

            for (int it : new ArrayList<>(map.keySet())) {
                list.add(it);
                map.put(it, map.get(it) - 1);

                if (map.get(it) <= 0) {
                    map.remove(it);
                }
            }

            res.add(list);
        }

        return res;
    }
}