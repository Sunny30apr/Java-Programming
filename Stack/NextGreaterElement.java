//next greater right - for(int i=arr.length-1; i>=0; i--) && arr[s.peek()] <= arr[i]
//next greater left -  for(int i=0; i<arr.length; i++) && arr[s.peek()] <= arr[i]
//next smaller right - for(int i=arr.length-1; i>=0; i--) && arr[s.peek()] >= arr[i]
//next smaller left - for(int i=0; i<arr.length; i++) && arr[s.peek()] >= arr[i]


import java.util.*;

public class NextGreaterElement {
    // //Brute Force
    // public static int[] nextGreaterElement(int arr[]) {
    //     int ans[] = new int[arr.length];
    //     Arrays.fill(ans, -1);

    //     for(int i=0; i<arr.length; i++) {
    //         for(int j=i+1; j<arr.length; j++) {
    //             if(arr[i] < arr[j]) {
    //                 ans[i] = arr[j];
    //                 break;
    //             }
    //         }
    //     }
    //     return ans;
    // }

    //Optimised using stack
    public static int[] nextGreaterElement(int arr[]) {
        Stack<Integer> s = new Stack<>();
        int ans[] = new int[arr.length];

        for(int i=arr.length-1; i>=0; i--) {
            //1 while
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }

            //2 if-else
            if(s.isEmpty()) {
                ans[i] = -1;
            }
            else {
                ans[i] = arr[s.peek()];
            }

            //3 push in stack s
            s.push(i);
        }
        return ans;
    }


    public static void main(String args[]) {
        int arr[] = {6,8,0,1,3};
        int ans[] = nextGreaterElement(arr);
        for(int i=0; i<ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}