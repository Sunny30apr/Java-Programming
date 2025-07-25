import java.util.*;

public class ShortestPath {
    public static double shortestPath(String s) {
        int x=0, y=0;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i)=='E') {
                x++;
            }
            else if(s.charAt(i)=='W') {
                x--;
            }
            else if(s.charAt(i)=='N') {
                y++;
            }
            else{
                y--;
            }
        }
        x=Math.abs(x);
        y=Math.abs(y);
        double ans = Math.sqrt((x*x) + (y*y));
        return ans;
    }

    public static void main(String args[]) {
        String s = "WNEENESENNN";

        double ans = shortestPath(s);
        System.out.print("Shortest distance to reach the destination: " + ans);
    }
}