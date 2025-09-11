import java.util.*;

public class PairSum2 {
    // //Brute Force
    // public static boolean pairSum (ArrayList<Integer> list, int target) {
    //     for(int i=0; i<list.size(); i++) {
    //         for(int j=i+1; j<list.size(); j++) {
    //             if(list.get(i)+list.get(j)==target) {
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // } 

    //Two Pointer Approach
    public static boolean pairSum(ArrayList<Integer> list, int target) {
        int n = list.size();
        int bp=-1;
        for(int i=0; i<n-1; i++) {
            if(list.get(i) > list.get(i+1)) {
                bp=i;
                break;
            }
        }

        int left = bp+1;
        int right = bp;

        while(left != right) {
            if(list.get(left) + list.get(right) == target) {
                return true;
            }
            else if(list.get(left) + list.get(right) > target) {
                right = (n+right-1) % n;
            }
            else {
                left = (left+1) % n;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        // int height = {1,2,3,4,5,6};
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 16;
        System.out.print(pairSum(list, target));


    }
}