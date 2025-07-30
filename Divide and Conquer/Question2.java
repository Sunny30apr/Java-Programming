import java.util.*;

public class Question2 {
    // public static int majorityElement(int arr[]) {
    //     int n=arr.length;
    //     Arrays.sort(arr);
    //     return arr[n/2];
    // }

    public static int majorityElement(int arr[]) {
        int count=0;
        int ans=arr[0];
        for(int i=0; i<arr.length; i++) {
            if(count==0) {
                count=1;
                ans=arr[i];
            }
            else if(arr[i]==ans) {
                count++;
            }
            else {
                count--;
            }
        }
        return ans;
    }

    public static void main(String args[]) {
        int nums[]={2,2,1,1,1,2,2};
        System.out.print(majorityElement(nums));
    }
}
