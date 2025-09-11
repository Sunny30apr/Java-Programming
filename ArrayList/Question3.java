import java.util.*;

public class Question3 {
    public static int mostFrequent(int[] nums, int key) {
        HashMap<Integer, Integer> ans = new HashMap<>();
        for(int i=0; i<nums.length-1; i++) {
            if(nums[i]==key) {
                int target = nums[i+1];
                ans.put(target, ans.getOrDefault(target, 0) + 1);
            }
        }

        int max=0, res=-1;   
        for(Integer k : ans.keySet()) {
            if(ans.get(k) > max) {   
                max = ans.get(k);
                res = k;
            }
        }
        return res;  
    }

    public static void main(String args[]) {
        int nums[] = {1,100,200,1,100};
        int key = 1;

        System.out.print(mostFrequent(nums, key));

    }
}