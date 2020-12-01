package leetcode.explore.bst;

import java.util.ArrayList;
import java.util.List;

// Time Limit Exceeded for huge BST One approach height balanced trees

// But Priority Queue makes total sense

class KthLargest {
    TreeNode root;
    int k;
    public KthLargest(int k, int[] nums) {
        for (int i : nums) {
            this.root = this.insertIntoBst(this.root, i);
        }
        this.k = k;
    }

    private TreeNode insertIntoBst(TreeNode root, int curr) {
        if (root == null) {
            root = new TreeNode(curr);
            return root;
        }
        if (curr > root.val) {
            root.right = insertIntoBst(root.right, curr);
        } else {
            root.left = insertIntoBst(root.left, curr);
        }
        return root;
    }

    private void getInOrderResult(TreeNode root, List<Integer> lst) {
        if (root == null)
            return;
        getInOrderResult(root.left, lst);
        lst.add(root.val);
        getInOrderResult(root.right, lst);
    }


    public int add(int val) {
        this.root = this.insertIntoBst(this.root, val);
        List<Integer> res = new ArrayList<>();
        this.getInOrderResult(this.root, res);
        if (res.size() < 3) {
            return res.get(res.size() - 1);
        }
        return res.get(res.size() - k);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode (int val) {
        this.val = val;
    }
}