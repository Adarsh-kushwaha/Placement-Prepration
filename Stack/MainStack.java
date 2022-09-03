package Stack;

public class MainStack {
    public static void main(String[] args) throws StackException {
        CustomStack stack = new CustomStack();
        stack.push(5);
        stack.push(15);
        stack.push(25);
        stack.push(35);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());

    }
}
