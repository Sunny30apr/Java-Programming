import java.util.*;

public class InsertionSort {
    // public static void insertionSort(int[] arr) {
    //     int n=arr.length;
        
        
    //     for(int i=1; i<arr.length; i++) {
    //         int curr = arr[i];
    //         int prev = i-1;
    //         while(prev >= 0 && arr[prev] > curr) {
    //             arr[prev+1] = arr[prev];
    //             prev--;
    //         }
    //         arr[prev+1] = curr;
    //     }
    // }

    public static void insertionSort(int arr[]) {
        int n=arr.length;
        
        for(int i=1; i<n; i++) {
            for(int j=i; j>0; j--) {
                if(arr[j]<arr[j-1]) {
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                else {
                    break;
                }
            }
        }
    }

    public static void printArray(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int nums[] = {5,2,3,4,1};
        System.out.println("Original Array: ");
        printArray(nums);
        insertionSort(nums);
        System.out.println("Sorted Array: ");
        printArray(nums);
    }
}