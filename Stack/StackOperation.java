package Stack;

import java.util.Stack;

public class StackOperation {
    public static void main(String[] args) {
        Stack <Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(3);
        stack.push(5);
        stack.push(7);
        stack.push(9);

        stack.pop();
        System.out.println(stack);
    }
}
