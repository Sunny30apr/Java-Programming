import java.util.*;

public class BubbleSortDesc {
    public static void sort(int arr[]) {
        int n=arr.length;
        
        for(int i=1; i<n; i++) {
            for(int j=n-1; j>=i; j--) {
                if(arr[j]>arr[j-1]) {
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
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
        int nums[]={3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        System.out.println("Original Array: ");
        printArray(nums);
        sort(nums);
        System.out.println("Sorted Array: ");
        printArray(nums);
    }
}