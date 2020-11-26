package leetcode.explore.queuesandstacks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovingAverageTest {

    @Test
    public void testMvgAvgDataStream() {
        MovingAverage mvg = new MovingAverage(3);
        assertEquals(mvg.next(1), 1.0);
        assertEquals(mvg.next(10), 5.5);
        assertEquals(mvg.next(3), 4.666666666666667);
        assertEquals(mvg.next(5), 6.0);

    }

}