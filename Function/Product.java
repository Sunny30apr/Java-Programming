import java.util.*;

public class Product {
    public static int product(int a, int b) {
        int mul=a*b;
        return mul;
    }

    public static void main(String args[]) {
        int a=3;
        int b=5;
        System.out.println("a: " + a + " b: " + b);
        int mul = product(a, b);
        System.out.println("a * b = " + mul);
    }
}