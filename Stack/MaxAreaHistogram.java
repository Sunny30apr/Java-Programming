import java.util.*;

public class MaxAreaHistogram {
    public static int maxArea(int heights[]) {
        int n = heights.length;
        int leftShorter[] = new int[n];
        int rightShorter[] = new int[n];

        //Next smaller left
        Stack<Integer> s = new Stack<>();
        
        for(int i=0; i<n; i++) {
            while(!s.isEmpty() && heights[i] <= heights[s.peek()] ) {
                s.pop();
            }
            if(s.isEmpty()) {
                leftShorter[i] = -1;
            }
            else {
                leftShorter[i] = s.peek();
            }
            s.push(i);
        }

        //Next smaller right
        s.clear();
        for(int i=n-1; i>=0; i--) {
            while(!s.isEmpty() && heights[i] <= heights[s.peek()] ) {
                s.pop();
            }
            if(s.isEmpty()) {
                rightShorter[i] = n;
            }
            else {
                rightShorter[i] = s.peek();
            }
            s.push(i);
        }

        int max = 0;
        for(int i=0; i<n; i++) {
            int area = heights[i] * (rightShorter[i] - leftShorter[i] -1);
            max = Math.max(max, area);
        }
        return max;
    }

    public static void main(String args[]) {
        int heights[] = {2,4};
        System.out.print("Max. Area of rect. of histogram: " + maxArea(heights));
    }
}