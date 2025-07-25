import java.util.*;

public class CheckEven {
    public static boolean isEven(int num) {
        if(num%2==0) {
            return true;
        }
        return false;
    }

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        
        if(isEven(n)) {
            System.out.print(n + " is an even number.");
        }
        else {
            System.out.print(n + " is an odd number.");
        }
        
    }
}

