import java.util.*;

public class numbersUptoN {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num=sc.nextInt();

        int n=1;
        while(n<=num) {
            System.out.print(n++ + " ");
        }
    }
}