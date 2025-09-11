import java.util.*;

// public class reverseLL {
//     public static void reverse(LinkedList ll) {
//         LinkedList.Node prev = null;
//         LinkedList.Node curr = ll.tail = ll.head;
//         LinkedList.Node next;

//         while (curr != null) {
//             next = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = next;
//         }
//         ll.head = prev;
//     }

//     public static void main(String args[]) {
//         LinkedList ll = new LinkedList();
//         ll.add(0, 1);
//         ll.add(1, 2);
//         ll.add(2, 3);
//         ll.add(3, 4);
//         ll.add(4, 5);

//         ll.print();
//         reverse(ll);
//         ll.print();
//     }
// }

public class reverseLL {
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

        int i = 0;
        Node temp = head;
        while(i < idx-1) {
            temp = temp.next;
            i++;
        }

        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;
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

    public static void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void main(String args[]) {
        add(0, 1);
        add(1, 2);
        add(2, 3);
        add(3, 4);
        add(4, 5);

        print();
        reverse();
        print();
    }
}

