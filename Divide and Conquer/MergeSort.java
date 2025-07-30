import java.util.*;

public class MergeSort {
    public static void mergeSort(int arr[], int start, int end) {
        if(start >= end) {
            return;
        }

        int mid=start+(end-start)/2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid+1, end);

        merge(arr, start, mid, end);

    }

    public static void merge(int arr[], int start, int mid, int end) {
        int temp[]=new int[end - start + 1];
        int i=start;
        int j=mid+1;
        int k=0;

        while(i <= mid && j <= end) {
            if(arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            }
            else {
                temp[k++] = arr[j++];
            }
        }

        while(i <= mid) {
            temp[k++] = arr[i++];
        }

        while(j <= end) {
            temp[k++] = arr[j++];
        }

        for(k=0, i=start; k<temp.length; ) {
            arr[i++] = temp[k++];
        }

    }
    public static void printArray(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        int nums[] = {6,3,9,5,2,8,-2};
        printArray(nums);
        mergeSort(nums, 0, nums.length-1);
        printArray(nums);

    }
}