import java.util.*;

public class QuickSort {
    public static void quickSort(int arr[], int start, int end) {
        if(start >= end) {
            return;
        }

        int pivot = partition(arr, start, end);
        // System.out.print(pivot+ "  ");
        quickSort(arr, start, pivot-1); 
        quickSort(arr, pivot+1, end);

    }

    public static int partition (int arr[], int start, int end) {
        int pivot = arr[end];
        int i=start-1;

        for(int j=start; j<end; j++) {
            if(arr[j] <= pivot) {
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }

        i++;
        int temp=pivot;
        arr[end]=arr[i];
        arr[i]=temp;

        return i;
    }

    public static void printArray(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int nums[] = {6,3,9,8,2,5};
        printArray(nums);
        quickSort(nums, 0, nums.length-1);
        printArray(nums);
    }
}