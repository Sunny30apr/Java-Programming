import java.util.*;

public class FriendsPairing {
    public static int count(int n) {
        if(n==1 || n==2) {
            return n;
        }

        return count(n-1) + count(n-2) * (n-1);
    }

    public static void main(String args[]) {
        System.out.print(count(4));
    }
} 