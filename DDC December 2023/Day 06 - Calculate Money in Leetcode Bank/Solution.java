// Problem Link : https://leetcode.com/problems/calculate-money-in-leetcode-bank/description/

public class Solution {
    public int totalMoney(int n) {
        int totalMoney = 0;

        int weeks = n / 7;
        int daysLeft = n % 7;

        if (weeks < 1) {
            return n * (n + 1) / 2;
        } else {
            for (int i = 0; i < weeks; i++) {
                totalMoney += 28 + (7 * i);
            }
            for (int i = 0; i < daysLeft; i++) {
                totalMoney += weeks + 1 + i;
            }
        }

        return totalMoney;
    }
}