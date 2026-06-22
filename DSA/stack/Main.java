package stack;

public class Main {

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
        System.out.println(stack.peek());
        stack.push(3);
        stack.printStack();
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.printStack();

        StackUsingLL stackLL = new StackUsingLL();
        System.out.println(stackLL.isEmpty());
        stackLL.push(3);
        stackLL.push(4);
        System.out.println(stackLL.peek());
        System.out.println(stackLL.pop());
        System.out.println(stackLL.pop());
        System.out.println(stackLL.pop());
        
        
    }
    
}
