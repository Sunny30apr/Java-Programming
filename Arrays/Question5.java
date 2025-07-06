import java.util.*;

public class Question5 {

    public static List<List<Integer>> tripletSum_0(int[] arr) {
        int n = arr.length;
        List<List<Integer>> result = new ArrayList<>();

        // Brute force checking all triplets
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        List<Integer> triplet = new ArrayList<>();
                        triplet.add(arr[i]);
                        triplet.add(arr[j]);
                        triplet.add(arr[k]);
                        Collections.sort(triplet);
                        if (!result.contains(triplet)) {
                            result.add(triplet);
                        }
                    }
                }
            }
        }

        return result;
    }

    public static void main(String args[]) {
        int nums[] = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> triplets = tripletSum_0(nums);
        System.out.println(triplets);
    }
}
