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
    public ListNode mergeNodes(ListNode head) {
        ListNode curr=head;
        ListNode tail=head.next;
        int sum=0;
        while(tail!=null){
            if(tail.val!=0){
                sum+=tail.val;
                tail=tail.next;
            }
            else{
            ListNode newlist=new ListNode(sum);
            curr.next=newlist;
           // newlist.next=tail.next;
            sum=0;
            tail=tail.next;
            curr=curr.next;
        }
        }
        return head.next;   
    }
}