import java.util.*;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n=arr.length;
        
        for(int i=0; i<n-1; i++) {
            int minPos=i;
            for(int j=i+1; j<n; j++) {
                if(arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            int temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
        } 
    }

    public static void printArray(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int nums[] = {5,4,1,3,2};
        System.out.println("Original Array: ");
        printArray(nums);
        selectionSort(nums);
        System.out.println("Sorted Array: ");
        printArray(nums);
    }
}