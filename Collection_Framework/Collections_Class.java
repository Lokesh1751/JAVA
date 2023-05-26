import java.util.*;

public class Collectionclass {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<Integer>();
        l.add(12);
        l.add(122);
        l.add(1);
        l.add(123);
        l.add(4);
        l.add(4);

        // find minimum element=>min
        System.out.println(Collections.min(l));

        // find maximum element=>min
        System.out.println(Collections.max(l));

        // find frequency of element
        System.out.println(Collections.frequency(l, 4));

        // sort in ascending order
        Collections.sort(l);
        System.out.println(l);

        // sort in descending order
        Collections.sort(l, Comparator.reverseOrder());
        System.out.println(l);

    }
}
