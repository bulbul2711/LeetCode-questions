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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null)
            return null;
        ListNode curr=head;
        ListNode curr1=curr.next;
        while(curr1!=null){
            if(curr.val==curr1.val)
                curr1=curr1.next;
            else{
                curr.next=curr1;
                curr=curr.next;
                curr1=curr1.next;
            }
        }
        curr.next=null;
        return head;
    }
}