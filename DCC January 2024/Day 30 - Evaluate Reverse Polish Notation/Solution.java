// Problem Link : https://leetcode.com/problems/evaluate-reverse-polish-notation/description/

import java.util.Stack;

public class Solution {
    long resolve(long a, long b, char operator) {
        if (operator == '+')
            return a + b;
        else if (operator == '-')
            return a - b;
        else if (operator == '*')
            return a * b;
        return a / b;
    }

    public int evalRPN(String[] tokens) {
        Stack<Long> stack = new Stack<>();
        int n = tokens.length;
        for (int i = 0; i < n; i++) {
            if (tokens[i].length() == 1 && tokens[i].charAt(0) < '0') {
                long integer2 = stack.pop();
                long integer1 = stack.pop();
                char operator = tokens[i].charAt(0);
                long resolvedAns = resolve(integer1, integer2, operator);
                stack.push(resolvedAns);
            } else {
                stack.push(Long.parseLong(tokens[i]));
            }
        }
        return stack.pop().intValue();
    }
}
