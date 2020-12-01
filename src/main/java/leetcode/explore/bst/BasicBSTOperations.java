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
        if (root == null) {
            root = new TreeNode(val);
            return root;
        }
        if (val > root.val) {
            root.right = insertIntoBST(root.right, val);
        } else {
            root.left = insertIntoBST(root.left, val);
        }
        return root;
    }

    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null)
            return root;
        if (root.val < key) {
            root.right = deleteNode(root.right, key);
        } else if (root.val > key) {
            root.left = deleteNode(root.left, key);
        } else {
            if (root.left == null && root.right == null) {
                return null;
            }
            if (root.right == null) {
                root.val = root.left.val;
                root.left = null;
                return root;
            }
            if (root.left == null) {
                root.val = root.right.val;
                root.right = null;
                return root;
            }
            TreeNode next = successor(root, key, null);
            next = next == null ? predecessor(root, key, null) : next;
            int val = next.val;
            root = deleteNode(root, val);
            root.val = val;
        }
        return root;
    }

    private TreeNode successor(TreeNode root, int val, TreeNode parent) {
        if (root == null)
            return parent;
        if (root.val <= val) {
            return successor(root.right, val, parent);
        } else {
            return successor(root.left, val, root);
        }
    }

    private TreeNode predecessor(TreeNode root, int val, TreeNode parent) {
        if (root == null)
            return parent;
        if (root.val < val) {
            return predecessor(root.right, val, root);
        } else {
            return predecessor(root.left, val, parent);
        }
    }
}
