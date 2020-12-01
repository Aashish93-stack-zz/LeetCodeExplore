package leetcode.explore.bst;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class KthLargestTest {
    int arr[];
    int k;

    @BeforeEach
    public void beforeEach() {
        this.arr = new int[]{4, 5, 8, 2};
        this.k = 3;
    }

    @Test
    public void testKthLargeElemInAStream() {
        KthLargest kthLargest = new KthLargest(k, arr);
        int large = kthLargest.add(3);
        assertEquals(large, 4);

        int lrg2 = kthLargest.add(6);

        assertEquals(lrg2, 5);
    }

    @Test
    public void testWhenEmptyArray() {
        KthLargest kthLargest = new KthLargest(k, new int[0]);
        assertEquals(-3 , kthLargest.add(-3));
        assertEquals(-2, (kthLargest.add(-2)));
        assertEquals(-4, kthLargest.add(-4));
        assertEquals(-3, kthLargest.add(0));
        assertEquals(-2, kthLargest.add(4));
    }

}