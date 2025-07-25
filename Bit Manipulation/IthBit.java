import java.util.*;

public class IthBit {
    public static int getIthBit(int num, int i) {
        int bitmask=1<<i;
        if((num & bitmask)==0) {
            return 0;
        }
        else {
            return 1;
        }
    }

    public static int setIthBit(int num, int i) {
        int bitmask=1<<i;
        return (num | bitmask);
    }

    public static int clearIthBit(int num, int i) {
        int bitmask=~(1<<i);
        return (num & bitmask);
    }

    public static int updateIthBit(int num, int i, int newBit) {
        if(newBit==0) {
            return clearIthBit(num, i);
        }
        else {
            return setIthBit(num, i);
        }
    }
    
    public static int clearIBits(int num, int i) {
        int bitmask=(~0)<<i;
        return (num & bitmask);
    }

    public static void main(String args[]) {
        int num=11;
        int temp=num;
        while(temp>0) {
            System.out.print(temp%2 + " ");
            temp/=2;
        }
        System.out.println();
        System.out.println("3rd bit: " + getIthBit(num, 2));
        System.out.println("3rd bit set to 1, Number becomes: " + setIthBit(num, 2));
        System.out.println("2nd bit set to 0, Number becomes: " + clearIthBit(num, 1));
        System.out.println("update 2nd bit set to 1 to 0, Number becomes: " + updateIthBit(num, 2, 1));
        System.out.println(clearIBits(15, 2));
    }
}