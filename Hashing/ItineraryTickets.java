import java.util.*;

public class ItineraryTickets {
    public static String startPoint(HashMap<String, String> set) {
        HashMap<String, String> rev = new HashMap<>();
        for(String key : set.keySet()) {
            rev.put(set.get(key), key);
        }

        for(String key : set.keySet()) {
            if(!rev.containsKey(key)) {
                return key;
            }
        }

        return null;
    } 

    public static void main(String args[]) {
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        String start = startPoint(tickets);

        System.out.print(start);

        for(String key : tickets.keySet()) {
            System.out.print(" -> " + tickets.get(start));
            start = tickets.get(start);
        }
        
        
    }
}