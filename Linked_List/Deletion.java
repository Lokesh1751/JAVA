import javax.print.attribute.Size2DSyntax;

public class basic {
    Node head = null;
    private int size;
    basic(){
        this.size=0;
    }

    class Node {
        String data;
        Node next;

        Node(String d) {
            this.data = d;
            this.next = null;
            size++;
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

    public void deletionfirst(){
        if(head==null){
            System.out.println("The List is empty");
            return;
        }
        size--;
        head=head.next;
    }
    public void deletionlast(){
         if(head==null){
            System.out.println("The List is empty");
            return;
        }
       
        else if(head.next!=null){
        Node secondlast=head;
        while(secondlast.next.next!=null){
            secondlast=secondlast.next;
        }
        secondlast.next=null;
        size--;
        }
        else{
            head=null;
            size--;
            return;
        }

    }
    public static void main(String[] args) {
        basic ll = new basic();
        ll.addfirst("Sujal");
        ll.addfirst("is");
        ll.addfirst("Name");
        ll.addfirst("My");
        ll.print();
       System.out.println(ll.size);
        ll.addlast("Angi");
ll.deletionfirst();
ll.deletionlast();
        ll.print();
        System.out.println(ll.size);

    }
}
