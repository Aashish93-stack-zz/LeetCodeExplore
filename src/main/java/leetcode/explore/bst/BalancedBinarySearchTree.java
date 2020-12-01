package leetcode.explore.bst;

public class BalancedBinarySearchTree {
    public boolean isBalanced(TreeNode root) {
        int res = heightOfSubTree(root);
        return res != -1;
    }

    private Integer heightOfSubTree(TreeNode root) {
        if (root == null)
            return 0;
        int left = heightOfSubTree(root.left);
        int right = heightOfSubTree(root.right);
        if (left == -1 || right == -1 || Math.abs(left - right) > 1)
            return -1;
        return Math.max(left, right) + 1;
    }
}
