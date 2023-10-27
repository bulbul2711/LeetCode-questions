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
    public ListNode oddEvenList(ListNode head) {
        if(head==null)
            return null;
        ListNode odd=head,even=head.next;
        ListNode evenHead=even;
        while(even!=null && even.next!=null){
           odd.next=even.next;
           odd=odd.next;
           even.next=odd.next;
           even=even.next;
        }
        odd.next=evenHead;
        return head;
        // ListNode dummy1=new ListNode(0);
        // ListNode dummy2=new ListNode(0);
        // ListNode curr1=head;
        // ListNode curr2=head.next;
        //  ListNode tail1=dummy1;
        // ListNode tail2=dummy2;
        // while(curr2!=null && curr2.next!=null){
        //     tail1.next=curr1;
        //     curr1=curr1.next.next;
        //     tail1=tail1.next;
        //     tail2.next=curr2;
        //     curr2=curr2.next.next;
        //     tail2=tail2.next;
        // }
        // tail1.next=dummy2;
        // return dummy1.next;
    }
}