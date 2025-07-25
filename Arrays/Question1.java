import java.util.*;

public class Question1 {
    public static boolean isTwice(int arr[]) {
        HashSet<Integer> set = new HashSet<>(); 
        for(int i=0; i<nums.length; i++) {
            if(set.contains(nums[i])) { 
                return true;
            } 
            else {
            set.add(nums[i]);
            }
        }
        return false;
    }
    public static void main(String args[]) {
        int nums[]={1,1,1,3,3,4,3,2,4,2};
        System.out.print(isTwice(nums));

    }
}