package leetcode.explore.array;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class IntroductionTest {

    @Test
    public void testMaxInt() {
        Introduction introduction = new Introduction();

        int[] nums = {1, 1, 0, 1, 1, 1};
        assertEquals(3, introduction.findMaxConsecutiveOnes(nums));

        nums = new int[]{1, 1, 1, 1, 1, 1};
        assertEquals(6, introduction.findMaxConsecutiveOnes(nums));

        nums = new int[]{1, 0, 1, 0, 1, 0, 1, 1};
        assertEquals(2, introduction.findMaxConsecutiveOnes(nums));

        nums = new int[]{12,345,2,6,7896};

        assertEquals(2, introduction.findNumbers(nums));

        nums = new int[]{-4, -1, 0, 3, 10};
        int[] res = introduction.sortedSquares(nums);
        for (int i = 0; i < nums.length; i++)
            nums[i] = nums[i] *  nums[i];
        Arrays.sort(nums);
        assertArrayEquals(res, nums);
    }

}