package leetcode.explore.bst;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortedArrayIntoBSTTest {

    @Test
    public void testBst() {
        int[] nums = {-10, -3, 0, 5, 9};
        SortedArrayIntoBST sortedArrayIntoBST = new SortedArrayIntoBST();
        TreeNode treeNode = sortedArrayIntoBST.sortedArrayToBST(nums);
        BalancedBinarySearchTree bst = new BalancedBinarySearchTree();
        assertTrue(bst.isBalanced(treeNode));

        int[] nums2 = {1,2,3,4,5,6,6,5,10};
        TreeNode treeNode1 = sortedArrayIntoBST.sortedArrayToBST(nums2);

        assertTrue(bst.isBalanced(treeNode1));
    }

}