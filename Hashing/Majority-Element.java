import java.util.*;

public class ques1 {
    // find the element in array whose occurence is more than n/3 times where n is
    // length of array
    public static void main(String[] args) {
        int arr[] = { 1, 2 };
        int m = arr.length / 3;
        HashMap<Integer, Integer> hm = new HashMap<>();

        // Method 1 to traverse
        // for (int i = 0; i < arr.length; i++) {
        // hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        // }
 
        // Method 2 to traverse
        for (int i = 0; i < arr.length; i++) {
            if (hm.containsKey(arr[i])) {
                hm.put(arr[i], hm.get(arr[i]) + 1);
            } else {
                hm.put(arr[i], 1);
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for (Map.Entry<Integer, Integer> k : hm.entrySet()) {
            if (k.getValue() > m) {
                ans.add(k.getKey());
            }
        }
        System.out.println(ans);
    }
}
