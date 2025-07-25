import java.util.*;

public class FastExponent {
    public static int fastExponentiation(int base, int power) {
        int ans=1;
        while(power>0) {
            if((power & 1) != 0) {
                ans=ans*base;
            }
            base=base*base;
            power=power>>1;
        }
        return ans;
    }

    public static void main(String args[]) {
        System.out.print(fastExponentiation(2, 4));
    }
}