public class MyLinkedList {
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

    //add()
    public void addFirst(int data) {
        //step1 = create new node
        Node newNode =  new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }

        //step2 - newNode next = head
        newNode.next = head;

        //step3 - head = newNode
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode =  new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void add(int idx, int data) {
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

    //remove()
    public int removeFirst() {
        if(size == 0) {
            System.out.println("LL is empty.");
            return Integer.MIN_VALUE;
        }
        else if(size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        if(size == 0) {
            System.out.print("LL is empty.");
            return Integer.MIN_VALUE;
        }
        else if(size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        //prev : i = size-2
        Node prev = head;
        for(int i=0; i<size-2; i++) {
            prev = prev.next;
        }

        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }
    
    //print()
    public void print() {
        if(head == null) {
            System.out.println("LL is empty");
            return;
        }

        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //search()
    public int itrSearch(int key) {
        Node temp = head;
        // for(int i=0; i<size; i++) {
        int i=0;
        while(temp != null) {
            if(temp.data == key) {
                return i;
            }
            else {
                temp = temp.next;
                i++;
            }
        }
        return -1;
    }

    public int helper(Node head, int key) {
        if(head == null) {
            return -1;
        }

        if(head.data == key) {
            return 0;
        }

        int idx = helper(head.next, key);
        if(idx == -1) {
            return -1;
        }

        return idx+1;
    }

    public int recSearch(int key) {
        return helper(head, key);
    }

    public static void main(String args[]) {
        MyLinkedList ll = new MyLinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(3);
        ll.add(2, 4);

        ll.print();
        ll.removeFirst();
        ll.removeLast();
        ll.print();

        System.out.println(ll.size);

        System.out.println(ll.recSearch(2));

        System.out.println(ll.itrSearch(4));

    }
}