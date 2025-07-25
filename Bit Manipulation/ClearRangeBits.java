import java.util.*;

public class ClearRangeBits {
    public static int clearRangeBits(int num, int i, int j) {
        int a=((~0)<<(j+1));
        int b=(1<<i)-1;
        int bitmask=a|b;
        return (num & bitmask);

    }
    public static void main(String args[]) {
        System.out.println(clearRangeBits(63, 2, 4));
        System.out.print("11111100 -> 11000100");

    }
}