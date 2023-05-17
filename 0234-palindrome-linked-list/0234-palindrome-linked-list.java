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
    public boolean isPalindrome(ListNode head) {
       ListNode slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
       ListNode newhead= reverse(slow);
    while(newhead!=null){
        if(newhead.val!=head.val)
            return false;
        head=head.next;
        newhead=newhead.next;
    }
        return true;
}
    ListNode reverse(ListNode head1){
         ListNode curr=head1;
         ListNode prev=null;
         ListNode Next=curr.next;
         while(curr!=null){
             Next=curr.next;
             curr.next=prev;
             prev=curr;
             curr=Next;
         }
         return prev;
     }
}
