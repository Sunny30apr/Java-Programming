import java.util.*;

public class ZigZagLL {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public static void addFirst(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public static void print() {
        if(head == null) {
            System.out.print("LL is Empty.");
            return;
        }

        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static Node findMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        Node next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void zigZag(Node head) {
        // Step 1: Find mid
        Node midNode = findMid(head);

        // Step 2: Split & reverse second half
        Node second = midNode.next;
        midNode.next = null; 
        second = reverse(second);

        // Step 3: Merge two halves
        Node leftHead = head;
        Node rightHead = second;
        Node nextL, nextR;

        while(leftHead != null && rightHead != null) {
            nextL = leftHead.next;
            leftHead.next = rightHead;
            nextR = rightHead.next;
            rightHead.next = nextL;

            leftHead = nextL;
            rightHead = nextR;
        }
    }

    public static void main(String args[]) {
        addFirst(5);
        addFirst(4);
        addFirst(3);
        addFirst(2);
        addFirst(1);

        print();
        zigZag(head);
        print();
    }
}