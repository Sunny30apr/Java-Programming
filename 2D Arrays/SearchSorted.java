import java.util.*;

public class SearchSorted {
    // //brute force
    // public static void search(int arr[][], int key) {
    //     int n=arr.length;
    //     int m=arr[0].length;

    //     for(int i=0; i<n; i++) {
    //         for(int j=0; j<m; j++) {
    //             if(arr[i][j]==key) {
    //                 System.out.print(key + " is present at row: " + (i+1) + " and column: " + (j+1));
    //                 return;
    //             }
    //         }
    //     }
    //     System.out.print(key + " Not found.");
    // }

    // //row wise sorted
    // public static void search(int arr[][], int key) {
    //     int n=arr.length;
    //     int m=arr[0].length;

    //     for(int i=0; i<n; i++) {
    //         int start=0, end=m-1;

    //         while(start<=end) {
    //             int mid=(start+end)/2;
    //             if(arr[i][mid]==key) {
    //                 System.out.print(key + " is present at row: " + (i+1) + " and column: " + (mid+1));
    //                 return;
    //             }
    //             else if(arr[i][mid]<key) {
    //                 start=mid+1;
    //             }
    //             else {
    //                 end=mid-1;
    //             }
    //         }
    //     }
    //     System.out.println(key + " Not found.");
    // }

    //row+col wise sorted
    public static void search(int arr[][], int key) {
        int n=arr.length;
        int m=arr[0].length;

        int i=n-1, j=0;
        while(i >= 0 && j < m) {
            if(arr[i][j]==key) {
                System.out.print(key + " is present at row: " + (i+1) + " and column: " + (j+1));
                return;
            }
            if(arr[i][j]<key) {
                j++;
            }
            else {
                i--;
            }
        }
        System.out.println(key + " Not found.");
        return;
    }

    public static void printMatrix(int arr[][]) {
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int matrix[][]={{10,20,30,40},
                    {15,25,35,45},
                    {27,29,37,48},
                    {32,33,39,50}};
        
        printMatrix(matrix);
        System.out.print("Enter your key: ");
        int key=sc.nextInt();

        search(matrix, key);

    }
}