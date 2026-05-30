package linkedList;

import static linkedList.LearningLinkedList.printLinkedList;

public class ReverseNodeInKGroup {

    public static void main(String[] args) {

        Node head = new Node(1);
        Node n1 = new Node(2);
        Node n2 = new Node(5);
        Node n3 = new Node(7);
        Node n4 = new Node(8);

        int k = 2;

        head.next = n1; n1.next = n2; n2.next = n3; n3.next = n4;
        printLinkedList(head);
        Node reversed = reverseKGroup(head,k);
        printLinkedList(reversed);
    }

    public static Node reverseKGroup(Node head, int k) {
        Node dummy = new Node(-1);
        Node prevTail = dummy;
        prevTail.next = head;
        Node curr = head;

        while(curr != null) {
            Node currTail = findCurrentTail(curr, k);
            if(currTail == null) break;
            Node nextCurr = currTail.next;
            reverseListFromKth(curr, k); 
            prevTail.next = currTail;
            prevTail = curr;
            curr = nextCurr;
        } 
        prevTail.next = curr;
        return dummy.next;
    }

    public static Node findCurrentTail(Node head, int k) {
        Node temp = head;
        for(int i = 0; i<k-1; i++) {
            temp = temp.next;
            if(temp == null) return null;
        }
        return temp;
    }

    public static Node reverseListFromKth(Node head, int k) {
        if( head == null || head.next == null) return head;
        Node curr = head;
        Node prev = null;
        int count = 0;

        while(count < k && curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }
        return prev;
    }
    
}
