import java.util.*;

public class Swap2num {
    public static void swap2num(int a, int b) {
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.print("a: " + a + " and b: " + b);
    }

    // public static void swap2num(int a, int b) {
    //     a=a+b;
    //     b=a-b;
    //     a=a-b;
    //      System.out.print("a: " + a + " and b: " + b);
    // }

    public static void main(String args[]) {
        int a=6, b=9;
        System.out.println("a: " + a + " and b: " + b);
        swap2num(a, b);
    }
}