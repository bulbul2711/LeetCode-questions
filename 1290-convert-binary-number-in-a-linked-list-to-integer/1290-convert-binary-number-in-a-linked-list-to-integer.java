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
       // ListNode curr=head;int c=0;
        int sum=0;
       /* while(curr!=null){
            c++;
            curr=curr.next;
        }
        c=c-1;
        while(head!=null){
            sum+=(Math.pow(2,c--)*head.val);
            head=head.next;
        }
        return sum;*/
        while(head!=null){
            sum=sum*2+head.val;
            head=head.next;
        }
        return sum;
    }
}