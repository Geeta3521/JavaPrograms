import java.util.Arrays;

public class GQueue<T> {
    private T[] que;
    private int size;

    // Constructor
    public GQueue() {
        que = (T[]) new Object[2];
        size = 0;
    }

    // Enqueue operation
    public void enqueue(T element) {
        if (size == que.length) {
            que = Arrays.copyOf(que, que.length * 2);
        }
        que[size++] = element;
    }

    // Dequeue operation
    public T dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return null;
        }
        T del_element = que[0];
        System.arraycopy(que, 1, que, 0, size - 1);
        que[--size] = null; // prevent memory leak
        return del_element;
    }

    // Display elements in the queue
    public void display() {
        System.out.println("Queue contents:");
        for (int i = 0; i < size; i++) {
            System.out.println(que[i]);
        }
    }

    // Get current size
    public int getSize() {
        return size;
    }

    // Main method
    public static void main(String[] args) {
        GQueue<Integer> integerQueue = new GQueue<>();

        // Enqueue elements
        integerQueue.enqueue(10);
        integerQueue.enqueue(20);
        integerQueue.enqueue(30);

        // Display queue
        System.out.println("Elements in the queue:");
        integerQueue.display();

        // Dequeue an element
        Integer dequeuedElement = integerQueue.dequeue();
        System.out.println("Dequeued element: " + dequeuedElement);

        // Display updated queue
        System.out.println("Queue after dequeue:");
        integerQueue.display();

        // Show size
        System.out.println("Queue size: " + integerQueue.getSize());
    }
}
