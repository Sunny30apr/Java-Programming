import java.util.*;

public class HashSetIntro {
    public static void main(String args[]) {
        HashSet<String> set = new HashSet<>();
        set.add("Delhi");
        set.add("Gaya");
        set.add("Mumbai");
        set.add("Chennai");
        System.out.println(set);

        LinkedHashSet<String> lset = new LinkedHashSet<>();
        lset.add("Delhi");
        lset.add("Gaya");
        lset.add("Mumbai");
        lset.add("Chennai");
        System.out.println(lset);

        lset.remove("Mumbai");
        System.out.println(lset);

        TreeSet<String> tset = new TreeSet<>();
        tset.add("Delhi");
        tset.add("Gaya");
        tset.add("Mumbai");
        tset.add("Chennai");
        System.out.println(tset);



    }
}