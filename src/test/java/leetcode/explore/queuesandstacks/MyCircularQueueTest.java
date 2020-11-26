package leetcode.explore.queuesandstacks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyCircularQueueTest {

    @Test
    public void testMyCircularQueue() {
        MyCircularQueue obj = new MyCircularQueue(3);
        assertTrue(obj.isEmpty());
        assertFalse(obj.isFull());

        assertTrue(obj.enQueue(5));
        assertFalse(obj.isEmpty());
        assertFalse(obj.isFull());

        assertTrue(obj.enQueue(4));
        assertFalse(obj.isEmpty());
        assertFalse(obj.isFull());

        assertTrue(obj.enQueue(6));
        assertFalse(obj.isEmpty());
        assertTrue(obj.isFull());



        assertTrue(obj.deQueue());
        assertFalse(obj.isEmpty());
        assertFalse(obj.isFull());

        assertTrue(obj.deQueue());
        assertTrue(obj.deQueue());
        assertFalse(obj.deQueue());
        assertFalse(obj.deQueue());

        assertTrue(obj.isEmpty());
        assertFalse(obj.isFull());
    }

}