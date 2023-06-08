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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null) 
            return head;
        ListNode curr=head;
        ListNode curr1=head;
        int len=1;
        while(curr.next!=null){
            len++;
            curr=curr.next;
        }
       
        curr1=curr;
        k=k%len;
         if(k==0)
            return head;
        int c=len-k-1;
        curr=head;
        while(c>0){
            curr=curr.next;
            c--;
        }
        ListNode newhead=curr.next;
        curr.next=null;
         curr1.next=head;
        return newhead;
    }
}