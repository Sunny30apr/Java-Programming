import java.util.*;

public class Question1 {
    public static void mergeSort(String arr[], int start, int end) {
        if(start >= end) {
            return; 
        }

        int mid = start + (end-start)/2;

        mergeSort(arr, start, mid);
        mergeSort(arr, mid+1, end);

        merge(arr, start, mid, end);
    }

    public static void merge(String arr[], int start, int mid, int end) {
        String temp[]=new String[end-start+1];
        int i=start;
        int j=mid+1;
        int k=0;

        while(i <= mid && j <= end) {
            if(arr[i].compareTo(arr[j]) > 0) {
                temp[k++]=arr[j++];
            }
            else {
                temp[k++]=arr[i++];
            }
        }

        while(i <= mid) {
            temp[k++]=arr[i++];
        }

        while(j <= end) {
            temp[k++]=arr[j++];
        }

        for(k=0, i=start; k<temp.length;) {
            arr[i++]=temp[k++];
        }

    }

    public static void printArray(String arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        String arr[] = {"sun", "earth", "mars", "mercury"};
            // System.out.println(arr.length);
        printArray(arr);
        mergeSort(arr, 0, arr.length-1);
        printArray(arr);
    }
}