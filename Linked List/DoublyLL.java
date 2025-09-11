import java.util.*;

public class DoublyLL {
    public static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public static void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public static void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }

        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
        tail = newNode;
    }

    public static int removeFirst() {
        if(head ==null) {
            System.out.print("DLL is empty.");
            return Integer.MIN_VALUE;
        }

        if(size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }

        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }

    public static int removeLast() {
        if(head == null) {
            System.out.print("DLL is empty");
            return Integer.MIN_VALUE;
        }

        if(size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }

        int val = tail.data;
        tail = tail.prev;
        tail.next = null;
        size--;
        return val;
    }

    public static void print() {
        if(head == null) {
            System.out.print("LinkedList is Empty.");
            return;
        }

        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]) {
        DoublyLL dll = new DoublyLL();
        dll.addFirst(5);
        dll.addFirst(4);
        dll.addFirst(3);
        dll.addLast(2);
        dll.addLast(1);

        print();

        System.out.println(dll.removeFirst());
        print();
        System.out.println(dll.removeLast());
        print();
    }
}