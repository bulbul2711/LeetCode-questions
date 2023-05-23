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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode curr=head,curr1=head;
        int c=0,c1=1,c2=1;
        while(curr!=null){
            curr=curr.next;
            c++;
        }
        curr=head;
        while(c1!=k){
            curr=curr.next;
            c1++;
        }
        int val1=curr.val;
        while(c2!=c-c1+1){
            curr1=curr1.next;
            c2++;
        }
        int val2=curr1.val;
        curr.val=val2;
        curr1.val=val1;
        return head;
    }
}