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
        ListNode curr=head.next;int sum=0;
        ListNode head1=head,tail=head;
        while(curr!=null){
             while(curr.val!=0){
                sum+=curr.val;
                curr=curr.next;
            } 
            curr.val=sum;
            tail.next=curr;
            tail=curr;
            curr=curr.next;
            sum=0;
           //  System.out.print(sum+" ");
           // ListNode new_node=new ListNode(sum);
           //  tail.next=new_node;
           //  tail=new_node;
           //  curr=curr.next;
           //  sum=0;
        }
        return head1.next;
    }
}