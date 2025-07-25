import java.util.*;

public class SelectionSortDesc {
    public static void sort(int arr[]) {
        int n=arr.length;
        
        for(int i=0; i<n; i++) {
            int minPos=i;
            for(int j=i; j<n-1; j++) {
                if(arr[minPos]<arr[j]) {
                    minPos=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minPos];
            arr[minPos]=temp;
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