import java.util.*;

public class AllOccurences {
     public static void printAllOccurences(int arr[], int key, int n) {
        if(n == arr.length) {
            return;
        }

        if(arr[n] == key) {
            System.out.print(n + " ");
        }

        printAllOccurences(arr, key, n+1);
    }

    public static void main(String args[]) {
        int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        int key=2;
        printAllOccurences(arr, 2, 0);
    }
}