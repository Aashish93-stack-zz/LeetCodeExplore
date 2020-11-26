package leetcode.explore.bst;

import leetcode.explore.common.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasicBSTOperationsTest {
    private TreeNode posRoot;
    private TreeNode negRoot;


    @BeforeEach
    public void beforeEach() {
        System.out.println("Beforee All...");
        posRoot = new TreeNode(5);
        posRoot.left = new TreeNode(1);
        posRoot.right = new TreeNode(7);
        posRoot.right.left = new TreeNode(6);
        posRoot.right.right = new TreeNode(8);

        negRoot = new TreeNode(2);
        negRoot.left = new TreeNode(5);
        negRoot.right = new TreeNode(3);
    }

    @Test
    public void testSearchBST() {
        BasicBSTOperations bstOperations = new BasicBSTOperations();

        TreeNode root = bstOperations.searchBST(posRoot, 7);
        assertEquals(root, posRoot.right);
    }

}