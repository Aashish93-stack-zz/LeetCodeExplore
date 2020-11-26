package leetcode.explore.queuesandstacks;

import java.util.LinkedList;
import java.util.Queue;

public class MovingAverage {
    int size;
    int pointer;
    int sum;
    Queue<Integer> queue = new LinkedList<>();

    public MovingAverage(int size) {
        this.size = size;
        this.pointer = 0;
        this.sum = 0;
    }

    public double next(int val) {
        if (queue.size() == size) {
            int elem = queue.poll();
            sum -= elem;
            pointer -=1;
        }
        queue.add(val);
        sum += val;
        pointer +=1;
        return (double) sum / pointer;
    }
}
