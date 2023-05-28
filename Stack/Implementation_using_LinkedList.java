import java.util.*;

public class implementusingll {

    static class node {
        int data;
        node next;

        node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    static class stack {
        node head = null;

        public void push(int d) {
            node s = new node(d);
            if (head == null) {
                head = s;
                return;
            } else {
                s.next = head;
                head = s;
            }
        }

        public void pop() {

            if (head == null) {
                System.out.println("node is empty");
            } else {
                head = head.next;
            }

        }

        public int top() {
            if (head == null) {
                return -1;
            }
            return head.data;

        }

        public void printnode() {
            node ll = head;
            while (ll != null) {
                System.out.print(ll.data + " ");
                ll = ll.next;
            }
            System.out.println();
        }

        public boolean isempty() {
            if (head == null) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        stack st = new stack();
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(10);
        st.push(8);
        st.printnode();
        st.pop();
        st.printnode();
        System.out.println(st.top());
        System.out.println(st.isempty());
    }
}
