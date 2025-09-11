import java.util.*;

public class PairSum {
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
        int left = 0;
        int right = list.size() - 1;

        while(left < right) {
            if(list.get(left) + list.get(right) == target) {
                return true;
            }
            else if(list.get(left) + list.get(right) > target) {
                right--;
            }
            else {
                left++;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        // int height = {1,2,3,4,5,6};
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 5;
        System.out.print(pairSum(list, target));


    }
}