// Problem Link : https://leetcode.com/problems/even-odd-tree/description/

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            int pre = level % 2 == 0 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            for (int i = 0; i < size; ++i) {
                TreeNode p = queue.poll();
                if (level % 2 == 0) {
                    if (p.val % 2 == 0 || pre >= p.val) {
                        return false;
                    }
                } else {
                    if (p.val % 2 == 1 || pre <= p.val) {
                        return false;
                    }
                }
                pre = p.val;
                if (p.left != null) {
                    queue.add(p.left);
                }
                if (p.right != null) {
                    queue.add(p.right);
                }
            }
            ++level;
        }
        return true;
    }

    // Ignore this Section :
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}