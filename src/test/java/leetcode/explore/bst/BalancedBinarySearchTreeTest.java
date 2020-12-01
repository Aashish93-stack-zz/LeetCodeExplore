package leetcode.explore.bst;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBinarySearchTreeTest {
    private leetcode.explore.bst.TreeNode posRoot;
    private leetcode.explore.bst.TreeNode negRoot;


    @BeforeEach
    public void beforeEach() {
        System.out.println("Beforee All...");
        posRoot = new leetcode.explore.bst.TreeNode(5);
        posRoot.left = new leetcode.explore.bst.TreeNode(3);
        posRoot.right = new leetcode.explore.bst.TreeNode(6);
        posRoot.left.left = new leetcode.explore.bst.TreeNode(2);
        posRoot.left.right = new leetcode.explore.bst.TreeNode(4);
        posRoot.right.right = new leetcode.explore.bst.TreeNode(7);

        negRoot = new leetcode.explore.bst.TreeNode(1);
        negRoot.left = new TreeNode(2);
        negRoot.right = new TreeNode(2);
        negRoot.left.left = new TreeNode(3);
        negRoot.left.right = new TreeNode(3);
        negRoot.left.left.left = new TreeNode(4);
        negRoot.left.left.right = new TreeNode(4);
    }

    @Test
    public void testBalancedBST() {
        BalancedBinarySearchTree bst = new BalancedBinarySearchTree();
        assertTrue(bst.isBalanced(posRoot));
        assertFalse(bst.isBalanced(negRoot));
        assertTrue(bst.isBalanced(null));

    }

}