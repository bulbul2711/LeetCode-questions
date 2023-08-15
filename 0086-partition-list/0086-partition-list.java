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
    public ListNode partition(ListNode head, int x) {
        ListNode dummy1=new ListNode(0);
        ListNode dummy2=new ListNode(0);
        ListNode tail1=dummy1,tail2=dummy2;
        ListNode curr=head;
        while(curr!=null){
            if(curr.val<x){
                tail1.next=curr;
                tail1=tail1.next;
            }
            else{
                tail2.next=curr;
                tail2=tail2.next;
            }
            curr=curr.next;
        }
        tail1.next=dummy2.next;
        tail2.next=null;
        return dummy1.next;
    }
}