import java.util.*;

public class CountSetBits {
    public static int countSetBits(int n) {
        int count=0;
        while(n>0) {
            if((n&1) == 1) {
                count++;
            }
            n=n>>1;
        }
        return count;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int num=sc.nextInt();
        System.out.print("Number of set bits in " + num + " is: " + countSetBits(num));
    }
}