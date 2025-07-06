import java.util.*;

public class Question4 {
    public int trappingWater(int[] height) { 
        int n = height.length;
    
        int trappedwater = 0;
        int l = 0, r = n - 1;
        int rMax = height[r], lMax = height[l];

        while (l < r) {
            if (lMax < rMax) { 
                l++;
                lMax = Math.max(lMax, height[l]); 
                trappedwater += lMax - height[l];
        } 
        else {
            r--;
            rMax = Math.max(rMax, height[r]); 
            trappedwater += rMax - height[r];
            }
        }
    return trappedwater;
    }

    public static void main(String args[]) {
        int height[]={0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.print(trappingWater(height));
    }
}