import java.util.*;

public class LargestOf3 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        int max;
        if(a>=b) {
            if(a>=c) {
                max=a;
            }
            else {
                max=c;
            }
        }
        else{
            if(b>=c) {
                max=c;
            }
            else {
                max=b;
            }
        }
        System.out.print("Largest among three is: "+ max);

    }
}