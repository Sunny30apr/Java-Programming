import java.util.*;

public class DeleteNth {
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
            System.out.println("LL is empty");
            return;
        }
        
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void deleteNthfromEnd(int n) {
        int sz = 0;
        Node temp = head;
        while(temp != null) {
            temp = temp.next;
            sz++;
        }

        if(n == sz) {
            head = head.next; //removeFirst
            return;
        }

        int i=1;
        int iToFind = sz-n;
        Node prev = head;
        while(i < iToFind) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;
    }

    public static void main(String args[]) {
        addLast(1);
        addLast(2);
        addLast(3);
        addLast(4);
        addLast(5);

        System.out.println("Original list:");
        print();

        deleteNthfromEnd(3); // delete 3rd node from end

        System.out.println("After deletion:");
        print();
        
    }
}
