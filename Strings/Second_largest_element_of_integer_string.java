import java.util.*;

import javax.naming.ldap.Rdn;

public class ques9 {
    public static void main(String[] args) {
        StringBuilder sc = new StringBuilder("12907");
        int maxi = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < sc.length(); i++) {
            int ans = sc.charAt(i) - '0';
            if (ans > maxi) {
                maxi = ans;
                index = i;
            }
        }
        sc.deleteCharAt(index);
         maxi = Integer.MIN_VALUE;
        for (int i = 0; i < sc.length(); i++) {
            int ans = sc.charAt(i) - '0';
            if (ans > maxi) {
                maxi = ans;
                index = i;
            }
        }
        System.out.println(maxi);
    }
}
