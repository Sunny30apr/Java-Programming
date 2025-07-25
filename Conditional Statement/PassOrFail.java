import java.util.*;

public class PassOrFail {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        String status=(marks>=33) ? "PASS" : "FAIL";
        System.out.print("You are " + status);
    }
}