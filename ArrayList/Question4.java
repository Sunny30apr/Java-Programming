import java.util.*;

public class Question4 {
    public static ArrayList<Integer> BeautifulArrayList(int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(1);

        while(ans.size() < n) {
            ArrayList<Integer> temp = new ArrayList<>();
            for(Integer i : ans) {
                if((2*i - 1) <= n)
                temp.add(2*i - 1);
            } 
            for(Integer i : ans) {
                if((2*i) <= n)
                temp.add(2*i);
            } 
            ans = temp;
        }
        return ans;
    }
    public static void main(String args[]) {
        int n=6;
        System.out.print(BeautifulArrayList(n));
    }
}