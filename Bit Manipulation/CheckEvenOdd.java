import java.util.*;

public class CheckEvenOdd {
    public static boolean checkEvenOdd(int num) {
        if((num&1) == 1) {
            return false;
        }
        return true;
    }

    public static void main(String args[]) {
        int n=12;
        if(checkEvenOdd(n)) {
            System.out.print(n + " is Even number.");
        }
        else {
            System.out.print(n + " is Odd number.");
        }
    }
}