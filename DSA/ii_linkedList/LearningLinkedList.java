package ii_linkedList;

public class LearningLinkedList {


    public static void main(String[] args) {

        Node head = new Node(1);
        Node n1 = new Node(3);
        Node n2 = new Node(5);
        Node n3 = new Node(7);
        Node n4 = new Node(8);

        head.next = n1; n1.next = n2; n2.next = n3; n3.next = n4;

        printLinkedList(head);
        head = insertInLinkedList(0,head,0);
        printLinkedList(head);
        head = deleteInLinkedList(0,head);
        printLinkedList(head);


    }

    public static Node insertInLinkedList(int pos, Node head, int data) {

        Node newNode = new Node(data);
        Node temp = head;

        if (pos == 0) {
            newNode.next = temp;
            return newNode;
        }

        for (int i = 0; i<pos-1; i++){
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        return head;
    }

    public static Node deleteInLinkedList(int pos, Node head) {
        Node temp = head;

        if (pos == 0) {
            return head.next;
        }

        for (int i = 0; i<pos-1; i++){
            temp = temp.next;
        }

        temp.next = temp.next.next;
        return head;
    }


    public static void printLinkedList( Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println();
    }

}

