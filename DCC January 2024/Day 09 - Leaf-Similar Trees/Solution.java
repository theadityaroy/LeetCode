// Problem Link : https://leetcode.com/problems/leaf-similar-trees/description/

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private List<Integer> store1 = new ArrayList<>();

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        findLeaves(root1);
        List<Integer> firstTree = store1;
        store1 = new ArrayList<>();
        findLeaves(root2);

        if (root1 == null || root2 == null)
            return false;

        return firstTree.equals(store1);
    }

    private void findLeaves(TreeNode root) {

        if (root.left == null && root.right == null) {
            store1.add(root.val);
        }

        if (root.left != null) {
            findLeaves(root.left);
        }
        if (root.right != null) {
            findLeaves(root.right);
        }
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