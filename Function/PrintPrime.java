import java.util.*;

public class PrintPrime {
    public static boolean checkprime(int a) {
        if(a==2) {
            return true;
        }
        for(int i=2; i<=Math.sqrt(a); i++) {
            if(a%i==0) {
                return false;
            }
        }
        return true;
    }

    public static void printPrime(int a) {
        for(int i=2; i<a; i++) {
            if(checkprime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String args[]) {
        int n=100;
        System.out.println("n: " + n);
        printPrime(n);
    }
}