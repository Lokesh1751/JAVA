/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null){
            return null;
        }
        ListNode newnode=head;
        int si=0;
        while(newnode!=null){
newnode=newnode.next;
si++;
        }
        if(n==si){
            return head.next;
        }
        int f=si-n;
        int i=1;
        ListNode prev=head;
       
        while(i<f){
            prev=prev.next;
                 i++;
        }
        prev.next=prev.next.next;
        return head;
    }
}
