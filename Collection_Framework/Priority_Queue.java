import java.util.*;
public class priority_queue {
    public static void main(String[] args){

//MIN HEAP
PriorityQueue<Integer> q =new PriorityQueue<>();

//add element
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

      
      
      
      
      
      
//MAX HEAP
PriorityQueue<Integer> qq =new PriorityQueue<>(Comparator.reverseOrder());

//add element
qq.offer(2);
qq.offer(3);
qq.offer(4);
qq.offer(5);
qq.offer(6);

System.out.println(qq);

// remove element
qq.poll();
System.out.println(qq);

// top element
System.out.println(qq.peek());

    }
}
