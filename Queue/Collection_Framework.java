import java.util.*;
public class queue {
    public static void main(String[] args){
Queue<Integer> q=new LinkedList<>();

// add element
q.offer(2);
q.offer(3);
q.offer(4);
q.offer(5);
q.offer(6);

System.out.println(q);

// remove element
q.poll();
System.out.println(q);

// top element
System.out.println(q.peek());
    }
}
