import java.util.*;

public class CheckSorted {
    public static boolean checkSorted(int arr[], int n) {
        if(n == arr.length-1) {
            return true;
        }

        if(arr[n] > arr[n+1]) {
            return false;
        }

        return checkSorted(arr, n+1);
    }

    public static void main(String args[]) {
        int nums[]={1,2,4,3,5};

        if(checkSorted(nums, 0)) {
            System.out.print("Array is Sorted.");
        }
        else {
            System.out.print("Array is not Sorted.");
        }

    }
}