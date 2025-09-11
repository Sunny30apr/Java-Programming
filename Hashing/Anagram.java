import java.util.*;

public class Anagram {
    public static boolean checkAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();

        if(s.length() != t.length()) {
            return false;
        }

        for(int i=0; i<s.length(); i++) {
            if(map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }
            else {
                map.put(s.charAt(i), 1);
            }
        }
        System.out.println(map);

        for(int i=0; i<t.length(); i++) {
            if(map.containsKey(t.charAt(i))) {
                if(map.get(t.charAt(i)) == 1) {
                    map.remove(t.charAt(i));
                }
                else {
                    map.put(t.charAt(i), map.get(t.charAt(i))-1);
                }   
            }
            else {
                return false;
            }
        }

        return map.isEmpty(); 
    }

    public static void main(String args[]) {
        String s = "aabcb";
        String t = "abbca";
        System.out.print(checkAnagram(s, t));
    }
}