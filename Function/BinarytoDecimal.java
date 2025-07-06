import java.util.*;

public class BinarytoDecimal {
    public static int B2D(int a) {
        int ans=0, i=0;
        while(a>0) {
            int digit=a%10;
            ans+=digit*Math.pow(2, i);
            i++;
            a=a/10;
        }
        return ans;
    }

    public static void main(String args[]) {
        int a=101;
        int decimal=B2D(a);
        System.out.println("Binary to decimal of " + a + " is: " + decimal);
    }    
        
}