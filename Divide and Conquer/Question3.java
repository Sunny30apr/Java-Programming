import java.util.*;

public class Question3 {
    // //Brute Force
    // public static int inversionCount (int arr[]) {
    //     int count=0;
    //     for(int i=0; i<arr.length; i++) {
    //         for(int j=i+1; j<arr.length; j++) {
    //             if(arr[i]>arr[j]) {
    //                 count++;
    //             }
    //         }
    //     }
    //     return count;
    // }

    public static int mergeSort(int arr[], int start, int end) {
        int ans=0;
        
        if(end >  start) {
            int mid = start+(end-start)/2;

            ans+=mergeSort(arr, start, mid);
            ans+=mergeSort(arr, mid+1, end);

            ans+=merge(arr, start, mid, end);
        }

        return ans;
    }

    public static int merge (int arr[], int start, int mid, int end) {
        int temp[]=new int[end-start+1];
        int ans=0;
        int i=start;
        int j=mid+1;
        int k=0;

        while(i <= mid && j <= end) {
            if(arr[i]<=arr[j]) {
                temp[k++]=arr[i++];
            }
            else {
                temp[k++]=arr[j++];
                ans+=(mid-i+1);
            }
        }

        while(i <= mid) {
            temp[k++]=arr[i++];
        }

        while(j <= end) {
            temp[k++]=arr[j++];
        }

        for(i=start, k=0; k<temp.length;) {
            arr[i++]=temp[k++];
        }

        return ans;
    }

    public static int inversionCount(int arr[]) {
        int ans = mergeSort(arr, 0, arr.length-1);

        return ans;
    }

    public static void main(String args[]) {
        int arr[] = {2, 3, 4, 5, 6};
        System.out.print(inversionCount(arr));
    }
}