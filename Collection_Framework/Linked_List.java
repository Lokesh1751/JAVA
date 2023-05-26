import java.util.*;

import javax.sound.sampled.SourceDataLine;

public class Collectionlib {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();

        // add first function
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addFirst(0);

        // By using only add function it automatically add to last of linked list
        ll.add(5);

        // add last function
        ll.addLast(4);
        System.out.println(ll);

        // Size Function
        System.out.println(ll.size());

        // iterate
        for (int i = 0; i < ll.size(); i++) {
            System.out.print(ll.get(i) + "->");
        }
        System.out.println("null");

        // delete first function
        ll.removeFirst();
        System.out.println(ll);

        // delete last function
        ll.removeLast();
        System.out.println(ll);

        // remove by using a particular index
        ll.remove(0);
        System.out.println(ll);
    }

}
