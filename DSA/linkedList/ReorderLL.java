package linkedList;

import static linkedList.LearningLinkedList.printLinkedList;
import static linkedList.ReverseLinkedList.reverseLinkedList;

// LC -> 143
public class ReorderLL {

    public static void main(String[] args) {
        Node head = new Node(1);
        Node n1 = new Node(2);
        Node n2 = new Node(5);
        Node n3 = new Node(7);
        

        head.next = n1; n1.next = n2; n2.next = n3; 

        printLinkedList(head);
        Node newHead = reorderList(head);
        printLinkedList(newHead);
    }

    public static Node reorderList(Node head) {
        
        if(head == null || head.next == null) return head;

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node l1 = head;
        Node l2 = reverseLinkedList(slow);
        
        while(l2.next != null) {
            if(l1 == l2) {
                l1.next = null;
                break;
            }

            Node nextL1 = l1.next;
            Node nextL2 = l2.next;
            
            l1.next = l2;
            l2.next = nextL1;

            l1 = nextL1;
            l2 = nextL2;

        }
        return head;
    }
}