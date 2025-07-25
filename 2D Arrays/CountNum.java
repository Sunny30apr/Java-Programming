import java.util.*;

public class CountNum {
    public static int countNum(int arr[][], int key) {
        int n=arr.length;
        int m=arr[0].length;

        int count=0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(arr[i][j]==key) {
                    count++;
                }
            }
        }
        return count;
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
        int array[][] = {{4,7,8},{8,8,7}};
        printMatrix(array);

        System.out.print("Enter any element: ");
        int key=sc.nextInt();

        int count = countNum(array, key);
        System.out.print("Count of " + key + " in the matrix: " + count);
        
    }
}