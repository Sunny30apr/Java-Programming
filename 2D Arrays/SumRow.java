import java.util.*;

public class SumRow {
    public static int sumRow(int arr[][], int rowNum) {
        int n=arr[0].length;

        int sum=0;
        for(int i=0; i<n; i++) {
            sum+=arr[rowNum][i];
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
        Scanner sc = new Scanner(System.in);
        int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
        printMatrix(nums);
 
        System.out.println("Enter row number: ");
        int rowNum=sc.nextInt();

        int ans=sumRow(nums, rowNum-1);
        System.out.println("Sum of the elements of the given row number: " + ans);

    }
}