import java.rmi.server.SocketSecurityException;
import java.util.*;

public class ques11 {
    public static void main(String[] args) {
        String str = "xy";
        Map<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            hm.put(str.charAt(i), hm.getOrDefault(str.charAt(i), 0) + 1);
        }
        int maxi = Integer.MIN_VALUE;
        char ans = ' ';
        for (Map.Entry<Character, Integer> me : hm.entrySet()) {
            if (me.getValue() > maxi) {
               // maxi = me.getValue();
                ans = me.getKey();
            }
            // System.out.println(me.getKey()+" "+me.getValue());
        }
        System.out.println(ans);
        // System.out.println( hm.get(maxi));
    }
}
