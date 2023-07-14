import java.util.*;

//find itinerary from tickets

public class ques4 {
    public static String getstart(HashMap<String, String> tickets) {
        HashMap<String, String> rev = new HashMap<>();
        for (Map.Entry<String, String> k : tickets.entrySet()) {
            rev.put(k.getValue(), k.getKey());
        }
        for (Map.Entry<String, String> k : tickets.entrySet()) {
            String a = k.getKey();
            if (rev.containsKey(a) == false) {
                return a;
            }
        }
        return null;

    }

    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");
        String startpnt = getstart(tickets);
        while (tickets.containsKey(startpnt)) {
            System.out.print(startpnt + "->");
            startpnt = tickets.get(startpnt);
        }
        System.out.print(startpnt);
    }
}
