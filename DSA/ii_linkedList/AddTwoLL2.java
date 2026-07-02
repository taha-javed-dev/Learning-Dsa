package ii_linkedList;
import static ii_linkedList.LearningLinkedList.printLinkedList;

// (Question) LC -> 445
public class AddTwoLL2 {

    public static void main(String[] args) {
        Node head = new Node(7);
        Node n1 = new Node(2);
        Node n2 = new Node(4);
        Node n3 = new Node(3);

        head.next = n1; n1.next = n2; n2.next = n3;

        Node head2 = new Node(5);
        Node n21 = new Node(6);
        Node n22 = new Node(4);

        head2.next = n21; n21.next = n22; 

        printLinkedList(head);
        printLinkedList(head2);
        System.out.println("output should be 7->8->0->7 according to question");
        System.out.println("answer is : ");
        Node ans = addTwoNumbers(head, head2);
        printLinkedList(ans);
    }

     public static Node addTwoNumbers(Node l1, Node l2) {
        
        Node h1 = reverseLL(l1);
        Node h2 = reverseLL(l2);

        Node addedLL = addTwoLL(h1,h2);
        Node ans = reverseLL(addedLL);
        return ans;
    }

    public static Node addTwoLL(Node l1, Node l2) {
        Node h1 = l1;
        Node h2 = l2;
        Node ans = null;
        Node temp = null;
        int carry = 0;

        while(h1 != null || h2 != null || carry != 0) {
            int sum = carry;
            if(h1 != null) {
                sum += h1.data;
                h1 = h1.next;
            }
            if(h2 != null) {
                sum += h2.data;
                h2 = h2.next;
            }
            
            int digit = sum % 10;
            carry = sum / 10;
            Node newNode = new Node(digit);
            if(ans == null) {
                ans = temp = newNode;
            }
            else {
                temp.next = newNode;
                temp = newNode;
            }
        }
        return ans;
    }

    public static Node reverseLL(Node head) {
        Node curr = head;
        Node prev = null;
        while(curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}