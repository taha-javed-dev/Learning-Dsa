package ii_linkedList;
import static ii_linkedList.LearningLinkedList.printLinkedList;

import static ii_linkedList.ReverseLinkedList.reverseLinkedList;

//LC problem no: 234
public class CheckIsPalindrome {

    public static void main(String[] args) {

        Node head = new Node(1);
        Node n1 = new Node(1);
        Node n2 = new Node(1);
        Node n3 = new Node(1);
        Node n4 = new Node(1);
        Node n5 = new Node(2);
        Node n6 = new Node(1);


        head.next = n1; n1.next = n2; n2.next = n3; n3.next = n4; n4.next = n5; n5.next = n6;

        printLinkedList(head);
        System.out.println(isPalindrome(head));
    }


        public static boolean isPalindrome(Node head) {

            if (head == null || head.next == null) {
                return true;
            }
            Node middle = middleOfLinkedList(head);
            Node rightHead = reverseLinkedList(middle);
            Node curr = head;
            while (rightHead != null) {

                if (rightHead.data != curr.data) {
                    return false;
                }
                rightHead = rightHead.next;
                curr = curr.next;
            }
            return true;
        }

        public static Node middleOfLinkedList(Node head) {
            Node slow = head;
            Node fast = head;
            while(fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }


    }

