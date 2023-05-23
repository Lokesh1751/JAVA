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
    public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode nextnode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextnode;
        }
        return prev;
    }
    public ListNode findmiddle(ListNode head){
       ListNode slow=head;
       ListNode fast=head;
       while(fast.next!=null && fast.next.next!=null){
           fast=fast.next.next;
            slow=slow.next;
       }
       return slow;
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null){
            return true;
        }
      // Approach => first reverse the secondhalf of the linked list and then compare from both ends if not equal then return false else return true
        ListNode middle=findmiddle(head);
        ListNode newhead=reverse(middle.next);
        ListNode firsthalf=head;
        while(newhead!=null){
            if(firsthalf.val!=newhead.val){
                return false;
            }
            firsthalf=firsthalf.next;
             newhead=newhead.next;
        }
        return true;

    }
}
