import java.util.*;

public class BinarySearchInSortedRotated {
    public static int binarySearch(int arr[], int key) {
        int start=0;
        int end=arr.length-1;

        while(start<=end) {
            int mid=start + (end-start)/2;
            if(arr[mid]==key) {
                return mid;
            }
            else if (arr[start] <= arr[mid]){
                if(key >= arr[start] && key <= arr[mid]) {
                    end=mid-1;
                }
                else {
                    start=mid+1;
                }
            }
            else {
                if(key >= arr[mid] && key <= arr[end]) {
                    start=mid+1;
                }
                else {
                    end=mid-1;
                }
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int nums[]={4,5,6,7,0,1,2};
        int target=0;
        int ans = binarySearch(nums, target);
        System.out.print(ans);
    }
}