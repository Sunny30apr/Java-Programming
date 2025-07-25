import java.util.*;

public class Swap {
    public static void swapfun(int a, int b) {
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a: " + a + " b: " + b);
    }
    public static void main(String args[]) {
        int a=7;
        int b=5;
        System.out.println("a: " + a + " b: " + b);
        swapfun(a, b);
    }
}