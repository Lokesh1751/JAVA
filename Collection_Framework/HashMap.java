import java.util.*;

public class map {
    // IN RANDOM ORDER STORE
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<String, Integer>();

        // add pairs => put function
        hm.put("Sujal", 1751);
        hm.put("Mohak", 1763);
        hm.put("Yash", 1875);

        // put if absent => put pair if not present
        hm.putIfAbsent("Sujal", 1751);

        System.out.println(hm);

        // iterate over map
        for (Map.Entry<String, Integer> me : hm.entrySet()) {

            // Printing keys and values
            System.out.println(me);
            System.out.print(me.getKey() + ":");
            System.out.println(me.getValue());
        }

        // print only keys
        for (String k : hm.keySet()) {
            System.out.println(k);
        }

        // contains function => return true or false
        System.out.println(hm.containsValue(1751));

        // isempty function
        System.out.println(hm.isEmpty());

        // remove any pair
        hm.remove("Sujal");
        System.out.println(hm);

    }
}
