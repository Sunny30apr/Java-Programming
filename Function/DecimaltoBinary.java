import java.util.*;

public class DecimaltoBinary {
    public static int D2B(int a) {
        int ans=0, i=0;
        while(a>0) {
            int digit=a%2;
            ans+=digit*Math.pow(10, i);
            i++;
            a/=2;
        }
        return ans;
    }

    public static void main(String args[]) {
        int a=8;
        int decimal=D2B(a);
        System.out.println("Decimal to binary of " + a + " is: " + decimal);
    }    
        
}