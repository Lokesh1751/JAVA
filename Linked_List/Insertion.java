public class basic {
  //SINGLY LINKED LIST
    Node head = null;

    class Node {
        String data;
        Node next;

        Node(String d) {
            this.data = d;
            this.next = null;
        }
    }

    public void addfirst(String data) {
        Node newnNode = new Node(data);
        if (head == null) {
            head=newnNode;
            return;
        }
       else{
        newnNode.next = head;
        head = newnNode;
       }

    }

    public void addlast(String data) {
        Node newnode = new Node(data);
        if (head == null) {
           head=newnode;
            return;
        }
        else{
            Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newnode;
        }
    }

    public void print() {
        Node newnode = head;
        if(head==null){
            System.out.println("NULL");
        }
        while (newnode != null) {
            System.out.print(newnode.data + " ");
            newnode = newnode.next;
        }
    }

    public static void main(String[] args) {
        basic ll = new basic();
        ll.addfirst("Sujal");
        ll.addfirst("is");
        ll.addfirst("Name");
        ll.addfirst("My");
        ll.addlast("Angi");

        ll.print();

    }
}
