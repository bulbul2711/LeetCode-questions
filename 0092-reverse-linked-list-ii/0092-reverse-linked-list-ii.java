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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        
        if(left==right)
            return head;
        ListNode dummy=new ListNode(0,head);
        ListNode curr1=dummy;
        int c=0;
        while(c!=left-1){
            curr1=curr1.next;
            c++;
        }
        int a=right-left+1;
        ListNode prev=null,curr=curr1.next,nxt=null;
        while(a!=0){
            nxt=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nxt;
            a--;
        }
        curr1.next.next=curr;
        curr1.next=prev;
        return dummy.next;
    }
}