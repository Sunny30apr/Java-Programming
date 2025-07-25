import java.util.*;

public class LastOccurence {
    // public static int lastOccurence(int arr[], int key, int n) {
    //     if(n < 0) {
    //         return -1;
    //     }

    //     if(arr[n] == key) {
    //         return n;
    //     }

    //     return lastOccurence(arr, key, n-1);
    // }

    public static int lastOccurence(int arr[], int key, int n) {
        if(n == arr.length) {
            return -1;
        }

        int isFound = lastOccurence(arr, key, n+1);
        if(isFound == -1 && arr[n] == key) {
            return n;
        }

        return isFound;
    }

    public static void main(String args[]) {
        int nums[]={8,3,6,9,5,10,2,5,3};
        int key=5;

        for(int i=0; i<nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        System.out.print(key + " is present in the array at index: " + lastOccurence(nums, key, 0));

    }
}