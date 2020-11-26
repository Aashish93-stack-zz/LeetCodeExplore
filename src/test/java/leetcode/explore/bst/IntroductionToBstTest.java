package leetcode.explore.bst;

import leetcode.explore.common.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class IntroductionToBstTest {
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
    public void testBST() {
        IntroductionToBst bst = new IntroductionToBst();
        assertTrue(bst.isValidBST(posRoot));
        assertFalse(bst.isValidBST(negRoot));
    }

    @Test
    public void testSuccessor() {
        IntroductionToBst bst = new IntroductionToBst();
        assertEquals(posRoot.right.val, bst.inorderSuccessor(posRoot, posRoot.right.left).val);
        assertEquals(posRoot.right.right, bst.inorderSuccessor(posRoot, posRoot.right));
        TreeNode r= new TreeNode(0);
        System.out.println(bst.inorderSuccessor(r, r));

    }
}