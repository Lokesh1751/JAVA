import java.util.*;

public class pushatbottomofstack {
    public static void pushbottom(int data, Stack<Integer> s) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushbottom(data, s);
        s.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(11);
        s.push(13);
        s.push(18);
        s.push(17);
        pushbottom(222, s);
        while (!s.isEmpty()) {
            System.out.print(s.peek() + " ");
            s.pop();
        }
        System.out.println();
    }
}
