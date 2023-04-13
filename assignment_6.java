package pkg_Stack;
import java.util.ArrayList;

public class assignment_6 {
    public static void main(String[] arg){

        fixedStk fixed = new fixedStk(5);
        growableStk gStack = new growableStk();

        // Push items to the fixed stack
        fixed.push(1);
        fixed.push(2);
        fixed.push(3);

        // Pop items from the fixed stack
        while (!fixed.isEmpty()) {
            System.out.println("Popped: " + fixed.pop());
        }

        // Push items to the growable stack
        gStack.push(1);
        gStack.push(2);
        gStack.push(3);

        // Pop items from the growable stack
        while (!gStack.isEmpty()) {
            System.out.println("Popped: " + gStack.pop());
        }
    }
}



class fixedStk implements Interface_STK {
    private final int[] stack;
    private int top;

    public fixedStk(int size) {
        stack = new int[size];
        top = -1;
    }

    public void push(int item) {
        if (isFull()) {
            System.out.println("Full");
        } else {
            stack[++top] = item;
            System.out.println(item);
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Empty");
            return -1;
        } else {
            int popped = stack[top--];
            System.out.println("popped: " + popped);
            return popped;
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Empty");
            return -1;
        } else {
            return stack[top];
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == stack.length - 1;
    }

    public void size(){
        System.out.println(stack.length);
    }
}



class growableStk implements Interface_STK {
    private final ArrayList<Integer> stack;
    private int top;

    public growableStk() {
        stack = new ArrayList<Integer>();
        top = -1;
    }

    public void push(int item) {
        stack.add(++top, item);
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Empty");
            return -1;
        } else {
            return stack.remove(top--);
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Empty");
            return -1;
        } else {
            return stack.get(top);
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        System.out.println("Full");
        return false;
    }

    public void size(){
        System.out.println(stack.size());
    }
}

