public class reversell {
    Node head=null;
    class Node{
        int data;
        Node next;
        Node(int d){
            this.data=d;
            this.next=null;
        }
    }
    public void addfirst(int d){
        Node newnode=new Node(d);
        if(head==null){
            head=newnode;
            return;
        }
        else{
            newnode.next=head;
        head=newnode;
        }
        
    }

    public void addlast(int d){
        Node newnode=new Node(d);
        if(head==null){
            head=newnode;
            return;
        }
        else{
            Node currnode=head;
            while(currnode.next!=null){
                currnode=currnode.next;
            }
            currnode.next=newnode;
        }
    }
    public void print(){
        Node currnode=head;
        while(currnode!=null){
            System.out.print(currnode.data+" ");
            currnode=currnode.next;
        }
        System.out.println();
    }
    public void reverselist(){
        if(head==null || head.next==null){
            return;
        }
        Node prevnode=head;
        Node currNode=head.next;
        while(currNode!=null){
            Node nextNode=currNode.next;
            currNode.next=prevnode;

            prevnode=currNode;
            currNode=nextNode;
        }
        head.next=null;
        head=prevnode;
    }
    public static void main(String[] args){
reversell rl=new reversell();
rl.addfirst(1);
rl.addfirst(2);
rl.addfirst(3);
rl.addfirst(4);
rl.addfirst(5);
rl.addlast(0);
System.out.print("Before Reverse: ");
rl.print();
rl.reverselist();
System.out.print("After Revere: ");
rl.print();
    }
}
 
