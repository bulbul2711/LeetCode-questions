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
        ListNode dummy=new ListNode(0,head);
        ListNode left=dummy,curr=head;
        while(n-1>0){
            curr=curr.next;
            n--;
        }
        while(curr.next!=null){
            left=left.next;
            curr=curr.next;
        }
        left.next=left.next.next;
        return dummy.next;
    }
}