import java.util.*;

public class DiagonalSum {
    // public static int diagonalSum(int arr[][]) {
    //     int n=arr.length;
    //     int sum=0;
    //     for(int i=0; i<n; i++) {
    //         for(int j=0; j<n; j++) {
    //             if(i==j) {
    //                 sum+=arr[i][j];
    //             }
    //             if(i+j==n-1) {
    //                 sum+=arr[i][j];
    //             }
    //         }
    //     }
    //     return sum;
    // }

    public static int diagonalSum(int arr[][]) {
        int n=arr.length;
        int sum=0;
        for(int i=0; i<n; i++) {
            sum+=arr[i][i];
            if(i != n-1-i)
                sum+=arr[i][n-1-i];
        }
        return sum;
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
        int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        printMatrix(matrix);
        int sum = diagonalSum(matrix);
        System.out.print("Sum of diagonal elements of the matrix: "+ sum);
    }
}