package linkedList;

import static linkedList.LearningLinkedList.printLinkedList;

public class RemoveDuplicates {


    public static void main(String[] args) {

        Node head = new Node(1);
        Node n1 = new Node(1);
        Node n2 = new Node(3);
        Node n3 = new Node(7);
        Node n4 = new Node(8);
        Node n5 = new Node(9);
        Node n6 = new Node(9);


        head.next = n1; n1.next = n2; n2.next = n3; n3.next = n4; n4.next = n5; n5.next = n6;

        printLinkedList(head);
        Node newHead = removeDuplicate(head);
        printLinkedList(newHead);
    }

    public static Node removeDuplicate(Node head) {

        Node mainPointer = head;
        Node newNode = null;
        Node temp = head;

        while (mainPointer != null) {
            while (mainPointer.next != null && mainPointer.data == mainPointer.next.data) {
                mainPointer = mainPointer.next;
            }
            if (newNode == null) {
                newNode = temp = mainPointer;
            } else {
                temp.next = mainPointer;
                temp = mainPointer;
            }
            mainPointer = mainPointer.next;
        }
        return newNode;
    }


}
