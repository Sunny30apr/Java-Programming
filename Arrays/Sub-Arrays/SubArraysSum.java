import java.util.*;

public class SubArraysSum {
    public static void subArrays(int arr[]) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++) {
            for(int j=i; j<arr.length; j++) {
                int sum=0;
                for(int k=i; k<=j; k++) {
                    sum+=arr[k];
                }
                System.out.print(sum + " ");
                if(max<sum) {
                    max=sum;
                }
                if(min>sum) {
                    min=sum;
                }
            }
            System.out.println();
        }
        
        System.out.println("Max sum of the Subarrays are: " + max);
        System.out.println("Min sum of the Subarrays are: " + min);

    }

    public static void main(String args[]) {
        int nums[] = {1,-2,6,-1,3};
        subArrays(nums);
    }
}