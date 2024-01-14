package queue;

import java.util.LinkedList;

public class GenericQueue<T> {
    private LinkedList<T> queue = new LinkedList<>();

    public void enqueue(T element) {
        queue.addLast(element);
    }

    public T dequeue() {
        if (queue.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue.removeFirst();
    }
}
