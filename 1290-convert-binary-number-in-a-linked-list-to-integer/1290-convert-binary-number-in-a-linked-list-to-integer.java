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
    public int getDecimalValue(ListNode head) {
        ListNode curr=head;
        int num=0;
        int c1=count(head);
        while(curr!=null){
            num+=curr.val*Math.pow(2,c1-1);
            curr=curr.next;
            c1--;
        }
        return num;
    }
    int count(ListNode head1){
        int c=0;
        while(head1!=null){
            c++;
            head1=head1.next;
        }
        return c;
    }
}