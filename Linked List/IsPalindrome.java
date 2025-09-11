import java.util.*;

public class IsPalindrome {
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

    public static void add(int idx, int data) {
        if(idx == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        int i=0;
        Node temp = head;
        while(i < idx-1) {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public static void addLast(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public static void print() {
        if(head == null) {
            System.out.print("LL is empty.");
            return;
        }

        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static Node findMid () {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next; //+1
            fast = fast.next.next; //+2
        }
        return slow;
    }

    public static boolean checkPalindrome() {
        if(head == null || head.next == null) {
            return true;
        }

        //step1 - find mid
        Node midNode = findMid();

        //step2 - reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev;
        Node left = head;

        //step3 - check left half AND right half
        while(right != null) {
            if(left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;
    }

    public static void main(String args[]) {
        addLast(1);
        addLast(2);
        addLast(2);
        addLast(1);

        // print();
        System.out.println(checkPalindrome());
        
    }
}