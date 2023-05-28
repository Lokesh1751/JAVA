import java.util.*;

public class implementationusingarraylist {
    static class stack {
        static ArrayList<Integer> list = new ArrayList<>();

        stack() {

        }

        public boolean isempty() {
            if (list.size() == 0) {
                return true;
            }
            return false;
        }

        public void push(int d) {
            list.add(d);
        }

        public int pop() {
            if (isempty()) {
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;

        }

        public int peek() {
            int top = list.get(list.size() - 1);
            return top;
        }

        public void print() {
            while (!isempty()) {
                System.out.print(peek() + " ");
                pop();
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        stack s = new stack();
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(10);
        s.push(19);
        System.out.println(s.pop());
        s.print();

    }
}
