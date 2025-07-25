import java.util.*;

public class AreaSquare{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the side of sqaure: ");
        int side=sc.nextInt();
        int area=(side*side);
        System.out.print("Area of the sqaure: "+ area);
    }
}
