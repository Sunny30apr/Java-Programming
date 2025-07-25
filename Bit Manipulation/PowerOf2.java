import java.util.*;

public class PowerOf2 {
    public static boolean checkPowerOf2(int num) {
        return (num & num-1)==0;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        if(checkPowerOf2(n)) {
            System.out.print(n + " is a Power of 2");
        }
        else {
            System.out.print(n + " is not a Power of 2");
        }
    }
}