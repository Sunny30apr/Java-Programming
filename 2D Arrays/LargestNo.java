import java.util.*;

public class LargestNo {
    public static int largestNo(int arr[][]) {
        int max=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[0].length; j++) {
                max = Math.max(max, arr[i][j]);
            }
        }
        return max;
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

        int matrix[][] = new int[3][3];
        System.out.println("Enter the matrix(3*3): ");
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        printMatrix(matrix);
        int max=largestNo(matrix);
        System.out.println("Max element in the matrix: " + max);


    }
}