import java.util.*;

public class PrefixSum {
    public static void prefixSum(int arr[]) {
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];

        for(int i=1; i<arr.length; i++) {
            prefix[i]=prefix[i-1]+arr[i];
        }

        int max=0;
         for(int i=0; i<arr.length; i++) {
            for(int j=i; j<arr.length; j++) {

                int sum= i==0 ? prefix[j] : prefix[j] - prefix[i-1];
                System.out.print(sum + " ");
                if(max<sum) {
                    max=sum;
                }
            
            }
            System.out.println();
        }
    System.out.println("MAX sum of the subarrays: " + max);
    }

    public static void printArray(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int nums[] = {1,-2,6,-1,3};
        printArray(nums);
        prefixSum(nums);

    }
}