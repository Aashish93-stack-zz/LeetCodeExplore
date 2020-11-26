package leetcode.explore.bst;

import leetcode.explore.common.TreeNode;

public class BasicBSTOperations {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null)
            return null;
        if (root.val == val)
            return root;
        else if (root.val < val)
            return searchBST(root.right, val);
        else
            return searchBST(root.left, val);
    }

    public TreeNode insertIntoBST(TreeNode root, int val) {

    }
}
