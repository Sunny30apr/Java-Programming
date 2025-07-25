import java.util.*;

public class AreaCircle{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter radius of circle: ");
        double r=sc.nextInt();
        double area=3.14*r*r;
        System.out.print("Area of circle: " + area);

    }
}