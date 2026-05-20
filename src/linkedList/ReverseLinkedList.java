package linkedList;

public class ReverseLinkedList {

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        ListNode n1 = new ListNode(2);
        ListNode n2 = new ListNode(5);
        ListNode n3 = new ListNode(7);
        ListNode n4 = new ListNode(8);

        head.next = n1; n1.next = n2; n2.next = n3; n3.next = n4;

        printLinkedList(head);
//        ListNode newHead = reverseLinkedList(head);
        ListNode newHead = reverseLLRecursively(head);
        printLinkedList(newHead);

    }

    public static ListNode reverseLinkedList(ListNode head) {

        if (head == null || head.next == null) return head;

        ListNode curr = head.next;
        ListNode prev = head;
        head.next = null;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public static ListNode reverseLLRecursively(ListNode head) {

        if (head == null || head.next == null) return head;

        ListNode newHead = reverseLinkedList(head.next);

        head.next.next = head;
        head.next = null;

        return newHead;
    }

    public static void printLinkedList( ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println();
    }
}

class ListNode {
    int data;
    ListNode next;

    public ListNode(int data) {
        this.data = data;
    }
}

