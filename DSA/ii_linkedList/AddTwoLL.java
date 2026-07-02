package ii_linkedList;
import static ii_linkedList.LearningLinkedList.printLinkedList;

//LC problem no: 2
public class AddTwoLL {

    public static void main(String[] args) {
        
        Node head = new Node(2);
        Node n1 = new Node(1);
        Node n2 = new Node(9);
        Node n3 = new Node(7);
        Node n4 = new Node(8);

        head.next = n1; n1.next = n2; n2.next = n3; n3.next = n4;

        Node head2 = new Node(1);
        Node n21 = new Node(3);
        Node n22 = new Node(9);

        head2.next = n21; n21.next = n22; 

        Node sumLL = addTwoLinkedList(head, head2);
        printLinkedList(head);
        printLinkedList(head2);
        printLinkedList(sumLL);
    }

    public static Node addTwoLinkedList(Node l1, Node l2) {
        Node head1 = l1;
        Node head2 = l2;
        Node ans = null;
        Node temp = null;
        int carry = 0;
        while(head1 != null || head2 != null || carry != 0) {
            int sum = carry;
            if(head1 != null) {
                sum += head1.data;
                head1 = head1.next;
            }
            if(head2 != null) {
                sum += head2.data;
                head2 = head2.next;
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
}