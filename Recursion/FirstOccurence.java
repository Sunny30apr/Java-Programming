import java.util.*;

public class FirstOccurence {
    public static int firstOccurence(int arr[], int key, int n) {
        if(n == arr.length-1) {
            return -1;
        }

        if(arr[n] == key) {
            return n;
        }

        return firstOccurence(arr, key, n+1);
    }

    public static void main(String args[]) {
        int nums[]={8,3,6,9,5,10,2,5,3};
        int key=5;

        for(int i=0; i<nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        System.out.print(key + " is present in the array at index: " + firstOccurence(nums, key, 0));

    }
}