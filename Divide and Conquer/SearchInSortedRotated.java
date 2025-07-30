import java.util.*;

public class SearchInSortedRotated {
    public static int searchInSorted(int arr[], int key, int start, int end) {
        if(start > end) {
            return -1;
        }

        int mid=start + (end-start)/2;
        if (arr[mid]==key) {
            return mid;
        }

        if(arr[start] <= arr[mid]) {
            if(arr[start] <= key && arr[mid] >= key) {
                return searchInSorted(arr, key, start, mid-1);
            }
            else {
                return searchInSorted(arr, key, mid+1, end);
            }
        }
        else {
            if(key >= arr[mid] && key <= arr[end]) {
                return searchInSorted(arr, key, mid+1, end);
            }
            else {
                return searchInSorted(arr, key, 0, mid-1);
            }
        }
        
    }

    public static void main(String args[]) {
        int nums[]={4,5,6,7,0,1,2};
        int target=0;
        int ans = searchInSorted(nums, target, 0, nums.length-1);
        System.out.print(ans);
    }
}