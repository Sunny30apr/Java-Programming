import java.util.*;

public class CountingSortDesc {
    public static void sort(int arr[]) {
        int n=arr.length;

        int largest=0;
        for(int i=0; i<n; i++) {
            largest=Math.max(arr[i], largest);
        }

        int count[]=new int[largest+1];
        for(int i=0; i<n; i++) {
            count[arr[i]]++;
        }

        int j=0;
        for(int i=count.length-1; i>=0; i--) {
            while(count[i]>0) {
                arr[j]=i;
                j++;
                count[i]--;
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