package leetcode.explore.bst;

import leetcode.explore.common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class IntroductionToBst {
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, null, null);
    }

    public boolean isValidBST(TreeNode root, Integer min, Integer max) {
        if (root == null)
            return true;
        if ((max != null && root.val >= max) || (min != null && root.val <= min))
            return false;
        return isValidBST(root.left, min, root.val) && isValidBST(root.right, root.val, max);
    }

    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        return successor(root, p, null);
    }

    private TreeNode successor(TreeNode root, TreeNode p, TreeNode parent) {
        if (root == null) {
            return parent;
        }
        if (root.val <= p.val)
            return successor(root.right, p, parent);
        else
            return successor(root.left, p, root);
    }

    // TODO WRONG
    public TreeNode inorderPredecessor(TreeNode root, TreeNode p) {
        return predecessor(root, p, null);
    }

    private TreeNode predecessor(TreeNode root, TreeNode p, TreeNode parent) {
        if (root == null)
            return parent;
        if (root.val < p.val)
            return predecessor(root.right, p, root);
        else
            return predecessor(root.left, p, parent);
    }

}

class BSTIterator {

    Queue<Integer> queue;

    public BSTIterator(TreeNode root) {
        queue = new LinkedList<>();
        inOrder(root);
    }

    private void inOrder(TreeNode root) {
        if (root == null)
            return;
        inOrder(root.left);
        queue.offer(root.val);
        inOrder(root.right);
    }


    /** @return the next smallest number */
    public int next() {
        return queue.poll();
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !queue.isEmpty();
    }
}
