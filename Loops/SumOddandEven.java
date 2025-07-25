import java.util.*;

public class SumOddandEven {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int sumEven=0, sumOdd=0, n;
        do {
            System.out.print("Enter number: ");
            n=sc.nextInt();

            if(n%2==0) {
                sumEven+=n;
            }
            else {
                sumOdd+=n;
            }

            System.out.println("if you want to exit the program press 0.");
            if(n==0) {
                break;
            }
        }
        while (true);

        System.out.println("Sum of all odd integers: " + sumOdd);
        System.out.println("Sum of all even integers: " + sumEven);

    }
}