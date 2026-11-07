import java.util.Stack;

public class q5 {
    static Stack<Integer> stack = new Stack<>();

    static void push(int x) {
        stack.push(x);
        System.out.println("Pushed: " + x);
    }

    static void pop() {
        if (!isEmpty())
            System.out.println("Popped: " + stack.pop());
        else
            System.out.println("Stack is empty, cannot pop.");
    }

    static boolean isEmpty() {
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        push(10);
        push(20);
        push(30);
        pop();
        System.out.println("Is empty? " + isEmpty());
        pop();
        pop();
        System.out.println("Is empty? " + isEmpty());
        pop();
    }
}
