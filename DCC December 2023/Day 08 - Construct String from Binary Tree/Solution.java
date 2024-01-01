// Problem Solution : https://leetcode.com/problems/construct-string-from-binary-tree/description/

public class Solution {
    public String tree2str(TreeNode t) {
        StringBuilder result = new StringBuilder();
        dfs(t, result);
        return result.toString();
    }

    private static void dfs(TreeNode node, StringBuilder result) {
        if (node == null) {
            return;
        }

        result.append(node.val);

        if (node.left != null || node.right != null) {
            result.append('(');
            dfs(node.left, result);
            result.append(')');

            if (node.right != null) {
                result.append('(');
                dfs(node.right, result);
                result.append(')');
            }
        }
    }

    // Ignore this section :
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }
}