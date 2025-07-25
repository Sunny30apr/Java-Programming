import java.util.*;

public class BinomialCoefficient {
    public static int factorial(int a) {
        int ans=1;
        while(a>0) {
            ans*=a;
            a--;
        }
        return ans;
    }

    public static int binomialCoefficient(int n, int r) {
        int fact_n=factorial(n);
        int fact_r=factorial(r);
        int fact_nmr=factorial(n-r);

        int ans=fact_n/(fact_r*fact_nmr);
        return ans;
    }

    public static void main(String args[]) {
        int n=5, r=2;
        System.out.println("n= " + n + " and r= " + r);
        //int ans = factorial(n)/(factorial(r)*factorial(n-r));
        int ans=binomialCoefficient(n, r);
        System.out.println("Binomial Cofficient is: " + ans);
    }
}