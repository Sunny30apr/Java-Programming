import java.util.*;

public class SmallLetter {
    public static void main(String[] args) {
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print((char)(ch | ' ') + " ");
            // prints abcdefghijklmnopqrstuvwxyz
        }
    }
}