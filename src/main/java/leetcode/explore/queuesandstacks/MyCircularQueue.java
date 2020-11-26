package leetcode.explore.queuesandstacks;

import java.util.List;

public class MyCircularQueue {

    int[] array;
    int head;
    int tail;
    int size;

    public MyCircularQueue(int k) {
        array = new int[k];
        size = k;
        head = -1;
        tail = -1;
    }

    public boolean enQueue(int value) {
        if (isEmpty()) {
            head = 0;
            tail = 0;
            array[head] = value;
            return true;
        }
        if (isFull())
            return false;
        tail = (tail + 1) % size;
        array[tail] = value;
        return true;
    }

    public boolean deQueue() {
        if (isEmpty())
            return false;
        if (head == tail) {
            head = -1;
            tail = -1;
            return true;
        }
        head = (head + 1) % size ;
        return true;
    }

    public int Front() {
        if (isEmpty())
            return -1;
        return array[head];
    }

    public int Rear() {
        if (isEmpty())
            return -1;
        return array[tail];
    }

    public boolean isEmpty() {
        return head == -1;
    }

    public boolean isFull() {
        return (tail + 1) % size == head;
    }
}
