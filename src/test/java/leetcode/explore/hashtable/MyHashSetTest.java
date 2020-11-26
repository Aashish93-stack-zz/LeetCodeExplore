package leetcode.explore.hashtable;

import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class MyHashSetTest {

    @Test
    public void testHasSet() {
        MyHashSet set = new MyHashSet();
        set.add(10);
        set.add(20);
        assertTrue(set.contains(20));
        assertTrue(set.contains(10));
        assertFalse(set.contains(30));
    }

}