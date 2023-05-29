public class usingll {
    static class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    static class queue {
        static Node head = null;
        static Node tail = null;

        public void add(int d) {
            Node newnode = new Node(d);
            if (head == null) {
                head = newnode;
                tail = newnode;
                return;
            } else {
                tail.next = newnode;
                tail = newnode;
            }
        }

        public int remove() {
            if (head == null && tail == null) {
                return -1;
            }
            if (head == tail) {
                tail = null;
            }
            int d = head.data;
            head = head.next;
            return d;
        }

        public int front() {
            if (head == null && tail == null) {
                return -1;
            }
            return head.data;
        }

        public boolean isEmpty() {
            if (head == null) {
                return true;
            } else {
                return false;
            }
        }

        public void printlist() {
            Node nn = head;
            while (nn != null) {
                System.out.print(nn.data + " ");
                ;
                nn = nn.next;
            }
        }
    }

    public static void main(String[] args) {
        queue q = new queue();
        q.add(10);
        q.add(12);
        q.add(14);
        q.add(100);
        q.remove();
        q.printlist();

    }
}
