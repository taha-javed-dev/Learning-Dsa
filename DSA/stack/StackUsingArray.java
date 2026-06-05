package stack;

public class StackUsingArray {
    private int size;
    private int arr[];
    private int top;

    public StackUsingArray(int size) {
        this.size = size;
        arr = new int[size];
        top = -1;
    }

    public boolean isEmpty() {
       return top == -1;
    }
    public boolean isFull() {
        return top == size - 1;
    }
    public boolean push(int element){
        if (isFull()) {
            System.out.println("Stack Ovreflow");
            return false;
        }
        else {
            top++;
            arr[top] = element;
            return true;
        }
    }
    public int pop(){
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        else {
            int temp = arr[top];
            top--;
            return temp;
        }
    }
    public int peek(){
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        else {
            return arr[top];        }
    }

    public  void printStack() {
        for(int i = 0; i<= top; i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }

}
