import java.util.*;

public class TilingProblem {
    public static int tilingProblem(int n) {
        if(n==0 || n==1) {
            return 1;
        }

        // vertical
        int vertical=tilingProblem(n-1);

        //horizontal
        int horizontal=tilingProblem(n-2);
        
        int totalWays=vertical+horizontal;
        return totalWays;
    }
    
    public static void main(String args[]) {
        System.out.print(tilingProblem(10));
    }
}