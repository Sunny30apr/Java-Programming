import java.util.*;

public class UseContinue {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.print("Enter your number: ");
            int n=sc.nextInt();
            if(n==0) {
                break;
            }
            else if(n%10==0) {
                continue;
            }
            else {
                System.out.println(n);
            }
        }
    }
}