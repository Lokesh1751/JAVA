import java.util.*;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();

        // Add at end
        a.add(1);
        a.add(2);
        a.add(3);
        System.out.println(a);

        // Add element in between
        a.add(2, 5);
        System.out.println(a);

        // Add new list to current list
        ArrayList<Integer> ab = new ArrayList<>();
        ab.add(12);
        ab.add(13);
        ab.add(14);
        a.addAll(ab);
        System.out.println(a);

        // get element value by index
        System.out.println(a.get(3));

        // remove element by index
        a.remove(2);
        System.out.println(a);

        // remove element by value
        a.remove(Integer.valueOf(13));
        System.out.println(a);

        // clear all elements
        // a.clear();
        // System.out.println(a);

        // set value
        a.set(0, 100);
        System.out.println(a);

        // check element present in it or not
        System.out.println(a.contains(14)); // give true or false

        // iterate method
        for (int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i) + ",");
        }
        System.out.println();

        for (Integer ele : a) {
            System.out.print(ele + ",");
        }
        System.out.println();

        // iterator
        Iterator<Integer> it = a.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
}
