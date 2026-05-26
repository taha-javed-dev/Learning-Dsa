package linkedList;

import static linkedList.LearningLinkedList.printLinkedList;

//LC problem no: 206
public class ReverseLinkedList {

    public static void main(String[] args) {

        Node head = new Node(1);
        Node n1 = new Node(2);
        Node n2 = new Node(5);
        Node n3 = new Node(7);
        Node n4 = new Node(8);

        head.next = n1; n1.next = n2; n2.next = n3; n3.next = n4;

        printLinkedList(head);
        Node newHead = reverseLLRecursively(head);
        printLinkedList(newHead);

    }

    public static Node reverseLinkedList(Node head) {

        if (head == null || head.next == null) return head;

        Node curr = head.next;
        Node prev = head;
        head.next = null;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public static Node reverseLLRecursively(Node head) {

        if (head == null || head.next == null) return head;

        Node newHead = reverseLinkedList(head.next);

        head.next.next = head;
        head.next = null;

        return newHead;
    }


}


