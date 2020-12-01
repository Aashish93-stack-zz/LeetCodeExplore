package leetcode.explore.bst;

import leetcode.explore.binarytree.TraverseATree;
import leetcode.explore.common.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BasicBSTOperationsTest {
    private TreeNode posRoot;
    private TreeNode negRoot;


    @BeforeEach
    public void beforeEach() {
        System.out.println("Beforee All...");
        posRoot = new TreeNode(5);
        posRoot.left = new TreeNode(3);
        posRoot.right = new TreeNode(6);
        posRoot.left.left = new TreeNode(2);
        posRoot.left.right = new TreeNode(4);
        posRoot.right.right = new TreeNode(7);

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

    @Test
    public void testInsertBST() {
        BasicBSTOperations bstOperations = new BasicBSTOperations();

        TreeNode treeNode = bstOperations.insertIntoBST(posRoot, 9);

        TraverseATree traverseATree = new TraverseATree();
        List<Integer> integers = traverseATree.inOrderTraversalRecursive(treeNode);
        assertEquals(java.util.Optional.ofNullable(integers.get(5)).get().intValue(), 9);
    }

    @Test
    public void testDeleteBST() {
        BasicBSTOperations bstOperations = new BasicBSTOperations();
        TraverseATree traverseATree = new TraverseATree();
        System.out.println(traverseATree.inOrderTraversalRecursive(posRoot));
        TreeNode treeNode1 = bstOperations.deleteNode(posRoot, 5);
        posRoot = new TreeNode(5);
        posRoot.left = new TreeNode(3);
        posRoot.right = new TreeNode(6);
        posRoot.left.left = new TreeNode(2);
        posRoot.left.right = new TreeNode(4);
        posRoot.right.right = new TreeNode(7);

        TreeNode treeNode2 = bstOperations.deleteNode(posRoot, 3);
        posRoot = new TreeNode(5);
        posRoot.left = new TreeNode(3);
        posRoot.right = new TreeNode(6);
        posRoot.left.left = new TreeNode(2);
        posRoot.left.right = new TreeNode(4);
        posRoot.right.right = new TreeNode(7);

        TreeNode treeNode3 = bstOperations.deleteNode(posRoot, 6);
        posRoot = new TreeNode(5);
        posRoot.left = new TreeNode(3);
        posRoot.right = new TreeNode(6);
        posRoot.left.left = new TreeNode(2);
        posRoot.left.right = new TreeNode(4);
        posRoot.right.right = new TreeNode(7);

        TreeNode treeNode4 = bstOperations.deleteNode(posRoot, 2);
        posRoot = new TreeNode(5);
        posRoot.left = new TreeNode(3);
        posRoot.right = new TreeNode(6);
        posRoot.left.left = new TreeNode(2);
        posRoot.left.right = new TreeNode(4);
        posRoot.right.right = new TreeNode(7);

        TreeNode treeNode5 = bstOperations.deleteNode(posRoot, 4);

        posRoot = new TreeNode(5);
        posRoot.left = new TreeNode(3);
        posRoot.right = new TreeNode(6);
        posRoot.left.left = new TreeNode(2);
        posRoot.left.right = new TreeNode(4);
        posRoot.right.right = new TreeNode(7);

        TreeNode treeNode6 = bstOperations.deleteNode(posRoot, 7);


        List<Integer> integers1 = traverseATree.inOrderTraversalRecursive(treeNode1);
        System.out.println(integers1);
        List<Integer> integers2 = traverseATree.inOrderTraversalRecursive(treeNode2);
        System.out.println(integers2);
        List<Integer> integers3 = traverseATree.inOrderTraversalRecursive(treeNode3);
        System.out.println(integers3);
        List<Integer> integers4 = traverseATree.inOrderTraversalRecursive(treeNode4);
        System.out.println(integers4);
        List<Integer> integers5 = traverseATree.inOrderTraversalRecursive(treeNode5);
        System.out.println(integers5);
        List<Integer> integers6 = traverseATree.inOrderTraversalRecursive(treeNode6);
        System.out.println(integers6);


    }

}