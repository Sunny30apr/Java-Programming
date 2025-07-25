import java.util.*;

public class KadaneAlgo {
    public static void kadane(int arr[]) {
        int max=Integer.MIN_VALUE;
        int sum=0;
        
        for(int i=0; i<arr.length; i++) {
            sum+=arr[i];
            if(sum<0) {
                sum=0;
            }
            if(sum>max) {
                max=sum;
            }
        }
        System.out.print("Max sum of the subarrays: " + max);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int nums[]={-2,-3,-4,-1,-2,-1,-5,-3};
        kadane(nums);

    }
}