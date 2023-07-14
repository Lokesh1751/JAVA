import java.util.*;

// count number of subarrays whose sum is equal to k
public class ques5 {
    public static void main(String[] args) {
        int arr[] = { 10, 2, -2, -20, 10 };
        int k = -10;
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, 1);
        int ans = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (hm.containsKey(sum - k)) {
                ans += hm.get(sum - k);
            } else {
                if (hm.containsKey(sum)) {
                    hm.put(sum, hm.get(sum) + 1);
                } else {
                    hm.put(sum, 1);
                }
            }
        }
        System.out.println(ans);
    }
}
