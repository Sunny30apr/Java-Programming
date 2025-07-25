import java.util.*;

public class Print1ton {
    public static void print1ton(int num) {
        if(num==0) {
            System.out.print(0 + " ");
            return;
        }

        print1ton(num-1);
        System.out.print(num + " ");   
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a num: ");
        int n=sc.nextInt();

        System.out.print("Printing number from 1" + " to " + n + " is: ");
        print1ton(n);
    }
} 