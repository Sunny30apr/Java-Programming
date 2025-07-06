import java.util.*;

public class Question2 {
    public static int rotatedbinarySearch(int arr[], int key) {
        int n=arr.length;
        
        int start=0;
        int end=n-1;
        while(start<=end) {
            int mid=(start+end)/2;
            if(arr[mid]==key) {
                return mid;
            }
            else if(arr[mid]>arr[start] ){
                if(arr[start]<=key && arr[mid]>=key) {
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else {
                if(arr[mid]<=key && arr[mid]>=key) {
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
        int nums[]={1};
        int target=0;
        System.out.print(rotatedbinarySearch(nums, target));
    }
}