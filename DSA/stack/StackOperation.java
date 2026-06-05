package stack;

public class StackOperation {

    public static void main(String[] args) {
        
        StackUsingArray stack = new StackUsingArray(5);
        System.out.println(stack.isEmpty());
        System.out.println(stack.isFull());
        stack.push(5);
        stack.push(3);
        stack.push(1);
        stack.push( 7);
        stack.push(9);
        stack.printStack();
        System.out.println(stack.isFull());
        stack.peek();
        stack.push(3);
        stack.printStack();
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.printStack();

        
    }
    
}
