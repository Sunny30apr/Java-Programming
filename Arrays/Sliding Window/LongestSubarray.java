import java.util.*;

public class LongestSubarray {
    // //Brute Force
    // public static int maxSubarrayLength(int arr[], int k) {
    //     int n = arr.length;
    //     int maxlen = 0;
    //     for(int i=0; i<n; i++) {
    //         int sum=0;
    //         for(int j=i; j<n; j++) {
    //             sum+=arr[j];
    //             if(sum <= k) {
    //                 maxlen = Math.max(maxlen, j-i+1);
    //             }
    //         }
    //     }
    //     return maxlen;
    // }
    
    public static int maxSubarrayLength(int arr[], int k) {
        int l=0, r=0;
        int maxlen = 0;
        int sum = 0;
        while(r < arr.length) {
            sum+=arr[r];
            while(sum > k) {
                sum-=arr[l];
                l++;
            }
            if(sum <= k) {
                maxlen = Math.max(maxlen, r-l+1);
            }
            r++;  
        }
        return maxlen;
    }

    public static void main(String args[]) {
        int arr[] = {2,5,1,7,10};
        int k = 14;
        System.out.print(maxSubarrayLength(arr, k));
    }
}