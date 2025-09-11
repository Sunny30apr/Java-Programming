import java.util.*;

public class HashMapIntro {
    public static void main(String args[]) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 500);
        hm.put("China", 1000);

        System.out.println(hm); 
        System.out.println(hm.get("India"));
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.remove("China"));
        System.out.println(hm); 
        System.out.println(hm.size()); 

        hm.put("Bhutan", 50);
        hm.put("Nepal", 60);

        System.out.println(hm.size()); 
        System.out.println(hm.isEmpty()); 
        hm.clear();
        System.out.println(hm.isEmpty()); 

        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 500);
        lhm.put("China", 1000);
        lhm.put("Bhutan", 50);
        lhm.put("Nepal", 60);
        System.out.println(lhm); 

        TreeMap<String, Integer> thm = new TreeMap<>();
        thm.put("India", 500);
        thm.put("China", 1000);
        thm.put("Bhutan", 50);
        thm.put("Nepal", 60);
        System.out.println(thm); 

    }
}