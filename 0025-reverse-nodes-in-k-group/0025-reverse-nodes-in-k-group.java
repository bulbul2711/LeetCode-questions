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
    public ListNode reverseKGroup(ListNode head, int k) {
        int c=0;
        ListNode temp=head;
        while(temp!=null && c!=k){
            temp=temp.next;
            c++;
        }
        if(c<k)
            return head;
        ListNode dummy=head;
        ListNode prev=null,curr=head,nxt=null;
        while(c>0){
            nxt=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nxt;
            c--;
        }
        dummy.next=reverseKGroup(curr,k);
        return prev;
    }
}