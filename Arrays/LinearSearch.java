import java.util.*;

public class LinearSearch {
    public static int linearSearch(int arr[], int key){
        for(int i=0; i<arr.length; i++) {
            if(arr[i]==key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int nums[]={2,4,6,8,10,12,14,16};
        int key=10;

        int ans=linearSearch(nums, key);
        if(ans==-1) {
            System.out.print("Element is not available in array.");
        }
        else {
            System.out.print("Index of the key element in array is: " + ans);  
        }
        
    }
}