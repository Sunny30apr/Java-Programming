import java.util.*;

public class CalcXpowerN {
    // public static int calcXpowerN(int x, int n) { //O(n)
    //     if(n==0) {
    //         return 1;
    //     }

    //     return (x * calcXpowerN(x, n-1));
    // }

    public static int calcXpowerN(int x, int n) { //O(logn)
        if(n==0) {
            return 1;
        }

        int halfPower = calcXpowerN(x, n/2);
        int halfPowerSq = halfPower * halfPower;
        
        if(n%2 != 0) {
            halfPowerSq = x * halfPowerSq;
        }

        return halfPowerSq;
        
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x and n(x^n): ");
        int x = sc.nextInt();
        int n = sc.nextInt();

        System.out.print("calculation of x^n = " + calcXpowerN(x, n));

    } 
}