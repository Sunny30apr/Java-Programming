import java.util.*;

public class XpowerX {
    public static int calculatexPowerx(int num) {
        int temp=num;
        int ans=1;
        while(temp>0) {
            if((temp&1) != 0) {
                ans = ans * num;
            }
            num=num*num;
            temp=temp>>1;
        }
        return ans;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter X: ");
        int X=sc.nextInt();

        System.out.print("X^X = " + calculatexPowerx(X));
    }
}