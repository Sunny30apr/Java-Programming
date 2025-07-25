import java.util.*;

public class Averageof3 {
    public static double average(double a, double b, double c) {
        double avg=((a+b+c)/3);
        return avg;
    }

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        double a=sc.nextInt();
        double b=sc.nextInt();
        double c=sc.nextInt();

        double avg = average(a, b, c);
        System.out.println("Average of the three numbers: " + avg);
    }
}