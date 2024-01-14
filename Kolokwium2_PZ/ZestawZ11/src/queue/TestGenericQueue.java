package queue;

public class TestGenericQueue {
    public static void main(String[] args) {
        GenericQueue<String> stringQueue = new GenericQueue<>();
        stringQueue.enqueue("Elem 1");
        stringQueue.enqueue("Elem 2");

        String element = stringQueue.dequeue();
        System.out.println("Removed element: " + element);
    }
}
