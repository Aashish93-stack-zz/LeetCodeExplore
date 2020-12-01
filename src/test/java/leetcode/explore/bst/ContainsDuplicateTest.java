package leetcode.explore.bst;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateTest {

    @Test
    public void testDuplicate() {
        ContainsDuplicate ctDup = new ContainsDuplicate();
        System.out.println(ctDup.containsNearbyDuplicate(new int[]{1,2,3,1,2,3}, 2));
    }

}