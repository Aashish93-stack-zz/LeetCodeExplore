package leetcode.explore.bst;

import leetcode.explore.common.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LowestCommonAncestorTest {
    leetcode.explore.bst.TreeNode posRoot;

    @BeforeEach
    public void beforeEach() {
        posRoot = new leetcode.explore.bst.TreeNode(6);
        posRoot.left = new leetcode.explore.bst.TreeNode(2);
        posRoot.right = new leetcode.explore.bst.TreeNode(8);
        posRoot.left.left = new leetcode.explore.bst.TreeNode(0);
        posRoot.left.right = new leetcode.explore.bst.TreeNode(4);
        posRoot.left.right.left = new leetcode.explore.bst.TreeNode(3);
        posRoot.left.right.right = new leetcode.explore.bst.TreeNode(5);
        posRoot.right.left = new leetcode.explore.bst.TreeNode(7);
        posRoot.right.right = new leetcode.explore.bst.TreeNode(9);
    }

    @Test
    public void testLCA() {
        LowestCommonAncestor lowestCommonAncestor = new LowestCommonAncestor();
        assertEquals(posRoot.left, lowestCommonAncestor.lowestCommonAncestor(posRoot, posRoot.left, posRoot.left.right));
        assertEquals(posRoot, lowestCommonAncestor.lowestCommonAncestor(posRoot, posRoot.left, posRoot.right));
    }

}