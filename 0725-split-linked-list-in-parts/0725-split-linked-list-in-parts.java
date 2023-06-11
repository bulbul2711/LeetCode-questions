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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode curr=head;
        ListNode a[]=new ListNode[k];
        ListNode prev=null;
        int i=0,len=0;
        while(curr!=null){
            len++;
            curr=curr.next;
        }
        int eachpartsize=len/k;
        int extra=len%k;
        curr=head;
        while(curr!=null){
            int size=eachpartsize;
            a[i]=curr;
            while(size>0){
                prev=curr;
                curr=curr.next;
                size--;
            }
            if(extra>0){
                prev=curr;
                curr=curr.next;
                extra--;
            }
            if(prev!=null){
                prev.next=null;
            }
            i++;
        }
        return a;
    }
}