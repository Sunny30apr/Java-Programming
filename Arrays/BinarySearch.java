import java.util.*;

public class BinarySearch {
    public static int binarySearch(int arr[], int key){
        int start=0, end=arr.length-1;

        while(start<=end) {
            int mid=(start+end)/2;
            
            if(arr[mid]==key) {
                return mid;
            }
            else if(arr[mid]<key) {
                start=mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int nums[]={2,4,6,8,10,12,14,16};
        int key=10;

        int ans=binarySearch(nums, key);
        if(ans==-1) {
            System.out.print("Element is not available in array.");
        }
        else {
            System.out.print("Index of the key element in array is: " + ans);  
        }
        
    }
}