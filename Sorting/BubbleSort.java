import java.util.*;

public class BubbleSort {
    public static void sort(int arr[]) {
        int n=arr.length;
        for(int i=1; i<n; i++) {
            int swap=0;
            for(int j=0; j<n-i; j++) {
                if(arr[j]>arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap++;
                }
            }
            if(swap==0) {
                return;
            }
        }
    }

    public static void printArray(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int nums[]={5,4,3,1,2};
        System.out.println("Original Array: ");
        printArray(nums);
        sort(nums);
        System.out.println("Sorted Array: ");
        printArray(nums);
    }
}