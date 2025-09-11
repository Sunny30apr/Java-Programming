import java.util.*;

public class ConstantWindow {
    public static int maxSum(int arr[], int k) {

        int l = 0;
        int r = k-1;
        int max = 0;
        for(int i=0; i<=r; i++) {
            max+=arr[i];
        }

        int sum = max;
        while(r < arr.length-1) {
            sum -= arr[l];
            l++;
            r++;
            sum += arr[r];
            max = Math.max(max, sum);
        }
        return max;

    }

    public static void main(String args[]) {
        int arr[] = {1,2,3,3,-1,5,4,-1};
        int k=4;
        System.out.print("Max. sum of consective " + k + " elements is: " +  maxSum(arr, k));
    }
}