import java.util.*;

public class SubArrays {
    public static void subArrays(int arr[]) {
        int count=0;
        for(int i=0; i<arr.length; i++) {
            for(int j=i; j<arr.length; j++) {
                for(int k=i; k<=j; k++) {
                    System.out.print(arr[k] + " ");
                }
                count++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.print("Total number of Subarrays: " + count);
    }

    public static void main(String args[]) {
        int nums[] = {2,4,6,8,10};
        subArrays(nums);
    }
}