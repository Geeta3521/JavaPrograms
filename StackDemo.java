// i. Interface for Stack Operations
interface StackInterface {
    void push(int item);
    int pop();
    boolean isEmpty();
    boolean isFull();
}

// ii. Fixed length Stack
class FixedStack implements StackInterface {
    private int[] stack;
    private int top;

    public FixedStack(int size) {
        stack = new int[size];
        top = -1;
    }

    public void push(int item) {
        if (isFull()) {
            System.out.println("FixedStack Overflow");
        } else {
            stack[++top] = item;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("FixedStack Underflow");
            return -1;
        } else {
            return stack[top--];
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == stack.length - 1;
    }
}

// iii. Dynamic length Stack
class DynamicStack implements StackInterface {
    private int[] stack;
    private int top;

    public DynamicStack(int initialSize) {
        stack = new int[initialSize];
        top = -1;
    }

    public void push(int item) {
        if (isFull()) {
            // Double the stack size
            int[] newStack = new int[stack.length * 2];
            System.arraycopy(stack, 0, newStack, 0, stack.length);
            stack = newStack;
            System.out.println("DynamicStack Resized to: " + stack.length);
        }
        stack[++top] = item;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("DynamicStack Underflow");
            return -1;
        } else {
            return stack[top--];
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == stack.length - 1;
    }
}

// iv. Class to demonstrate runtime binding
public class StackDemo {
    public static void main(String[] args) {
        StackInterface stack;

        // Using FixedStack
        stack = new FixedStack(3);
        System.out.println("Using FixedStack:");
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40); // Should show overflow

        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }

        // Using DynamicStack
        stack = new DynamicStack(2);
        System.out.println("\nUsing DynamicStack:");
        stack.push(100);
        stack.push(200);
        stack.push(300); // Should resize

        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }
    }
}
