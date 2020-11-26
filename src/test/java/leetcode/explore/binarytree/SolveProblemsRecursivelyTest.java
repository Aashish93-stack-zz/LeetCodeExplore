package leetcode.explore.binarytree;

import leetcode.explore.common.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolveProblemsRecursivelyTest {
    private TreeNode root;
    @BeforeEach
    public void beforeEach() {
        System.out.println("Beforee All...");
        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);
    }

    @Test
    public void testMathDepth() {
        assertEquals(3, new SolveProblemsRecursively().maxDepth(root));
    }

    @Test
    public void testIsSymmetric() {
        assertFalse(new SolveProblemsRecursively().isSymmetric(root));
        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(4);
        assertTrue(new SolveProblemsRecursively().isSymmetric(root));
    }

    @Test
    public void testPathSum() {
        root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right = new TreeNode(8);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right =  new TreeNode(1);
        assertTrue(new SolveProblemsRecursively().hasPathSum(root, 22));
        root.left.left = new TreeNode(12);
        assertFalse(new SolveProblemsRecursively().hasPathSum(root, 22));
    }

    @Test
    public void testUnivalueSubTree() {
        root = new TreeNode(5);
        root.left = new TreeNode(1);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(5);
        root.right.right = new TreeNode(5);
        assertEquals(4, new SolveProblemsRecursively().countUnivalSubtrees(root));
    }

}