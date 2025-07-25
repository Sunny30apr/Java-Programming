import java.util.*;

public class CheckPrime {
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
    public static void main(String args[]) {
        int a=2;
        System.out.println("a: " + a);
        if(checkprime(a)) {
            System.out.print("Number is prime number.");
        }
        else {
             System.out.print("Number is non-prime number.");
        }
    }
}