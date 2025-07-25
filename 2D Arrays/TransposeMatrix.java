import java.util.*;

public class TransposeMatrix {
    public static int[][] transpose(int[][] arr) {
        int ans[][] = new int[arr[0].length][arr.length];

        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[0].length; j++) {
                ans[j][i] = arr[i][j];
            }
        }
        return ans;
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
        int matrix[][] = {{1,2,3},
                    {5,6,7}};

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        matrix = transpose(matrix);

        System.out.println("Transposed Matrix:");
        printMatrix(matrix);
    }
}