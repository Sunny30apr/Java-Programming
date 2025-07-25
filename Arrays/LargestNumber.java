import java.util.*;

public class LargestNumber {
    public static int largestNum(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            if(arr[i]>max) {
                max=arr[i];
            }
        }
        return max;
    }

    public static void main(String args[]) {
        int nums[]={1,2,6,3,5};

        int ans=largestNum(nums);
        System.out.print("Largest number: " + ans);
        
        
    }
}