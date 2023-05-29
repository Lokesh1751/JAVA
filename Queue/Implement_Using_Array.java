import java.util.*;

public class implementusingarray {
    static class queue {
        static int arr[];
        static int size;
        static int rear = -1;

        queue(int n) {
            arr = new int[n];
            this.size = n;
        }

        public static boolean isEmpty() {
            if (rear == -1) {
                return true;
            } else {
                return false;
            }
        }

        public static void add(int d) {
            if (rear == size - 1) {
                System.out.println("Full Queue");
                return;
            } else {
                rear = rear + 1;
                arr[rear] = d;
            }
        }

        public static int remove() {
            if (isEmpty()) {
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
            return front;
        }

        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            int front = arr[0];
            return front;
        }
    }

    public static void main(String[] args) {
        queue q = new queue(6);
        q.add(10);
        q.add(11);
        q.add(12);
        q.add(15);

        while (!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            q.remove();
        }
        System.out.println(q.remove());

    }
}
