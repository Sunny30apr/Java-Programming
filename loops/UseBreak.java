import java.util.*;

public class UseBreak {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.print("Enter your number: ");
            int n=sc.nextInt();
            if(n%10==0) {
                break;
            }
            else {
                System.out.println(n);
            }
        }
    }
}