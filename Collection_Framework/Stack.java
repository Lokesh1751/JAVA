import java.util.*;
public class Stack {
    public static void main(String[] args){
java.util.Stack<Integer> s=new java.util.Stack<>();
//LIFO => LAST IN FIRST OUT

//push element
s.push(1);
s.push(2);
s.push(3);
s.push(4);
System.out.println(s);

//Top element
System.out.println(s.peek());

//pop remove top element
s.pop();
System.out.println(s);
    }
}
