package leetcode.explore.binarytree;

import leetcode.explore.common.TreeNode;

public class SolveProblemsRecursively {
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return Math.max(leftDepth, rightDepth) + 1;
    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;
        return isSymmetric(root.left, root.right);
    }

    private boolean isSymmetric(TreeNode tree1, TreeNode tree2) {
        if ((tree1 == null && tree2 != null) || (tree2 == null && tree1 != null))
            return false;
        if (tree1 == null && tree2 == null)
            return true;
        return (tree1.val == tree2.val) && isSymmetric(tree1.left, tree2.right) && isSymmetric(tree1.right, tree2.left);
    }

    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        sum -= root.val;
        if ((root.left == null) && (root.right == null)) {
            return (sum == 0);
        }
        boolean left = hasPathSum(root.left, sum);
        boolean right  = hasPathSum(root.right, sum);
        return left || right;
    }

    int count = 0;
    boolean all(TreeNode root, int val) {
        if (root == null)
            return true;
        if (!all(root.left, root.val) | !all(root.right, root.val))
            return false;
        count++;
        return root.val == val;
    }
    public int countUnivalSubtrees(TreeNode root) {
        all(root, 0);
        return count;
    }

}
