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
        // if(head==null)
        //     return null;
        ListNode dummy=new ListNode(0,head);
        ListNode tail=dummy,curr=head;
        int eq=-101;
        while(curr!=null && curr.next!=null){
            if(curr.val==curr.next.val){
                eq=curr.val;
                curr=curr.next.next;
            }
            else if(curr.val==eq){
                curr=curr.next;
            }
            else{
               tail.next=curr;
               curr=curr.next;
               tail=tail.next;
            }
        }
        tail.next = (curr!=null && curr.val!=eq) ? curr : null;
        return dummy.next;
    }
}