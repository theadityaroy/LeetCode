// Problem Link : https://leetcode.com/problems/greatest-common-divisor-traversal/description/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean canTraverseAllPairs(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return true;
        }
        int[] funs = new int[n];
        int[] vals = new int[n];
        for (int i = 0; i < n; ++i) {
            funs[i] = i;
            vals[i] = 1;
        }
        Map<Integer, Integer> have = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; ++i) {
            int x = nums[i];
            if (x == 1) {
                return false;
            }
            for (int d = 2; d * d <= x; ++d) {
                if (x % d == 0) {
                    if (have.containsKey(d)) {
                        merge(funs, vals, i, have.get(d));
                    } else {
                        have.put(d, i);
                    }
                    while (x % d == 0) {
                        x /= d;
                    }
                }
            }
            if (x > 1) {
                if (have.containsKey(x)) {
                    merge(funs, vals, i, have.get(x));
                } else {
                    have.put(x, i);
                }
            }
        }

        return vals[getf(funs, 0)] == n;
    }

    private int getf(int[] f, int x) {
        return f[x] == x ? x : (f[x] = getf(f, f[x]));
    }

    private void merge(int[] f, int[] num, int x, int y) {
        x = getf(f, x);
        y = getf(f, y);
        if (x == y) {
            return;
        }
        if (num[x] < num[y]) {
            int t = x;
            x = y;
            y = t;
        }
        f[y] = x;
        num[x] += num[y];
    }
}