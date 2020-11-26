package leetcode.explore.binarytree;

import leetcode.explore.common.TreeNode;

import java.util.*;

public class TraverseATree {

    public List<Integer> preOrderTraversalIterative(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        if (root == null)
            return result;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode curr = stack.pop();
            result.add(curr.val);
            if (curr.right != null)
                stack.push(curr.right);
            if (curr.left != null)
                stack.push(curr.left);
        }
        return result;
    }

    List<Integer> lst = new ArrayList<>();

    public List<Integer> preOrderTraversalRecursive(TreeNode root) {
        if (root == null)
            return lst;
        lst.add(root.val);
        preOrderTraversalRecursive(root.left);
        preOrderTraversalRecursive(root.right);
        return lst;
    }

    public List<Integer> inOrderTraversalIterative(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            res.add(curr.val);
            curr = curr.right;
        }
        return res;
    }

    public List<Integer> inOrderTraversalRecursive(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorderTraverse(root, result);
        return result;
    }

    private void inorderTraverse(TreeNode root, List<Integer> result) {
        if (root == null)
            return;
        inorderTraverse(root.left, result);
        result.add(root.val);
        inorderTraverse(root.right, result);
    }

//    public List<Integer> postOrderTravereIterative(TreeNode root) {
//        List<Integer> result = new ArrayList<>();
//        if (root == null)
//            return result;
//        Stack<TreeNode> stack = new Stack<>();
//        TreeNode curr = root;
//        while(curr != null || !stack.isEmpty()) {
//            while (curr != null) {
//                if (curr.right != null) {
//                    stack.push(curr.right);
//                }
//                stack.push(curr);
//                curr = curr.left;
//            }
//            curr = stack.pop();
//            // if the right subtree is not yet processed
//            if (!stack.isEmpty() && curr.right == stack.peek()) {
//                stack.pop();
//                stack.push(root);
//                curr = curr.right;
//                // if we're on the leftmost leaf
//            } else {
//                result.add(curr.val);
//                curr = null;
//            }
//        }
//        return result;
//    }

    public List<Integer> postorderTraversalRecursive(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null)
            return result;
        postOrder(root, result);
        return result;
    }

    private void postOrder(TreeNode root, List<Integer> result) {
        if (root == null)
            return;
        postOrder(root.left, result);
        postOrder(root.right, result);
        result.add(root.val);
    }

    public List<List<Integer>> levelOrderBfs(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null)
            return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> res = new ArrayList<>();
            for(int i = 0; i < size; i++) {
                TreeNode curr = queue.poll();
                res.add(curr.val);
                if (curr.left != null)
                    queue.offer(curr.left);
                if (curr.right != null)
                    queue.offer(curr.right);
            }
            result.add(res);
        }
        return result;
    }
}
