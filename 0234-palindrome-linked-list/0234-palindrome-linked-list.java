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
        
        //TC:o(n), AS:O(n)
   /*     ListNode head1=head;
      ArrayDeque<Integer> stack=new ArrayDeque<>();
        for(ListNode curr=head;curr!=null;curr=curr.next){
            stack.push(curr.val);
        }
        for(ListNode curr=head1;curr!=null;curr=curr.next){
            if(curr.val!=stack.pop())
                return false;
        }
        return true;*/
        if(head==null || head.next==null) return true;
        ListNode slow=head,fast=head,curr=head;
        while(fast!=null && fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode headOfreversed=reverse(slow.next);
        while(headOfreversed!=null){
            if(curr.val!=headOfreversed.val)
                return false;
            curr=curr.next;
            headOfreversed=headOfreversed.next;
        }
        return true;
    }
        ListNode reverse(ListNode head1){
            if(head1==null || head1.next==null)
                return head1;
            ListNode prev=null,curr1=head1;
            while(curr1!=null){
                ListNode next=curr1.next;
                curr1.next=prev;
                prev=curr1;
                curr1=next;
             }
            return prev;
        }
}
