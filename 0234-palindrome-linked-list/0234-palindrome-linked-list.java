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
        ListNode curr=slow;
         ListNode prev=null;
         ListNode Next=curr.next;
         while(curr!=null){
             Next=curr.next;
             curr.next=prev;
             prev=curr;
             curr=Next;
         }
    while(prev!=null){
        if(prev.val!=head.val)
            return false;
        head=head.next;
        prev=prev.next;
    }
        return true;
   }
}
