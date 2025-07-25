import java.util.*;

public class Printnto1 {
    public static void printnto1(int num) {
        if(num==0) {
            System.out.print(0);
            return;
        }

        System.out.print(num + " ");
        printnto1(num-1);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a num: ");
        int n=sc.nextInt();

        System.out.print("Printing number from " + n + " to 1 is: ");
        printnto1(n);
    }
}