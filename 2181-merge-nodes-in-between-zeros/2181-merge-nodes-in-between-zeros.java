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
                tail.val=sum;
                curr.next=tail;
                curr=curr.next;
                tail=tail.next;
                sum=0;
            }
        }
        return head.next;   
    }
}