import java.util.*;

public class MajorityElement {
    public static void majorityElement(int arr[]) {
        int n=arr.length;
        HashMap<Integer, Integer> hs = new HashMap<>();

        for(int i=0; i<n; i++) {
            // if(hs.containsKey(arr[i])) {
            //     hs.put(arr[i], hs.get(arr[i]) + 1);
            // }
            // else {
            //     hs.put(arr[i], 1);
            // }

            hs.put(arr[i], hs.getOrDefault(arr[i], 0) + 1);
        }

        // Set<Integer> keySet = hs.keySet();
        for(Integer key : hs.keySet()) {
            if(hs.get(key) > n/3) {
                System.out.print(key + " ");
            }
        }

    }

    public static void main(String args[]) {
        int nums[]= {1,2};
        majorityElement(nums);
    }
}