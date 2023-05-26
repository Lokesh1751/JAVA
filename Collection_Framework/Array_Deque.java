import java.util.*;
public class Arraydeque {
  // ADD ELEMENT FROM BOTH SIDE
    public static void main(String[] args){
            ArrayDeque<Integer> aq=new ArrayDeque<>();

            // add element => bydefault add element at last
            aq.offer(12);
            aq.offer(144);

            //add element at first
            aq.offerFirst(13);

            //add element at last
            aq.offerLast(199);
            System.out.println(aq);

            //top element => top element from front
            System.out.println(aq.peek());

            //peeklast => top element from last
            System.out.println(aq.peekLast());

            //peekfirst => top element from first
            System.out.println(aq.peekFirst());

            // remove element => poll function(remove element from first);
           System.out.println( aq.poll());
           System.out.println(aq);

             // remove element => pollfirst function(remove element from first);
             System.out.println(aq.pollFirst());
             System.out.println(aq);

               // remove element => poll function(remove element from last);
           System.out.println(aq.pollLast());
           System.out.println(aq);


            
    }
}
