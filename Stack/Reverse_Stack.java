import java.util.*;

public class reverseastack {
    public static void pushbottom(int data, Stack<Integer> s) {
        if (s.isEmpty()) {
            s.push(data);
            return;

        }
        int top = s.pop();
        pushbottom(data, s);
        s.push(top);
    }

    public static void reversest(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reversest(s);
        pushbottom(top, s);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(11);
        s.push(13);
        s.push(18);
        s.push(17);
        reversest(s);
        while (!s.isEmpty()) {
            System.out.print(s.peek() + " ");
            s.pop();
        }
        System.out.println();
    }
}
