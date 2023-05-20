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
    public ListNode swapPairs(ListNode head) {
        ListNode dummy=new ListNode(0,head);
        ListNode curr=dummy;
        while(curr.next!=null && curr.next.next!=null){
            ListNode temp1=curr.next;
            ListNode temp2=curr.next.next;
            curr.next=temp2;
            temp1.next=temp2.next;
            temp2.next=temp1;
            curr=temp1;
        }
        return dummy.next;
    }
}