import java.util.*;

public class SortByFreq {
    public static String SortByFreq(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        PriorityQueue<Map.Entry<Character, Integer>> pq = new 
        PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        
        pq.addAll(map.entrySet());
        
        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()) {
            Map.Entry<Character, Integer> entry = pq.poll();
            sb.append(String.valueOf(entry.getKey()).repeat(entry.getValue()));
        }
        return sb.toString();
        // return  "";
    }
    
    public static void main(String args[]) {
        String s = "cccaaa";
        String t = "ttttree";
        String u = "Aabb";

        System.out.println(SortByFreq(u));
        System.out.println(SortByFreq(t));
        System.out.println(SortByFreq(s));

    }
}