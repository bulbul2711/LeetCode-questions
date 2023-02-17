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
    public ListNode middleNode(ListNode head) {
      /*  if(head==null)
            return head;
        ListNode slow=head,fast=head;
        while(fast.next!=null && fast!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;*/
        int c=0;
        if(head==null)
            return head;
        ListNode curr1=head;
        for(ListNode curr=head;curr!=null;curr=curr.next)
            c++;
        for(int i=0;i<c/2;i++)
            curr1=curr1.next;
        return curr1;
    }
}