//longest substring containing unique characters only
import java.util.*;

public class SecretAgentMessage {
    public static int longestNonRepeatingSubstring(String s) {
        int n = s.length();
        int hash[] = new int[256];
        Arrays.fill(hash, -1);

        int left = 0;
        int right = 0;
        int maxi = 0;
        while(right < n) {
            char ch = s.charAt(right);

            if(hash[ch] != -1 && hash[ch] >= left) {
                    left = hash[ch]+1;
            }

            hash[ch] = right;
            maxi=Math.max(maxi, right-left+1);

            right++;
        }
        return maxi;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();


        int result = longestNonRepeatingSubstring(s);
        System.out.print(result);
    }
}  