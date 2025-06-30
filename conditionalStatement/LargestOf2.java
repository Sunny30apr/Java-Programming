import java.util.*;

public class LargestOf2 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter 2 numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>b) {
            System.out.print("Largest no. is: "+a);
        }   
        else {
            System.out.print("Largest no. is: "+b);
        }     
    }
}