import java.util.*;

public class frequencyofeachelement {
    public static void main(String[] args) {
        // Write a Java program to reverse a given string using StringBuilder

        StringBuilder sc = new StringBuilder("abcdabcdbc");

        // . Write a Java program to find the frequency of each element in a String and
        // print the frequency of each character only once.
        Map<Character, Integer> hm = new HashMap<Character,Integer>();
        int cnt=0;
        for(int i=0;i<sc.length();i++){
hm.put(sc.charAt(i),hm.getOrDefault(sc.charAt(i), 0)+1);
        }
        for (Map.Entry<Character, Integer> me :
             hm.entrySet()) {
  
            // Printing keys
           // System.out.print(me.getKey() + ":");
            System.out.println(me.getValue());
        }
    }
}
