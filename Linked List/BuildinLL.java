import java.util.*;

public class BuildinLL {
    public static void main(String args[]) {
        LinkedList<Integer> ll = new LinkedList<>();

        //add
        ll.addFirst(1);
        ll.add(1,2);
        ll.addLast(3);
        System.out.println(ll);

        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
        
    }
}