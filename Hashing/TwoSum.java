import java.util.*;

public class TwoSum {
    public static void main(String args[]) {
        int arr[] = {3,2,4};
        int target = 6;

        int ans[] = new int[2];

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++) {
            int k = target-arr[i];
            if(map.containsKey(k)) {
                ans[0] = i;
                ans[1] = map.get(k);
                break;
            }
            else {
                map.put(arr[i], i);

            }
        }
        System.out.print(ans[0] + " , " + ans[1]);
    }
}