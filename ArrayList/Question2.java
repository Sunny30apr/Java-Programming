import java.util.*;

public class Question2 {
    public static List<Integer> findLonely(ArrayList<Integer> nums) {
        if(nums.size() == 1) {
            return nums;
        }

        Collections.sort(nums);
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i=0; i<nums.size(); i++) {
            if(i==0) {
                if((nums.get(i) == nums.get(i+1)) || (nums.get(i) == nums.get(i+1)-1)) {
                    continue;
                }
            }
            else if(i==nums.size()-1) {
                if((nums.get(i) == nums.get(i-1)) || (nums.get(i) == nums.get(i-1)+1)) {
                    continue;
                }
            }
            else {
                if((nums.get(i) == nums.get(i+1)) || (nums.get(i) == nums.get(i+1)-1) || 
                (nums.get(i) == nums.get(i-1)) || (nums.get(i) == nums.get(i-1)+1)) {
                    continue;
                }
            }
            ans.add(nums.get(i));
        }
        return ans;
    }

    public static void main(String args[]) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(10,6,5,8));
        System.out.print(findLonely(nums));
    }
}