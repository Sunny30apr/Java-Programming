import java.util.*;

public class CircularLL {
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
    public static int size;

    public static void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            newNode.next = head;
            return;
        }

        newNode.next = head;
        head = newNode;
        tail.next = head;
    }

    public static void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            newNode.next = head;
            return;
        }

        tail.next = newNode;
        tail = newNode;
        tail.next = head;
    }

    public static void add(int idx, int data) {
        if(idx == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;
        Node temp = head;

        int i=0;
        while(i < idx-1) {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public static int removeFirst() {
        if(size == 0) {
            System.out.print("LL is empty.");
            return Integer.MIN_VALUE;
        }

        if(size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = head.data;
        tail.next = head.next;
        head = head.next;
        return val;

    }

     public static int removeLast() {
        if(size == 0) {
            System.out.print("LL is empty.");
            return Integer.MIN_VALUE;
        }

        if(size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int i=0;
        Node temp = head;
        while(i < size-2) {
            temp = temp.next;
        }

        int val = tail.data;
        temp = tail;
        temp.next = head;
        return val;
    }
    
    public static void print() {
        System.out.print(head.data + " -> ");
        Node temp = head.next;
        while(temp != head) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println(head.data + " (head)");
    }

    public static void main(String args[]) {
        addFirst(3);
        addFirst(2);
        addFirst(1);
        addLast(5);
        add(3, 4);
        
        print();
        System.out.println(removeFirst());
        print();
        System.out.println(removeFirst());
        print();
        
    }
}