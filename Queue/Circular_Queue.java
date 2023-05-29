import java.util.*;

public class Circularqueue {
    static class queue {
        static int arr[];
        static int size;
        static int rear = -1;
        static int front = -1;

        queue(int n) {
            arr = new int[n];
            this.size = n;
        }

        public static boolean isEmpty() {
            if (rear == -1 && front == -1) {
                return true;
            } else {
                return false;
            }
        }

        public static boolean isFull() {
            if ((rear + 1) % size == front) {
                return true;
            } else {
                return false;
            }
        }

        public static void add(int d) {
            if (isFull()) {
                System.out.println("Full Queue");
                return;
            }
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = d;

        }

        public static int remove() {
            if (isEmpty()) {
                return -1;
            }
            int result = arr[front];
            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return result;
        }

        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            int result = arr[front];
            return result;
        }
    }

    public static void main(String[] args) {
        queue q = new queue(4);
        q.add(10);
        q.add(11);
        q.add(12);
        q.add(15);

        System.out.println(q.remove());
        q.add(1676);
        while (!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            q.remove();
        }

    }
}
