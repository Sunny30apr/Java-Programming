//subsequence having the sum given is acheived or not

import java.util.*;

public class SubsequenceWithSum {
    public static boolean check(int i, int n, int arr[], int target) {
        if(target == 0) {
            return true;
        }
        if(target < 0 || i==n) {
            return true;
        }
        boolean path1 = check(i+1, n, arr, target-arr[i]);
        boolean path1 = check(i+1, n, arr, target);

        return path1||path2;

    }

    public static boolean checkSubsequenceSum(int arr[], int target) {
        int n=arr.length;
        return check(0, n, arr, target);
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int target = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++) {
            arr[i]=sc.nextInt();
        }

        if(checkSubsequenceSum(arr, target)) {
            System.out.print("Yes");
        }
        else {
            System.out.print("No");
        }
    }
}