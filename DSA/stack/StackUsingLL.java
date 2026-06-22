package stack;

public class StackUsingLL {

    Node head;
    
    public boolean isEmpty() {
        return head == null;
    }
    public boolean push(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        return true;
    }

    public int pop(){
        if (isEmpty()) return -1;
        int temp = head.data;
        head = head.next;
        return temp;
    }

     public int peek(){
        if (isEmpty()) return -1;
        return head.data;
    }
    private class Node {

        Node next;
        int data;

        public Node(int data){
            this.data = data;
        }
    }


}
