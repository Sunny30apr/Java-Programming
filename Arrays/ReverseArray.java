import java.util.*;

public class ReverseArray {
    public static void reverse(int arr[]) {
        int start=0, end=arr.length-1;

        while(start<end) {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    public static void printArray(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int nums[] = {2,4,6,8,10};

        printArray(nums);
        reverse(nums);
        printArray(nums);

    }
}