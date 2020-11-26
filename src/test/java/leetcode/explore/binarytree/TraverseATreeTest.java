package leetcode.explore.binarytree;

import leetcode.explore.common.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class TraverseATreeTest {
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
    public void testIterativePreOrder() {
        List<Integer> integers = new TraverseATree().preOrderTraversalIterative(root);
        int[] res = {1,2,4,5,3,7,9};
        int[] expected = integers.stream().mapToInt(i -> i).toArray();
        assertArrayEquals(expected, res);
    }

    @Test
    public void testRecursivePreOrder() {
        List<Integer> integers = new TraverseATree().preOrderTraversalRecursive(root);
        int[] res = {1,2,4,5,3,7,9};
        int[] expected = integers.stream().mapToInt(i -> i).toArray();
        assertArrayEquals(expected, res);
    }

    @Test
    public void testIterativeInOrder() {
        List<Integer> integers = new TraverseATree().inOrderTraversalIterative(root);
        int[] res = {4,2,5,1,7,3,9};
        int[] expected = integers.stream().mapToInt(i -> i).toArray();
        assertArrayEquals(expected, res);
    }

    @Test
    public void testRecursiveInOrder() {
        List<Integer> integers = new TraverseATree().inOrderTraversalRecursive(root);
        int[] res = {4,2,5,1,7,3,9};
        int[] expected = integers.stream().mapToInt(i -> i).toArray();
        assertArrayEquals(expected, res);
    }

//    @Test
//    public void testIterativePostOrder() {
//        List<Integer> integers = new TraverseATree().postOrderTravereIterative(root);
//        int[] res = {4,5,2,7,9,3,1};
//        int[] expected = integers.stream().mapToInt(i -> i).toArray();
//        assertArrayEquals(expected, res);
//    }

    @Test
    public void testRecursivePostOrder() {
        List<Integer> integers = new TraverseATree().postorderTraversalRecursive(root);
        int[] res = {4,5,2,7,9,3,1};
        int[] expected = integers.stream().mapToInt(i -> i).toArray();
        assertArrayEquals(expected, res);
    }

    @Test
    public void testLevelOrderBfs() {
        List<List<Integer>> integers = new TraverseATree().levelOrderBfs(root);
        int[] result = {1, 2,3, 4,5,7,9};
        int[] expected = integers.stream().flatMap(Collection::stream).collect(Collectors.toList()).stream().mapToInt(i -> i).toArray();
        assertArrayEquals(expected, result);
    }
}