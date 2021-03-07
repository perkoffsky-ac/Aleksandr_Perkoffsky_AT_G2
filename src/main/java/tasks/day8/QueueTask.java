package main.java.tasks.day8;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTask {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("element 1");
        queue.add("element 2");
        queue.add("element 3");
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
}
